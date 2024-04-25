class MiClase:
    #  Variable de clase, este atributo dará a cada objeto el mismo valor
    variable_clase = 'Esta es una variable de clase'

    def __init__(self, variable_instancia):  # La variable de instancia, da diferentes valores
        self.variable_instancia = variable_instancia


print(MiClase.variable_clase)
miCalse1 = MiClase('Esta es una variable de instancia')
print(miCalse1.variable_instancia)
print(miCalse1.variable_clase)
miCalse2= MiClase('Esta es otra prueba de variable de instancia')
print(miCalse2.variable_instancia)
print(miCalse2.variable_clase)

MiClase.variable_clase2 = 'Valor de variable clase 2' #Creamos la var y asignamos un valor
print(MiClase.variable_clase2) #Accedemos a los metodos de la Clase usando un objeto
print(miClase1.variable_clase2)
print(miClase2.variable_clase2)