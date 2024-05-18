/*
Ejercicio 4: Pedir numeros hasta que se teclee uno negativo,
y mostrar cuantos numeros se han introducido.
Lo hacemos primero con clase Scanner
Luego lo hacemos con la clase JOptionPane
*/

let numero = parseInt(prompt("Ingrese un numero: "));
let contador = 0;

    while (numero >= 0) {
        contador++;
        alert(`El numero ingresado ${numero}`);
        numero = parseInt(prompt("Ingrese otro numero: "));
    }
        alert(`El numero ${numero} rompe el programa`);
        alert(`La cantidad de numeros ingresados es: ${contador}`);
