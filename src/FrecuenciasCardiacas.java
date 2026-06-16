import java.time.LocalDate;
import java.time.Period;

public class FrecuenciasCardiacas {

    // Atributos
    private String nombre;
    private String apellido;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anioNacimiento;

    public FrecuenciasCardiacas(String nombre,
                                String apellido,
                                int diaNacimiento,
                                int mesNacimiento,
                                int anioNacimiento) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.anioNacimiento = anioNacimiento;
    }

    // Metodos para Obtener y Establecer
    public void setNombre(String nombre) {this.nombre = nombre;}

    public void setApellido(String apellido) {this.apellido = apellido;}

    public void setDiaNacimiento(int diaNacimiento){this.diaNacimiento = diaNacimiento;}

    public void setMesNacimiento(int mesNacimiento){this.mesNacimiento = mesNacimiento;}

    public void setAnioNacimiento(int anioNacimiento){this.anioNacimiento = anioNacimiento;}

    public String getNombre(){return nombre;}

    public String getApellido(){return apellido;}

    public int getDiaNacimiento(){return diaNacimiento;}

    public int getMesNacimiento(){return mesNacimiento;}

    public int getAnioNacimiento(){return anioNacimiento;}

    //Metodos de calculo
    public int calcularEdad(){
        LocalDate fechaNacimiento =
                LocalDate.of(anioNacimiento,mesNacimiento,diaNacimiento);

        if(fechaNacimiento.isAfter(LocalDate.now())){
            throw new IllegalArgumentException(
                    "La fecha de nacimiento no puede ser futura"
            );
        }

        return Period.between(fechaNacimiento,LocalDate.now()).getYears();
    }
}
