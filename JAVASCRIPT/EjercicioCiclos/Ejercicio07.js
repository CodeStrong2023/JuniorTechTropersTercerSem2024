/*Ejercicio7: Pedir números hasta que se introduzca un negativo y 
calcular la media*/

let contar = 0, sumar = 0
let media = parseFloat(0)
numero = parseInt(prompt("Ingrese un número: "))
while (numero >= 0) {
    sumar += numero
    contar++
    numero = parseInt(prompt("Ingrese otro número: "))
}
if (contar == 0) {
    alert("Error, La división entre '0' no existe")
}
else {
    media = sumar / contar
    alert("LA MEDIA ES: " + media)
}