import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculadoraUTN {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Inicializamos el objeto Scanner para leer la entrada del usuario
        List<Double> historial = new ArrayList<>(); // Lista para almacenar el historial de resultados

        while (true) { // Bucle infinito para mostrar el menú repetidamente hasta que el usuario decida salir
            System.out.println("******* Aplicacion Calculadora *******");
            mostrarMenu(); // Mostramos el menú de operaciones

            try {
                var operacion = Integer.parseInt(entrada.nextLine()); // Leemos la opción del usuario
                if (operacion >= 1 && operacion <= 7) { // Si la opción es válida, ejecutamos la operación
                    ejecutarOperacion(operacion, entrada, historial);
                } else if (operacion == 8) { // Si la opción es mostrar el historial
                    mostrarHistorial(historial); // Mostramos el historial de resultados
                } else if (operacion == 9) { // Si la opción es salir
                    System.out.println("Hasta pronto!");
                    break; // Salimos del bucle
                } else { // Si la opción es inválida
                    System.out.println("Opcion erronea: " + operacion);
                }
                System.out.println(); // Línea en blanco para formato
            } catch (Exception e) { // Capturamos cualquier excepción que ocurra
                System.out.println("Ocurrio un error: " + e.getMessage());
                System.out.println(); // Línea en blanco para formato
            }
        }
    }

    private static void mostrarMenu() { // Método para mostrar el menú de opciones
        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicacion
                4. Division
                5. Potencia
                6. Raiz Cuadrada
                7. Modulo
                8. Mostrar Historial
                9. Salir
                """);
        System.out.print("Operacion a realizar? ");
    }

    private static void ejecutarOperacion(int operacion, Scanner entrada, List<Double> historial) {
        double operando1 = 0, operando2 = 0, resultado = 0; // Inicializamos las variables para los operandos y el resultado

        if (operacion != 6) { // Si la operación no es raíz cuadrada, pedimos el primer operando
            System.out.print("Digite el valor para el operando1: ");
            operando1 = Double.parseDouble(entrada.nextLine()); // Leemos el primer operando
        }

        if (operacion >= 1 && operacion <= 5 || operacion == 7) { // Si la operación requiere un segundo operando
            System.out.print("Digite el valor para el operando2: ");
            operando2 = Double.parseDouble(entrada.nextLine()); // Leemos el segundo operando
        }

        switch (operacion) { // Realizamos la operación correspondiente
            case 1 -> {
                resultado = operando1 + operando2;
                System.out.println("Resultado de la suma: " + resultado);
            }
            case 2 -> {
                resultado = operando1 - operando2;
                System.out.println("Resultado de la resta: " + resultado);
            }
            case 3 -> {
                resultado = operando1 * operando2;
                System.out.println("Resultado de la multiplicacion: " + resultado);
            }
            case 4 -> {
                if (operando2 == 0) { // Verificamos si el segundo operando es cero para evitar división por cero
                    System.out.println("Error: Division por cero");
                    return; // Salimos del método para evitar agregar un resultado no válido al historial
                }
                resultado = operando1 / operando2;
                System.out.println("Resultado de la division: " + resultado);
            }
            case 5 -> {
                resultado = Math.pow(operando1, operando2); // Calculamos la potencia
                System.out.println("Resultado de la potencia: " + resultado);
            }
            case 6 -> {
                System.out.print("Digite el valor para el operando (Raiz Cuadrada): ");
                operando1 = Double.parseDouble(entrada.nextLine()); // Leemos el operando para la raíz cuadrada
                if (operando1 < 0) { // Verificamos si el operando es negativo
                    System.out.println("Error: No se puede calcular la raiz cuadrada de un numero negativo");
                    return; // Salimos del método para evitar agregar un resultado no válido al historial
                }
                resultado = Math.sqrt(operando1); // Calculamos la raíz cuadrada
                System.out.println("Resultado de la raiz cuadrada: " + resultado);
            }
            case 7 -> {
                resultado = operando1 % operando2; // Calculamos el módulo
                System.out.println("Resultado del modulo: " + resultado);
            }
        }
        historial.add(resultado); // Agregamos el resultado al historial
    }

    private static void mostrarHistorial(List<Double> historial) { // Método para mostrar el historial de resultados
        System.out.println("Historial de resultados:");
        for (int i = 0; i < historial.size(); i++) { // Iteramos sobre el historial
            System.out.println((i + 1) + ": " + historial.get(i)); // Mostramos cada resultado
        }
    }
}