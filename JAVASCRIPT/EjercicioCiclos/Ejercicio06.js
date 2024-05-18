/*
Ejercicio 6: Pedir numeros hasta que se teclee un 0, mostrar
la suma de todos los numeros introducidos
*/

let numero = parseInt(prompt("Ingrese un numero: "));
let suma = 0;

while (numero !== 0) {
    suma = suma + numero;
    numero = parseInt(prompt("Ingrese otro numero: "));
}
alert('El numero: ' + numero + ' rompe el programa');
alert('La suma de los numeros ingresados es: ' + suma);