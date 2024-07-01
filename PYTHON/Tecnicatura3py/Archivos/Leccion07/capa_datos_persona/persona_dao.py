from capa_datos_persona.Persona import Persona
from capa_datos_persona.conexion import Conexion
from capa_datos_persona.cursor_del_pool import CursorDelPool
from logger_base import log

class PersonaDAO:
    """
    DAO-> Data Access Object
    CRUD-> Create > Insertar
           Read > Seleccionar
           Update > Actualizar
           Delete > Eliminar
    """

    _SELECCIONAR = 'SELECT * FROM persona Order by id_persona'
    _INSERTAR = 'INSERT INTO persona(nombre, apellido, email) VALUES (%s, %s, %s)'
    _ACTUALIZAR = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s'
    _ELIMINAR = 'DELETE FROM persona WHERE id_persona=%s'

    #Definimos los metodos de clase:
    @classmethod
    def seleccionar(cls):
        with CursorDelPool() as cursor:
            cursor.execute(cls._SELECCIONAR)
            registros = cursor.fetchall()
            personas = [] #Creamos la lista
            for registro in registros:
                persona = Persona(registro[0], registro[1], registro[2], registro[3])
                personas.append(persona)
            return personas

    @classmethod
    def insertar(cls, persona): #colocamos persona porque necesitamos recibir un parametro
        #Obtenemos las conexiones:
        with CursorDelPool() as cursor:
            valores = (persona.nombre, persona.apellido, persona.email)
            cursor.execute(cls._INSERTAR, valores)
            log.debug(f'Persona insertada: {persona}')
            return cursor.rowcount

    @classmethod
    def actualizar(cls, persona):
        with CursorDelPool() as cursor:
            valores = (persona.nombre, persona.apellido, persona.email, persona.id_persona)
            cursor.execute(cls._ACTUALIZAR, valores)
            log.debug(f'Persona actualizada: {persona}')
            return cursor.rowcount

    @classmethod
    def eliminar(cls, persona):
        with CursorDelPool() as cursor:
            valores = (persona.id_persona,)
            cursor.execute(cls._ELIMINAR, valores)
            log.debug(f'Objetos eliminados: {persona}')
            return cursor.rowcount


if __name__ == '__main__':
    #Eliminar un registro:
    persona1 = Persona(id_persona = 30)
    personas_eliminadas = PersonaDAO.eliminar(persona1)
    log.debug(f'Personas eliminadas: {personas_eliminadas}')

    #Actualizar un registro:
    persona1 = Persona(1, 'Joan', 'Pena', 'jpena@mail.com')
    personas_actualizadas = PersonaDAO.actualizar(persona1)
    log.debug(f'Personas actualizadas: {personas_actualizadas}')

    #Insertar un registro:
    persona1 = Persona(nombre='Mateo', apellido='Torres', email='mtorres@email.com')
    personas_insertadas= PersonaDAO.insertar(persona1)
    log.debug(f'Personas insertadas: {personas_insertadas}')

    #Seleccion de objetos
    personas = PersonaDAO.seleccionar()
    for persona in personas:
        log.debug(persona)
