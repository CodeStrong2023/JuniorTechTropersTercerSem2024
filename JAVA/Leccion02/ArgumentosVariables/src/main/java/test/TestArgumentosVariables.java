package test;

public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(3, 4, 5);
        imprimirNumeros(1, 2);
        variosParametros("Juan", "Perez", 7, 8, 9);
    }

    private static void variosParametros(String nombre, String apellido, int... numeros) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Nombre: " + nombre + " Apellido: " + apellido);
        imprimirNumeros(numeros);
    }

    // Se convierte en un arreglo
    //... argumentos variables
    private static void imprimirNumeros(int... numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elementos: " + numeros[i]);
        }
    }
}
