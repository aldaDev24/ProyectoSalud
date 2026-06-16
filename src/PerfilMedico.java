
import java.time.LocalDate;
public class PerfilMedico {
    String nombre;
    String apellido;
    LocalDate fechaNacimiento;
    double altura;
    double peso;

    public PerfilMedico(String nombre, String apellido, LocalDate fechaNacimiento, double altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.peso = peso;
        }
    public String obtenerNombre() {
        return nombre;
    }
    public String obtenerApellido() {
        return apellido;
    }
    public LocalDate obtenerFechaNacimiento() {
        return fechaNacimiento; 
    }
    public double obtenerAltura() {
        return altura;
    }public double obtenerPeso() {
        return peso;
    }
    public double calcularIMC() { 
        return peso / (Math.pow(altura, 2));
    }
    public int calcular frecuenciaCardiacaMaxima() {
        FrecuenciaCardiaca a = new FrecuenciaCardiaca();
        return a.calcularFrecuenciaCardiacaMaxima(fechaNacimiento);
    }

    public int[] calcular frecuenciaCardiacaEsperada() {
        FrecuenciaCardiaca a = new FrecuenciaCardiaca();
        return a.calcularFrecuenciaCardiacaEsperada(fechaNacimiento);
    }
}   
