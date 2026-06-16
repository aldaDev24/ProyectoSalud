

import java.util.Scanner;
import java.util.InputMismatchException;
import java.time.LocalDate;
import java.time.DateTimeException;
import java.util.Arrays;
import java.util.List;

public class MainPerfilMedico {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("   SISTEMA DE REGISTRO MÉDICO (BMI)     ");

        String nombre = pedirTexto("Ingrese su primer nombre: ");
        String apellido = pedirTexto("Ingrese su apellido: ");
        String sexo = pedirTexto("Ingrese su sexo (M/F): ");

        System.out.println("\nFecha de Nacimiento ");
        int anio = pedirEntero("Ingrese su año de nacimiento : ");
        int mes = pedirEntero("Ingrese su mes de nacimiento: ");
        int dia = pedirEntero("Ingrese su día de nacimiento : ");

        System.out.println("\n Medidas Físicas");
        double altura = pedirDecimal("Ingrese su altura en METROS : ");
        double peso = pedirDecimal("Ingrese su peso en KG : ");

        try {
            LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);

            PerfilMedico paciente = new PerfilMedico(nombre, apellido, sexo, fechaNacimiento, altura, peso);

            int[] rangoFrecuencia = paciente.calcularFrecuenciaCardiacaEsperada();

            System.out.println(" RESULTADOS MÉDICOS  ");
            System.out.println("Paciente: " + paciente.obtenerNombre() + " " + paciente.obtenerApellido());
            System.out.println("Sexo: " + paciente.obtenerSexo());
            System.out.println("Fecha de Nacimiento: " + paciente.obtenerFechaNacimiento());
            System.out.println();
            System.out.printf("Índice de Masa Corporal (BMI): %.2f\n", paciente.calcularIMC());
            System.out.println("Frecuencia Cardiaca Máxima: " + paciente.calcularFrecuenciaCardiacaMaxima() + " latidos/min");
            System.out.println("Rango de Frecuencia Esperada: " + rangoFrecuencia[0] + " - " + rangoFrecuencia[1] + " latidos/min");

            mostrarTablaBMI();

        } catch (DateTimeException e) {
            System.out.println("\nLa fecha de nacimiento ingresada no es válida en el calendario.");
        }
        scanner.close();
    }

    private static String pedirTexto(String mensaje) {
        String texto = "";
        while (texto.trim().isEmpty()) {
            System.out.print(mensaje);
            texto = scanner.nextLine();
            if (texto.trim().isEmpty()) {
                System.out.println("El campo no puede estar vacío.");
            }
        }
        return texto;
    }

    private static int pedirEntero(String mensaje) {
        int numero = 0;
        boolean valido = false;
        while (!valido) {
            System.out.print(mensaje);
            try {
                numero = scanner.nextInt();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar un número entero válido.");
                scanner.next();
            }
        }
        scanner.nextLine();
        return numero;
    }

    private static double pedirDecimal(String mensaje) {
        double numero = 0;
        boolean valido = false;
        while (!valido) {
            System.out.print(mensaje);
            try {
                numero = scanner.nextDouble();
                if (numero <= 0) {
                    System.out.println("El valor debe ser mayor a 0.");
                } else {
                    valido = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar un valor numérico.");
                scanner.next();
            }
        }
        scanner.nextLine();
        return numero;
    }

    private static void mostrarTablaBMI() {
        System.out.println("\n VALORES ESTÁNDAR DEL BMI ");
        List<String> tablaBmi = Arrays.asList(
                "Bajo peso: menos de 18.5",
                "Normal: entre 18.5 y 24.9",
                "Sobrepeso: entre 25 y 29.9",
                "Obeso: 30 o más"
        );

        tablaBmi.stream()
                .map(linea -> "-> " + linea)
                .forEach(System.out::println);
    }
}