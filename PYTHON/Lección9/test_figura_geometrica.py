from Cuadrado import Cuadrado
from Rectangulo import Rectangulo

print('Creación de objeto clase Cuadrado'.center(50, '_'))
cuadrado1 = Cuadrado(8, "Azul")
print(cuadrado1.ancho)
print(cuadrado1.alto)
print(f'Calculo del Area del cuadrado: {cuadrado1.calcular_area()}')

#MRO = Method Resolution Order
print(Cuadrado.mro())

print(cuadrado1)
print('Creación de objeto clase Rectángulo'.center(50, '_'))
rectangulo1 = Rectangulo(3, 9, 'verde')
print(f'Calculo del area del rectangulo: {rectangulo1.calcular_area()}')
print(rectangulo1)
