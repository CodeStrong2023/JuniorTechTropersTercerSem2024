import psycopg2 as bd

conexion = bd.connect(
    user='postgres',
    password='32893064',
    host='localhost',
    port='5432',
    database='test_bd'
)
try:
    conexion.autocommit = False
    cursor = conexion.cursor()
    sentencia = 'INSERT INTO persona(nombre,apellido, email)VALUES(%s,%s,%s)'
    valores = ('María', 'Esperanza', 'mesparza@mail.com')
    cursor.execute(sentencia, valores)
    conexion.commit() #Hacemos el commit manualmente
    print('Termina la transacción')

except Exception as e:
    conexion.rollback()
    print(f'Salió mal por este motivo, se hizo un rollback: {e}')
finally:
    conexion.close()