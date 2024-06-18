
package test;

import aritmetica.Aritmetica;
import excepciones.OperacionExcepcion;


public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        try{
            resultado = Aritmetica.division(10, 0);
        }catch(OperacionExcepcion e){
            System.out.println("Ocurrió un error de tipo OperacionExcepcion");
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println("Ocurrió un error de la gran flauta");
            e.printStackTrace(System.out); //Se conoce como la pila de excepciones
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Se reviso la división entre cero");
        }
        System.out.println("La variable de resultado tiene como valor: " + resultado);
    }
}