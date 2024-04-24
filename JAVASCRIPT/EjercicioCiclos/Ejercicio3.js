/*
Ejercicio 3: Leer numeros hasta que se instroduzca un cero.
para cada uno indicar si es par o impar.
primero lo hacemos con la clase Scanner
luego con la clase JOptionPane
*/

let numero = parseInt(prompt("Ingrese un numero: "));

while (numero !== 0) {
    const mensaje = numero % 2 === 0 ? "es par" : "es impar";
    alert(`El numero ingresado ${numero} ${mensaje}`);
    numero = parseInt(prompt("Ingrese otro numero: "));
}

alert(`El numero ingresado ${numero} finaliza el programa`);