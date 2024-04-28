
package test;

public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
       //Clases envolventes o Wrapper
       /*
          Clase Wrapper tipos primitivos
       
          int = la clase wrapper es Interger
          long= la clase wrapper es Long
          float= la clase wrapper es Float
          double= la clase wrapper es Double
          boolean= la clase wrapper es Boolean
          byte= la clase wrapper es Byte
          char= la clase wrapper es Character
          short= la clase wrapper es Short
       */
        int enteroPrim = 10; // Tipo primitivo
        System.out.println("enteroPrim = " + enteroPrim);
        Integer entero = 10; //Tipo object con la clase Integer
        System.out.println("entero = " + entero.doubleValue()); /*AUTOBOXING: donde el 
        tipo object lo convertimos a un primitivo a traves de "."*/
        
        //Manera inversa: UNBOXING
        int entero2 = entero; //Ahora es un tipo primitivo
        System.out.println("entero2 = " + entero2);
    }
}
