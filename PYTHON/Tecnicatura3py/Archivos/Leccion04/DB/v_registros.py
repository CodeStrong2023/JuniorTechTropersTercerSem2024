import psycopg2  # Esto es para poder conectarnos a PostgreSQL

conexion = psycopg2.connect(
    user='postgres',
    password='admin',
    host='127.0.0.1',
    port='5432',
    database='test_bd'
)
try:
    with conexion:
        with conexion.cursor() as cursor:
            # cursor = conexion.cursor() # Esto ya esta haciendolo el with
            sentencia = 'SELECT * FROM persona WHERE id_persona IN %s'  # Placeholder
            entrada = input('Digite los id_persona a buscar (separados por coma): ')
            llaves_primarias = (tuple(entrada.split(', ')),)  # Metodo que separa por comas
            cursor.execute(sentencia, llaves_primarias)  # De esta manera ejecutamos la sentencia
            registros = cursor.fetchall()  # Recuperamos todos los reregistros que seran una lista
            for registro in registros:
                print(registro)
except Exception as e:
    print(f'Ocurrio un error: {e}')
finally:
    # cursor.close() el cierre del cursor lo esta haciendo el with
    conexion.close()

# Documentación de la conexion a la base de datos
# https://www.psycopg.org/docs/usage.html