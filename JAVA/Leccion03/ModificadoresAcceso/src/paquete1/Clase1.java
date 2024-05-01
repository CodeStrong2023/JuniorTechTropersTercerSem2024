
package paquete1;

public class Clase1 {
    public String atibutoPublic = "Valor atributo publico";
    protected String atributoProtected = "Valor atributo protected";
    
    public Clase1(){
        System.out.println("Constructor public");
    }
    
    protected Clase1(String atributoPublico){
        System.out.println("Constructor protected");
    }
    
    public void metodoPublico(){
        System.out.println("Metodo publico");
    }
    
    protected void metodoProtected(){
        System.out.println("Metodo protected");
    }
}