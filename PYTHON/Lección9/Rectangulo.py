from Color import Color  # Importa la clase Color desde el módulo Color
from FiguraGeometrica import FiguraGeometrica  # Importa la clase FiguraGeometrica desde el módulo FiguraGeometrica


class Rectangulo(FiguraGeometrica, Color):
    # Constructor de la clase Cuadrado
    def __init__(self, ancho, alto, color):
        # Llama al constructor de la clase FiguraGeometrica y Color para inicializar los atributos
        FiguraGeometrica.__init__(self, ancho, alto)
        # Inicializa los atributos relacionados con la figura geométrica (ancho y alto)
        Color.__init__(self, color)  # Inicializa el color

    # Método para calcular el área del cuadrado
    def calcular_area(self):
        return self.alto * self.ancho  # Área del cuadrado es el producto del lado por sí mismo

    # Método ToString
    def __str__(self):
        # Concatena las representaciones como cadena de texto de FiguraGeometrica y Color
        return f"{FiguraGeometrica.__str__(self)} {Color.__str__(self)}"