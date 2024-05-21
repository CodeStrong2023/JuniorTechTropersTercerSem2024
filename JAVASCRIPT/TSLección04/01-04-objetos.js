let x = 10; // variable de tipo primitivo
console.log(x.length);
console.log("Tipos Primitivos");

// Objeto
let persona = {
    nombre: "Carlos",
    apellido: "Gil",
    email: "cgil@gmail.com",
    edad: 30,
    idioma: 'es',
    get lang() {
        return this.idioma.toUpperCase(); //Convierte las minúsculas a mayusculas
    },
    set lang(lang) {
        this.idioma = lang.toUpperCase();
    },
    nombreCompleto: function () { // método o funcion en JavaScript
        return this.nombre + " " + this.apellido;
    },
    get nombreEdad() { // Este es el método get
        return 'El nombre es: ' + this.nombre + ' edad: ' + this.edad;

    }


}

console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona);
console.log(persona.nombreCompleto());

let persona2 = new Object(); // Debe crear un nuevo objeto en memoria
persona2.nombre = "Juan";
persona2.direccion = "Salada 14";
persona2.telefono = "5492618282821";
console.log(persona2.telefono);
console.log("Creamos un nuevo objeto")
console.log(persona["apellido"]); // Accedemos como si fuera un arreglo

console.log("Usamos el ciclo for in");
//for in y accdemos al objeto como si fuera un arreglo
for (propiedad in persona) {
    console.log(propiedad);
    console.log(persona[propiedad]);
}

console.log("Cambiamos y eliminamos un error");
persona.apellida = "Betancutd"; // Cambiar dinamicamente el valor del objeto
delete persona.apellida; // Eliminamos el error
console.log(persona);

//Distinta Forma de imprimir un objeto
//Número 1: la más sencilla: concatenar cada valor de cada propiedad
console.log("Distinta Forma de imprimir un objeto: forma 1");
console.log(persona.nombre + ", " + persona.apellido);

//Número 2: A través del ciclo for in
console.log("Distinta Forma de imprimir un objeto: forma 2");
for (nombrePropiedad in persona) {
    console.log(persona[nombrePropiedad]);
}

//Número 3; La función Objet.values()
console.log("Distinta Forma de imprimir un objeto: forma 3");
let personaArray = Object.values(persona);
console.log(personaArray);

//Número 4: Utilizaremos el método JSON.stringify
console.log("Distinta Forma de imprimir un objeto: forma 4");
let personaString = JSON.stringify(persona);
console.log(personaString);

console.log('Comenzamosa utilizar el método get');
console.log(persona.nombreEdad);


console.log('Comenzamos con el método get para idiomas ');
persona.lang = 'en';
console.log(persona.lang);


function Persona3(nombre, apellido, email) { // constructor
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.nombreCompleto = function () {
        return this.nombre + ' ' + this.apellido;
    }
}

let padre = new Persona3('Leo', 'Lopez', 'lopexl@gmail.com');
padre.nombre = 'Luis';
padre.telefono = '5492618282821'; // Una propiedad exclusiva del objeto padre
console.log(padre);
console.log(padre.nombreCompleto());

let madre = new Persona3('Laura', 'Contrera', 'contreral@gmail.com');
console.log(madre);
console.log(madre.telefono); // la propiedad no esta definida
console.log(madre.nombreCompleto());


// Diferentes formas de crear objetos
// caso número 1
let miObjeto = new Object(); // Esta es una opción formal

// caso número 2
let miObjeto2 = {}; // Esta opción es breve y recomendada

// Caso String 1
let miCadena1 = new String('Hola'); // Sintaxis formal

// Caso String 2
let miCadena2 = 'Hola'; // Esta es la sintacis simplificada y recomendada

// Caso con números 1
let miNumero = new Number(1); // Es formal no recomendada

// Caso con número 2 
let miNumero2 = 1; // Sintaxis recomendable

// Caso boolean 1
let miBoolean = new Boolean(false); // Formal

// Caso boolean 2
let miBoolean2 = false; // Sintaxis recomendada

// Caso Arreglo 1
let miArreglo1 = new Array(); // Formal

// Caso Arreglo 2
let miArreglo2 = []; // Sintaxis recomendada

// Caso function 1 
let miFuncion1 = new function () { }; //Todo despues de new es considerado objeto

// Caso fuction 2
let miFuncion2 = function () { }; // Notación simplificada y recomendada

// uso de prototype
Persona3.prototype.telefono = '2618383832'
console.log(padre);
console.log(madre.telefono);
madre.telefono = '5492618383832'
console.log(madre.telefono);


// Uso de call
let persona4 = {
    nombre: 'Juan',
    apellido: 'Perez',
    nombreCompleto2: function (titulo, telefono) {
        return titulo + ': ' + this.nombre + ' ' + this.apellido + ' ' + telefono;
        
    },
    nombreCompleto3: function () {
        return this.nombre+ ' '+ this.apellido
    }
}
let persona5 = {
    nombre: 'Carlos',
    apellido: 'Lara'
}


console.log(persona4.nombreCompleto2('Lic.','5492618484845'));
console.log(persona4.nombreCompleto2.call(persona5, 'Ing','5492618585856'));

// Método Apply
console.log(persona4.nombreCompleto3.apply(persona5));

let arreglo = ['Ing.', '5492618686865'] // creamos un arreglo para poder enviarle los argumentos necesarios
console.log(persona4.nombreCompleto2.apply(persona5,arreglo));

