
package test;

import domain.*;

public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO); //Le pasamos los parametros a la clase hija
        System.out.println("empleado = " + empleado);
        System.out.println(empleado.obtenerDetalles()); //Si queremos acceder a metodos Escritor
        //empleado.getTipoEscritura(); NO SE PUEDE HACER
        
        //DOWNCASTING
        //((Escritor)empleado).getTipoEscritura(); //Hay dos opciones: 1
        //Escritor escritor = (Escritor)empleado; //2
        escritor.getTipoEscritura();
        
        
        //UPCASTING
        //Empleado empleado2 = escritor;
        //System.out.println(empleado2.obtenerDetalles());
    }
   
}
