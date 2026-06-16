
import java.time.LocalDate;
public class PerfilMedico {
    String nombre;
    String apellido;
    String sexo;
    LocalDate fechaNacimiento;
    double altura;
    double peso;

    public PerfilMedico(String nombre, String apellido, String sexo, LocalDate fechaNacimiento, double altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;   
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.peso = peso;
        }
        //metodos obtener
    public String obtenerNombre() {
        return nombre;
    }
    public String obtenerApellido() {
        return apellido;
    }
    public String obtenerSexo() {
        return sexo;
    }
    public LocalDate obtenerFechaNacimiento() {
        return fechaNacimiento; 
    }
    public double obtenerAltura() {
        return altura;
    }
    public double obtenerPeso() {
        return peso;
    }

    //metodos establecer
    void establecerNombre(String nombre) {
        this.nombre = nombre;
    }
    void establecerApellido(String apellido) {
        this.apellido = apellido;
    }
    void establecerSexo(String sexo) {
        this.sexo = sexo;
    }
    void establecerFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    void establecerAltura(double altura) {
        this.altura = altura;
    }
    void establecerPeso(double peso) {
        this.peso = peso;
    }   

    //metodos calculadores
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
