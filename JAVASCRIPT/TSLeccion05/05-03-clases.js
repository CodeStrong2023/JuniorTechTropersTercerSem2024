//Intentamos hacer hosting pero no se permite antes de la clase
//let persona3 = new Persona('Carla', 'Ponce');

class Persona { //CLASE PADRE
    constructor(nombre, apellido) {
        this._nombre = nombre;
        this._apellido = apellido;
    }

    //Agregamos get y set
    get nombre() {
        return this._nombre;
    }
    get apellido() {
        return this._apellido;
    }
    set nombre(nombre) {
        this._nombre = nombre;
    }
    set apellido(apellido) {
        this._apellido = apellido;
    }
    //Método para imprimir nombre completo
    nombreCompleto() {
        return this._nombre + ' ' + this._apellido;
    }
    toString() {
        //Aplicamos polimorfismo o sea = multiples formas en tiempo de ejecucion
        return this.nombreCompleto();
        //Em método que se ejecua depende si es una referencia de tipo padre o hija
    }

}

class Empleado extends Persona { //CLASE HIJA
    constructor(nombre, apellido, departamento) {
        super(nombre, apellido); //||SE DEBE LLAMAR EN LA PRIMER LÍNEA DEL CONSTRUCTOR DE LA CLASE HIJA A LA CLASE PADRE||
        this._departamento = departamento;
    }

    get deprtamento() {
        return this._departamento;
    }
    set departamento(departamento) {
        this._departamento = departamento;
    }

    //SOBREESCRITURA
    nombreCompleto() {
        return super.nombreCompleto() + ', ' + this._departamento;
    }


}
//Creamos los objetos
let persona1 = new Persona('Martín', 'Perez');
console.log(persona1.nombre);
persona1.nombre = 'Juan Carlos';
console.log(persona1.nombre);
//console.log(persona1);
let persona2 = new Persona('Carlos', 'Lara');
console.log(persona2.nombre);
persona2.nombre = 'María Laura';
console.log(persona2.nombre);
//console.log(persona2);
console.log(persona1.apellido);
persona1.apellido = 'López';
console.log(persona1.apellido);

console.log(persona2.apellido);
persona1.apellido = 'García';
console.log(persona1.apellido);

let empleado1 = new Empleado('María', 'Gimenez', 'Sistemas');
console.log(empleado1);
console.log(empleado1.nombreCompleto()); //Llamamos al método de la clase padre es un método heredado


//Metodo to sring: Accedemos a atributos y métodos de manera dinámica:
//Object.prototype.toString
console.log(empleado1.toString());
console.log(persona1.toString());

