# Declaramos una variable
try:
    archivo = open("prueba.txt", "w", encoding="utf8") # la "w" es de write que significa escribir
    archivo.write("Programamos con diferentes tipos de archivos, ahora en txt.\n")
    archivo.write("Los acentos son importantes para las palabras\n")
    archivo.write("como por ejemplo: ación, ejecución y producción\n")
    archivo.write("Las letras son: \nr read leer, \na append anexa, \nw write escribir, \nx crear un archivo")
    archivo.write("\nt esta es para texto o text, \nb archivo binarios, \nw+ leer y escribir son iguales r+\n")
    archivo.write("Saludos a todos los alumnos de la tecnicatura\n")
    archivo.write("Con esto terminamos")
except Exception as e:
    print(e)
finally: # siempre se ejecuta
    archivo.close() # Con esto se debe cerrar el archivo
# archivo.write("Todo quedo perfecto"): este es un error porque el archivo ya se cerro