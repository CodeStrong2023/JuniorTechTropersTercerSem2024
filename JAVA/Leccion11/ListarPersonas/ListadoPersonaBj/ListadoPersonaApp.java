package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersmaApp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Definimos las lista fuera deñ ciclo while
        List<Persona> personas = new ArrayList<>();

        // Empezamos con el menu
        var salir = false;
        while (!salir) {
            mostrarMenu();
            try {
                salir = ejecutarOperacion(entrada, personas);
            } catch (Exception e) {
                System.out.println("Ocurrio un error: " + e.getMessage());
            }

            System.out.println();
        } //Fin del ciclo while

    }// Fin método main

    private static void mostrarMenu() {
        // Mostramos las opciones
        System.out.print("""
                ******** Listado de Personas *********
                1. Agregar
                2. Listar
                3. Salir
                """);
        System.out.print("Digite una de las opciones: ");
    } // Fin método mostrarMenu

    private static boolean ejecutarOperacion(Scanner entrada, List<Persona> personas) {
        var opcion = Integer.parseInt(entrada.nextLine());
        var salir = false;

        // Revisamos la opción digitada a través de un switch
        switch (opcion) {
            case 1 -> {// Agregar una persona a lista
                System.out.print("Digite el nombre: ");
                var nombre = entrada.nextLine();
                System.out.print("Digite el telefono: ");
                var tel = entrada.nextLine();
                System.out.print("Digite el correo: ");
                var email = entrada.nextLine();
                // creamos el objeto persona
                var persona = new Persona(nombre, tel, email);
                // Agregamos la persona a la lista
                personas.add(persona);
                System.out.println("La lista tiene: " + personas.size() + " elementos");
            }// Fin caso 1
            case 2 -> { // Listar a las personas
                System.out.println("Listado de personas: ");
                // Mejoras con lambda y el método de referencia
                //personas.forEach((persona) -> System.out.println(persona));
                personas.forEach(System.out::println);
            }// Fin caso 2
            case 3 -> { // Salir del ciclo
                System.out.println("Hasta pronto...");
                salir = true;
            } // Fin caso 3
            default -> System.out.println("Opción incorrecta: " + opcion);
        } // Fin del switch
        return salir;

    }// Fin del método ejecutarOperacion

}// Fin de ña clase ListadoPersonasApp