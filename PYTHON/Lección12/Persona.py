class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    def __add__(self, other):
        return f"{self.nombre} + {other.nombre}"

persona1 = Persona("Juampa ", 50)
persona2 = Persona("Franco ", 5)

# persona1.__add__(persona2)  SINTAXIS INTERNA Y AUTOMATICA

print(persona1 + persona2)