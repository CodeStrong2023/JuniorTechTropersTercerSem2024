//Ejercicio 9: Pedir el dia, mes, año de una fecha e indicar si la fecha es correcta. Suponiendo que todos los meses son de 30 dias.


let dia = parseInt(prompt("Ingrese el dia: "));
while(dia !== 0 && (dia <= 0 || dia > 30)){
    dia = parseInt(prompt("Ingrese un dia correcto: "));
}

let mes = parseInt(prompt("Ingrese el mes: "));
while(mes !== 0 && (mes <= 0 || mes > 12)){
    mes = parseInt(prompt("Ingrese un mes correcto: "));
}

let anio = parseInt(prompt("Ingrese un año: "));
while(anio !== 0 && (anio <= 0 || anio > 2024)){
    anio = parseInt(prompt("Ingrese un año correcto: "));
}

alert(`La fecha ${dia}/${mes}/${anio} es correcta`);