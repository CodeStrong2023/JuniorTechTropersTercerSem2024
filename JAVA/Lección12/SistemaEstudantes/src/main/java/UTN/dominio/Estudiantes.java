package UTN.dominio;

public class Estudiante {
    private int idEstuduiante;
    private String nombre;
    private String apellido;
    private String telfono;
    private String email;

    public Estudiante(){} // Constructor vacio

    public Estudiante(int idEstuduiante){ // Cosntructor para la llave primaria
        this.idEstuduiante = idEstuduiante;
    }

    // Constructor para insertar uyn nuevo estudiante
    public Estudiante(String nombre, String apellido, String telfono, String email){
        this.nombre = nombre;
        this.apellido = apellido;
        this.telfono = telfono;
        this.email = email;
    }

    // Constructor para modicar
    public Estudiante(int idEstuduiante,String nombre, String apellido, String telfono, String email){
        this.idEstuduiante = idEstuduiante;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telfono = telfono;
        this.email = email;
    }

    public int getIdEstuduiante() {
        return idEstuduiante;
    }

    public void setIdEstuduiante(int idEstuduiante) {
        this.idEstuduiante = idEstuduiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelfono() {
        return telfono;
    }

    public void setTelfono(String telfono) {
        this.telfono = telfono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "idEstuduiante=" + idEstuduiante +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telfono='" + telfono + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}