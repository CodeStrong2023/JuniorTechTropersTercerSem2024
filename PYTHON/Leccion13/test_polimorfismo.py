from Empleado import Empleado
from Gerente import Gerente


def imprimir_detalles(objeto):
    #print(objeto) #Llamamos al metodo __str__ de la clase Empleado o Gerente
    print(type(objeto)) #Para saber el tipo de dato que recibe
    print(objeto.mostrar_detalles())
    if isinstance(objeto, Gerente): # "isinstance": Pregunta si pertenece a tal clase
        print(objeto.departamento)

empleado = Empleado('Ariel', 50000.00)
imprimir_detalles(empleado)

gerente = Gerente('Natalia', 60000.00, 'Sistemas')
imprimir_detalles(gerente)

