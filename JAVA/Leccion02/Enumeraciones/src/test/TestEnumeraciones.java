
package test;

import enumeraciones.Continentes;
import enumeraciones.Dias;
import static enumeraciones.Dias.MARTES;

public class TestEnumeraciones {
    public static void main(String[] args) {
        //System.out.println("Dia 1: "+Dias.LUNES); /*Cada uno de los valores de la enum son cadenas 
        //y son CONSTANTES*/  
        //indicarDiaSemana(Dias.MARTES);
        
        //CONTINENTES:
        //Acceder a un elem:
        System.out.println("Continente No. 4: "+Continentes.AMERICA);
        System.out.println("No. de paises en el 4to. continente: "
                +Continentes.AMERICA.getPaises());
        System.out.println("No. de habitantes en el 4to. continente: "
                +Continentes.AMERICA.getHabitantes());
        
        //TAREA: EJECUTAR LOS DEMAS PAÍSES:
        
        System.out.println("Continente No. 1: "+Continentes.AFRICA);
        System.out.println("No. de paises en el 1er. continente: "
                +Continentes.AFRICA.getPaises());
        System.out.println("No. de habitantes en el 1er. continente: "
                +Continentes.AFRICA.getHabitantes());
        
        System.out.println("Continente No. 2: "+Continentes.EUROPA);
        System.out.println("No. de paises en el 2do. continente: "
                +Continentes.EUROPA.getPaises());
        System.out.println("No. de habitantes en el 2do. continente: "
                +Continentes.EUROPA.getHabitantes());
        
        System.out.println("Continente No. 3: "+Continentes.ASIA);
        System.out.println("No. de paises en el 3er. continente: "
                +Continentes.ASIA.getPaises());
        System.out.println("No. de habitantes en el 3er. continente: "
                +Continentes.ASIA.getHabitantes());
        
        System.out.println("Continente No. 5: "+Continentes.OCEANIA);
        System.out.println("No. de paises en el 5to. continente: "
                +Continentes.OCEANIA.getPaises());
        System.out.println("No. de habitantes en el 5to. continente: "
                +Continentes.OCEANIA.getHabitantes());
        
    }
    /*Creamos nuevo método */
    private static void indicarDiaSemana(Dias dias){
        switch(dias){ /*Switch ya sabe que usaremos enum, por lo tanto colocamos los valores*/
            case LUNES:
                System.out.println("Primer día de la semana");
                break;
            case MARTES:
                System.out.println("Segundo día de la semana");
                break;
                /*TAREA: AGREGAR TODOS LOS DÍAS DE LA SEMANA
                  TAREA: AGREGAR DEFAULT EN EL SWITCH*/

            case MIERCOLES:
                System.out.println("Tercer día de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto día de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto día de la semana");
                break;
            case SABADO:
                System.out.println("Sexto día de la semana");
                break;
            case DOMINGO:
                System.out.println("Séptimo día de la semana");
                break;
            default:
                System.out.println("Día desconocido");
        }
    }
}
