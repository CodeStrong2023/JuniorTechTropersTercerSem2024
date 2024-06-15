//let persona3 = new Persona('Carla','Persona');

class Persona {// Clase Padre

    static contadorPersonas = 0; // Atributo estático
    ///email = 'Valor default email';  // Atributo no estático

    static get MAX_OBJ(){  // Este método simula una constante
        return 5;
    }

    constructor(nombre, apellido) {
        this._nombre = nombre;
        this._apellido = apellido;
        if(Persona.contadorPersonas<Persona.MAX_OBJ){
            this.idPersona = ++Persona.contadorPersonas;
        }else{
            console.log('Se a superado el maximo de Objetos permitidos');
        }
        //console.log('Se incrementa el contador: '+ Persona.contadorObjetoPersona);
    }

    get nombre() {
        return this._nombre;
    }
    set nombre(nombre) {
        this._nombre = nombre;
    }
    get apellido() {
        return this._apellido;
    }
    set apellido(apellido) {
        this._apellido = apellido;
    }

    // Metodo
    nombreCompleto() {
        return this.idPersona + ' ' + this._nombre + ' ' + this._apellido;
    }

    // SDobreescribimos el método de la clase padre (Object)
    toString() { // Regresa un String
        //Se aplica el polimorfismo que significa = multiples formas en tiempo de ejecución
        // El método que se ejecuta depende si es una referencia de tipo padre o hija
        return this.nombreCompleto();
    }

    static saludar() {
        console.log('Saludos desde este método static');
    }

    static saludar2(persona) {
        console.log(persona.nombre + ' ' + persona.apellido);
    }
}
class Empleado extends Persona { // Clase hija
    constructor(nombre, apellido, departamento) {
        super(nombre, apellido);
        this._departamento = departamento;
    }

    get departamento() {
        return this._departamento;
    }
    set departamento(departamento) {
        this._departamento = departamento;
    }

    // Sobre escritura (Modificar el comportamiento de un metodo de la clase padre)
    nombreCompleto() {
        //return this._nombre + " " + this._apellido + ", " + this._departamento;
        return super.nombreCompleto() + ", " + this._departamento;
    }

}
let persona1 = new Persona('Martín', 'Perez');
console.log(persona1.nombre);
persona1.nombre = 'Juan Carlos';
console.log(persona1.nombre);

// Ejercicio dispuesto
console.log(persona1.apellido);
persona1.apellido = 'Sanchez';
console.log(persona1.apellido);
//console.log(persona1);

let persona2 = new Persona('Carlos', 'Lara');
console.log(persona2.nombre);
persona2.nombre = 'Maria Laura';
console.log(persona2.nombre);
//console.log(persona2);
// Ejercicio dispuesto
console.log(persona2.apellido);
persona2.apellido = 'Castro';
console.log(persona2.apellido);

let empleado = new Empleado('Nelson', 'Lassa', 'Atención al Publico');
console.log(empleado);
console.log(empleado.nombre)

// Herencia
console.log(empleado.nombreCompleto());


// Object.prototype.toString Esta es la manera de acceder a atributos y métodos de manera dinamica
console.log(empleado.toString());
console.log(persona1.toString());

//persona1.saludar(); no se utiliza desde el objeto
Persona.saludar();
Persona.saludar2(persona1);


Empleado.saludar();
Empleado.saludar2(persona1);

//console.log(persona1.contadorObjetoPersona);
console.log(Persona.contadorObjetoPersona);
console.log(Empleado.contadorObjetoPersona);

//console.log(persona1.email);
//console.log(empleado.email);
//console.log(Persona.email); No se puede acceder desde la clase

console.log(persona1.toString());
console.log(persona2.toString());
console.log(empleado.toString());
console.log(Persona.contadorPersonas);

// Creamos un nuevo Objeto
let persona3 = new Persona('Carla', 'Pertosi');
console.log(persona3.toString());
console.log(Persona.contadorPersonas);


console.log(Persona.MAX_OBJ);
//Persona.MAX_OBJ = 10; // No se puede modificar, ni alterar
console.log(Persona.MAX_OBJ);

let persona4 = new Persona('Franco','Diaz');
console.log(persona4.toString());
let persona5 = new Persona('Liliana','Paz');
console.log(persona5.toString());