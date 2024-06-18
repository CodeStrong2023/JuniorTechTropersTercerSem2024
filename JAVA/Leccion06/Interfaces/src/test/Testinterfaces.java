
package test;

import accesodatos.*;


public class TestInterfaces {
    public static void main(String[] args) {
       IAccesoDatos datos = new ImplementacionMySql(); 
       //datos.listar(); //El metodo que se va a ejecutar es el de la clase que esta implementando la interface
       //Una misma variable puede apuntar a distintas implementaciones
       //imprimir(datos);
       datos = new ImplementacionOracle();
       //datos.listar();
       imprimir(datos);
    }
    
    public static void imprimir(IAccesoDatos datos){
        datos.listar();
    }
}