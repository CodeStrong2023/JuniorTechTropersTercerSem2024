miFuncion(8, 2); //Esto se le conoce como hosting

function miFuncion(a, b){
    //console.log("Sumamos: "+ (a + b));
    return a + b;
}
//Llamando la funcion
miFuncion(5, 4);

Let resultado = miFuncion(6, 7);
console.log(resultado);



//Funciones de tipo expresion
let x = function (a, b) { return a + b }; //necesita si o si ";" para cerrarla
resultado = x(5, 6) //Llamammos con la var y entre paréntesis los argumentos
console.log(resultado);

//Funciones tipo self o invoking
(function (a, b) {
    console.log('Ejecutando la funcion: ' + (a + b));
})(9, 6); // se llama a sí misma con parámetros y con argumentos, por unica vez

