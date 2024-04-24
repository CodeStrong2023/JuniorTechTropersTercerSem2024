/*
Ejercicio 1: Leer un numero y comprar su cuadrado, repetir
el proceso hasta que se introduzca un numero negativo
*/

while (true) {
    const numero = parseInt(prompt('Ingrese un número: '));
    if (numero < 0) {
        alert('El programa ha finalizado por número negativo');
        break;
    }
    const cuadrado = Math.pow(numero, 2);
    alert(`El número ${numero} elevado al cuadrado es: ${cuadrado}`);
}




