from psycopg2 import pool
from logger_base import log
import sys


class Conexion:  # Colocamos las credenciales de la db
    _DATABASE = 'test_bd'
    _USERNAME = 'postgres'
    _PASSWORD = 'admin'
    _DB_PORT = '5432'
    _HOST = '127.0.0.1'
    _MIN_CON = 1  #AGREGAMOS LOS LIMITES
    _MAX_CON = 5
    # Un pool de conexion necesita max y min de objetos para administrar
    _pool = None

    @classmethod  # Creamos el metodo obtenerConexion
    def obtenerConexion(cls):
        conexion = cls.obtenerPool().getconn()  #getconn regresa un objeto de conexion a la bd
        log.debug(f'Conexion obtenida del pool: {conexion}')
        return conexion

    # OBTENER POOL DE CONEXIONES:
    @classmethod
    def obtenerPool(cls):
        if cls._pool is None:
            try:
                cls._pool = pool.SimpleConnectionPool(cls._MIN_CON,
                                                      cls._MAX_CON,
                                                      host=cls._HOST,
                                                      user=cls._USERNAME,
                                                      password=cls._PASSWORD,
                                                      port=cls._DB_PORT,
                                                      database=cls._DATABASE)
                log.debug(f'Creacion del pool exitosa: {cls._pool}')
                return cls._pool
            except Exception as e:
                log.error(f'Ocurrio un error al obtener el pool: {e}')
                sys.exit()
        else:
            return cls._pool

    @classmethod
    def liberarConexion(cls, conexion):
        cls.obtenerPool().putconn(conexion)
        log.debug(f'Regresamos la conexio0n del pool: {conexion}')

    #Cerramos todas las conexiones
    @classmethod
    def cerrarConexiones(cls):
        cls.obtenerPool().closeall()


if __name__ == '__main__':
    conexion1 = Conexion.obtenerConexion()
    Conexion.liberarConexion(conexion1)
    conexion2 = Conexion.obtenerConexion()
    Conexion.liberarConexion(conexion2)
    conexion3 = Conexion.obtenerConexion()
    Conexion.liberarConexion(conexion3)
    conexion4 = Conexion.obtenerConexion() # Estas funcionan porque las anteriores estan liberadas, se reemplazan las conexiones
    conexion5 = Conexion.obtenerConexion()
    conexion6 = Conexion.obtenerConexion()
