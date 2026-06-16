/**
 * Integrantes
 * - Fiestas Anton Manuel Aldair
 * - Nima Erazo Nilson Cristobal
 * - Muñoz Jabo frank
 */
import java.time.DateTimeException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainFrecuencias {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);

        while(true){
            try{

                // Leer Datos
                System.out.print("Ingrese el nombre: ");
                String nombre = scanner.nextLine();

                System.out.print("Ingrese el apellido: ");
                String apellido = scanner.nextLine();

                System.out.print("Ingrese su dia de nacimiento: ");
                int diaNacimiento = scanner.nextInt();

                System.out.print("Ingrese su mes de nacimiento: ");
                int mesNacimiento = scanner.nextInt();

                System.out.print("Ingrese su año de nacimiento: ");
                int anioNacimiento = scanner.nextInt();

                // Crear Objetos
                FrecuenciasCardiacas persona = new FrecuenciasCardiacas(nombre,
                        apellido, diaNacimiento, mesNacimiento, anioNacimiento);

                // Mostrar Resultados

                int edad = persona.calcularEdad();
                int frecuenciaMaxima = persona.calcularFrecuenciaCardiacaMaxima();
                double[] rango = persona.calcularFrecuenciaCardiacaEsperada();

                System.out.println("\n===== RESULTADOS =====");

                System.out.println("Nombre: "
                        + persona.getNombre()
                        + " "
                        + persona.getApellido());

                System.out.println("Edad: "
                        + edad
                        + " años");

                System.out.println("Frecuencia cardíaca máxima: "
                        + frecuenciaMaxima
                        + " latidos por minuto");

                System.out.println("Rango esperado: "
                        + rango[0]
                        + " - "
                        + rango[1]
                        + " latidos por minuto");

            }catch(InputMismatchException e){
                System.out.println(
                        "Error: Debe ingresar valores numericos validos"
                );
                scanner.nextLine();
            }catch(DateTimeException e){
                System.out.println(
                        "Error: La fecha ingresada no es valida"
                );
                scanner.nextLine();
            }catch(IllegalArgumentException e){
                System.out.println(
                        "Erro: " + e.getMessage()
                );
                scanner.nextLine();
            }
        }

    }
}
