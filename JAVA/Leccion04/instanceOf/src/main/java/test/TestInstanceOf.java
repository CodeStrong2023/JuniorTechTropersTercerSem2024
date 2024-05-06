package test;

import domain.Empleado;
import domain.Gerente;

public class TestInstanceOf {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 1000);
        //determinarTipo(empleado1);
        empleado1 = new Gerente("Nelson", 2000, "Sistema");
        determinarTipo(empleado1);
    }

    //Polimorfismo
    public static void determinarTipo(Empleado empleado) {
        if (empleado instanceof Gerente) {
            System.out.println("Es de tipo Gerente");
        }
        else if (empleado instanceof Empleado) {
            System.out.println("Es de tipo empleado");
        }
        else if (empleado instanceof Object) {
            System.out.println("Es de tipo Object");
        }
    }
}
