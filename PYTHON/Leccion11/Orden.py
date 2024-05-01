class Orden:
    contador_ordenes = 0

    def __init__(self, productos):
        Orden.contador_ordenes += 1
        self.id_orden = Orden.contador_ordenes
        self._productos = list(productos)  # Convertimos a una lista

    def agregar_producto(self, producto):
        self._productos.append(producto)  # Para agregar nuevo producto

    def calcular_total(self):
        total = 0  # Variable temporal
        for producto in self._productos:
            total += producto.precio
        return total

    def __str__(self):
        productos_str = ''
        for producto in self._productos:
            productos_str += producto.__str__() + '|'
        return f'Orden: {self.id_orden}, \nProducto: {productos_str}'

if __name__ == '__main__':
        producto1 = Producto('Camiseta', 100.00)
        producto2 = Producto('Pantalon', 150.00)
        productos1 = [producto1, producto2]
        orden1 = Orden(productos1)
        print(orden1)
        # TAREA: MODIFICAR LA ORDEN2 INGRESANDO NUEVOS PRODUCTOS CON NOMBRE Y PRECIO
        # CREAR UNA NUEVA LISTA DE PRODUCTOS Y AGREGAR A LA ORDEN 2

        producto3 = Producto('Remera', 2000.00)
        producto4 = Producto('Campera', 3500.00)
        producto5 = Producto('Buzo', 5500.00)
        producto6 = Producto('Zapatillas', 10500.00)
        producto7 = Producto('Malla Hombre', 8000.00)
        producto8 = Producto('Short', 6000.00)
        productos1 = [producto1, producto2]  # Creamos la lista de productos
        orden1 = Orden(productos1)  # Primer objeeto orden de lista productos
        print(orden1)
        productos2 = [producto3, producto4, producto5]
        orden2 = Orden(productos2)
        print(orden2)
        productos3 = [producto5, producto6]
        orden3 = Orden(productos3)
        print(orden3)
        productos4 = [producto7, producto8]
        orden4 = Orden(productos4)
        print(orden4)