from mundo_pc.dispositivo_entrada import DispositivoEntrada


class Raton(DispositivoEntrada):
    contador_ratones = 0

    def __init__(self, marca, tipo_entrada):
        Raton.contador_ratones += 1
        self._id_raton = Raton.contador_ratones
        super().__init__(marca, tipo_entrada)

    # Método getter para el atributo marca
    def get_marca(self):
        return self._marca

    # Método setter para el atributo marca
    def set_marca(self, marca):
        self._marca = marca

    # Método getter para el atributo tipo_entrada
    def get_tipo_entrada(self):
        return self._tipo_entrada

    # Método setter para el atributo tipo_entrada
    def set_tipo_entrada(self, tipo_entrada):
        self._tipo_entrada = tipo_entrada

    def __str__(self):
        return f"Id: {self._id_raton}, Marca: {self._marca}, Tipo Entrada: {self._tipo_entrada}"


# Hacemos una prueba de testeo
if __name__ == "__main__":
    raton1 = Raton("HP", "USB")
    raton2 = Raton("Acer", "Bluetooth")
    print(raton1)
    print(raton2)

    # Probando los métodos set y get
    raton1.set_marca("Logitech")
    raton1.set_tipo_entrada("Bluetooth")
    print("Marca de raton1 después de cambio:", raton1.get_marca())
    print("Tipo de entrada de raton1 después de cambio:", raton1.get_tipo_entrada())
