package test;

import domain.Persona;

public class TestForEach {
    public static void main(String[] args) {
        int edades[] = {5, 6, 8, 9}; //Sintaxis Resumida
        for (int edad : edades) { //Sintacis del ForEach
            System.out.println("edad = " + edad);
        }

        // TODO un arregalo de objetos
        Persona personas[] = {new Persona("Juan"),new Persona("Carla"),new Persona("Beatriz")};
        for (Persona persona:personas) { // Arreglo tipo objeto
            System.out.println("Persona = "+persona);
        }

    }


}
