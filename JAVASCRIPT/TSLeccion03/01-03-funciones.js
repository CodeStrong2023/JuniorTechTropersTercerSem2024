miFuncion(8, 2); //Esto se le conoce como hosting

function miFuncion(a, b){
    //console.log("Sumamos: "+ (a + b));
    return a + b;
}
//Llamando la funcion
miFuncion(5, 4);

let resultado = miFuncion(6, 7);
console.log(resultado);



//Funciones de tipo expresion
let x = function (a, b) { return a + b }; //necesita si o si ";" para cerrarla
resultado = x(5, 6) //Llamammos con la var y entre paréntesis los argumentos
console.log(resultado);

//Funciones tipo self o invoking
(function (a, b) {
    console.log('Ejecutando la funcion: ' + (a + b));
})(9, 6); // se llama a sí misma con parámetros y con argumentos, por unica vez


console.log(typeof miFuncion);
function miFuncionDos(a, b){
    console.log(arguments.lenght);
}

miFuncionDos(5, 7, 3, 6);

//toString
var miFuncionTexto = miFuncionDos.toString();
console.log(miFuncionTexto);

//Funciones flecha
const sumarFuncionFlecha = (a, b) => a + b;

resultado = sumarFuncionFlecha(3, 7); // Asignamos el valor a una variable
console.log(resultado);
// los parametros es la lista de variables que definimos en una función
// los argumentos son los valores que pasamos en una función

// Función tipo expresión
let sumar = function (a = 4, b = 8) {
  console.log(arguments[0]); // muestra el parameto de a
  console.log(arguments[1]); // muestra el parameto de b
  return a + b+ arguments[2];
};
resultado = sumar(3, 2, 9);
console.log(resultado);

// Sumar todos los argumentos
let respuesta = sumarTodo(5, 4, 13, 10, 9);
console.log(respuesta);
function sumarTodo() {
  let suma = 0;
  for (let i = 0; i < arguments.length; i++) {
    suma += arguments[i]; // Arguments es para arreglos
  }
  return suma;
}

//Tipos primitivos
let k = 10;
function camviarValor(a){ //Paso por valor
    a = 20;
}

camviarValor(k);
console.log(k);

// Paso por referencia
const persona = {
    nombre: "Pepe",
    apellido: "Poncio"
}
console.log(persona);

function camviarValorObjeto(p1){
    p1.nombre = "Franco";
    p1.apellido = "Pagano";
}

camviarValorObjeto(persona);
console.log(persona);