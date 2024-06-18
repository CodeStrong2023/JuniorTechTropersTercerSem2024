//CLASE JAVA BEANS:
package domain;

import java.io.Serializable; // Debe ser serializable, al momento de pasar de un servidor a otro, se convierte en 0 y 1


public class Persona implements Serializable{
    private String nombre;  //Requerimiento: atributos tipo private
    private String apellido;
    
    //Requerimiento: Costructor vacio
    public Persona(){
        
    }
    //Requerimiento: aplicar getters and setters con encapsulamiento
    
    public Persona(String nombre,String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
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

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
    
}
