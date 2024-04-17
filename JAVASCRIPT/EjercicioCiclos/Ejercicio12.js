//Ejercicio 12: Pedir un numero y calcular su factorial

let factorial = 1;
let numero = parseInt(prompt("Ingrese un numero: "))
let i = 1;

while( i <= numero){
    factorial *= i;
    i++;
}

alert(`El factorial de ${numero} es ${factorial}`);