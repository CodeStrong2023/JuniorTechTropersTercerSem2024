/*Realizar juego para adivinar un número, generando un aleatorio
entre 0-100, e ir pidiendo númerosindicando "es mayor" o "es menor"
según ocurra con respecto a N El proceso termina cdo el usuario acierta
y mostramos el número de intentos realizados*/
let numero = Math.floor(Math.random() * 10);

let intento;
let contar = 0;

do {
    intento = parseInt(prompt("Introduce un número entre 0 y 10: "));
    contar++;

    if (intento > numero) {
        alert("El número es menor.");
    } else if (intento < numero) {
        alert("El número es mayor.");
    } else {
        alert("¡Felicidades! Has adivinado el número en " + contar + " intentos.");
    }
} while (intento !== numero);
