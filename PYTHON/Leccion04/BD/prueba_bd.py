import psycopg2 # Esto es para pdoer conectarnos a Postgresql

conexion = psycopg2.connect(
    user='postgres',
    password='32893064',
    host='localhost',
    port='5432',
    database='test_bd'
)

cursor = conexion.cursos()
sentencia = 'SELECT * FROM persona'
cursor.execute(sentencia)_# De esta manera ejecutamos la sentencia
registros = cursor.fetchall()_# Recuperamos todos los registros que seran una lista
print(registros)

cursor.close()
conexion.close()
