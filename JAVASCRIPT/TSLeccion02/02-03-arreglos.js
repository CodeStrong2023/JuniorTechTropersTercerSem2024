// Declarar arreglos de diferentes maneras:
//let autos = new Array('Ferrari', 'Ranault', 'BMW') // fORMA ANTIGUA NO RECOMENDABLE
//Declaramos la variable y definimos los elementos del arreglo
const autos = ['Ferrari', 'Ranault', 'BMW'] //Usamos const porque la referencia ya no se va a modificar
console.log(autos)

//Recorremos los elementos de un arreglo
console.log(autos[0]);
console.log(autos[2]);

for(let i = 0; i < autos.length; i++){
    console.log(i+' : '+autos[i]);
}
