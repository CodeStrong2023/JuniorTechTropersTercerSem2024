import psycopg2 as bd

conexion = bd.connect(
    user='postgres',
    password='32893064',
    host='localhost',
    port='5432',
    database='test_bd'
)
try:
    with conexion:
        with conexion.cursor() as cursor:
            sentencia = 'INSERT INTO persona(nombre,apellido, email)VALUES(%s,%s,%s)'
            valores = ('Alex', 'Rojas', 'alexrojas@mail.com')
            cursor.execute(sentencia, valores)

            sentencia = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s'
            valores = ('Papa', 'Queso', 'papa@gmail.com', 9)
            cursor.execute(sentencia, valores)

except Exception as e:
    conexion.rollback()
    print(f'Salió mal por este motivo, se hizo un rollback: {e}')
finally:
    conexion.close()
print('Termina la transacción')