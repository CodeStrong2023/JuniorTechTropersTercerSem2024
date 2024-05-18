
// Ejercicio 10: Perdir 10 numeros y escribir la suma total

let suma = 0;

for(let i = 1; i <= 10; i++){
    let numero = parseInt(prompt(`Ingrese el ${i} numero:`));
    suma += numero;
}

alert(`La suma de los numeros ingresados es: ${suma}`);