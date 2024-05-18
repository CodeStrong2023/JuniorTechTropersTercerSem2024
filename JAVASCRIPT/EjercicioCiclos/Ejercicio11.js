//Ejercicio 11: Diseñar un programa que muestre el producto de los 10 primeros numeros impares

let producto = 1;

for(let i = 1; i <= 20; i+=2){
    producto *= i;
}

alert(`El producto de los numeros impares es: ${producto}`);