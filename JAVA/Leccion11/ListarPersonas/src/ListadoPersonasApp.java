import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonasApp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Definimos la lista fuera del while
        List<Persona> personas = new ArrayList<>();
        //Menu:
        var salir = false;
        while (!salir){
            mostrarMenu();
            try{
                salir = ejecutarOperacion(entrada, personas);
            } catch(Exception e){
                System.out.println("Ocurrio un error: "+e.getMessage());
            }
            System.out.println();
        }//**Fin ciclo while**
    }//**Fin metodo main**

    private static void mostrarMenu(){
        //Mostramos las opciones:
        System.out.print("""
                ******* Listado de Personas *******
                1. Agregar
                2. Listar
                3. Salir
                """);
        System.out.print("Digite una opcion: ");
    }//**Fin metodo mostrarMenu**

    private static boolean ejecutarOperacion(Scanner entrada, List<Persona> personas){
        var opcion = Integer.parseInt(entrada.nextLine());
        var salir = false;
        //Revisamos la opcion ingresada a traves de un switch
        switch (opcion){
            case 1-> { //Add
                System.out.print("Digite el nombre: ");
                var nombre = entrada.nextLine();
                System.out.print("Digite el telefono: ");
                var tel = entrada.nextLine();
                System.out.print("Digite el correo: ");
                var email = entrada.nextLine();
                //Creamos objeto personas
                var persona = new Persona(nombre, tel, email);
                personas.add(persona); //Agregamos a la lista
                System.out.println("La lista tiene: "+personas.size()+" elementos.");
            }//**Fin caso 1**
            case 2->{ //Listar
                System.out.println("Listado de personas> ");
                // MEJORAS: Usamos *lambda* para iterar cada objeto de la lista y metodo de referencia:
                //personas.forEach((persona) -> System.out.println(persona)); //Lambda
                personas.forEach(System.out::println); //por cada obj de tipo Persona de la lista se ejecutara el metodo
                //println (:: Metodo de referencia)
            } //**Fin caso 2**
            case 3->{ //Salir
                System.out.println("Hasta pronto!");
                salir = true;
            } //**Fin caso 3**
            default -> System.out.println("Opcion incorrecta: "+opcion);
        } //**Fin switch**
        return salir;
    }//**Fin de metodo ejecutarOperacion**
}//**Fin class ListadoPersonasApp**