
package domain;

public enum TipoEscritura {
    CLASICO("Escritura a mano"),
    MODERNO("Escritura Digital");
    
    private final String descripcion;
    
    //CONSTRUCTOR
    private TipoEscritura(String descripcion){
        this.descripcion = descripcion;
    }
    
    //METODO GET
    public String getDescripcion(){
        return this.descripcion;
    }
}
