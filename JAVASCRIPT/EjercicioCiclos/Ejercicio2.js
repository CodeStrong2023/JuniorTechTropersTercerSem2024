/*
Ejercicio 2: Leer un numero e indicar si es positivo o negativo.
El proceso se repetira hasta que se intrudizca un cero.
Hacer este ejercicio con la clase Scanner.
Luego hacerlo nuevamente con la clase JOptionPane.
*/

let numero = parseInt(prompt("Digite un numero: "));

while (numero !== 0) {
    const mensaje = numero > 0 ? "es positivo" : "es negativo";
    alert(`El numero ${numero} ${mensaje}`);
    numero = parseInt(prompt("Digite un numero: "));
}

alert("Se introdujo un cero");

