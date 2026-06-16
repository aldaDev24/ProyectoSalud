
import java.time.LocalDate;
public class PerfilMedico {
    String nombre;
    String apellido;
    String sexo;
    short diaNacimiento;
    short mesNacimiento;
    short anioNacimiento;
    double altura;
    double peso;

    public PerfilMedico(String nombre, String apellido, String sexo, short diaNacimiento, short mesNacimiento, short anioNacimiento, double altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.anioNacimiento = anioNacimiento;
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
    public short obtenerDiaNacimiento() {
        return diaNacimiento;
    }
    public short obtenerMesNacimiento() {
        return mesNacimiento;
    }
    public short obtenerAnioNacimiento() {
        return anioNacimiento;
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
    void establecerDiaNacimiento(short diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }
    void establecerMesNacimiento(short mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }
    void establecerAnioNacimiento(short anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
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
    public int calcularFrecuenciaCardiacaMaxima() {
        FrecuenciasCardiacas a = new FrecuenciasCardiacas(nombre, apellido, diaNacimiento, mesNacimiento, anioNacimiento);
        return a.calcularFrecuenciaCardiacaMaxima();
    }

    public double[] calcularFrecuenciaCardiacaEsperada() {
        FrecuenciasCardiacas a = new FrecuenciasCardiacas(nombre, apellido, diaNacimiento, mesNacimiento, anioNacimiento);
        return a.calcularFrecuenciaCardiacaEsperada();
    }
}   
