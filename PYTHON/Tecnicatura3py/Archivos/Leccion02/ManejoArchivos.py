class ManejoArchivos:

    def __init__(self, nombre):
        self.nombre = nombre

    def __enter__(self): #Creación del método y encapsulamiento del código
        print('Se obtiene el recurso'.center(50, '-'))
        self.nombre = open(self.nombre, 'r', encoding='utf-8')
        return self.nombre

    def __exit__(self, tipo_exception, valor_exception, traza_error): #Obtención de parámetros (default)
        print('Se cierra el recurso'.center(50, '-'))
        if self.nombre:
            self.nombre.close() #Cierre del archivo