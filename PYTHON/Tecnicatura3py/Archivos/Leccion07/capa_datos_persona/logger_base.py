import logging as log

#https://docs.python.org/3/howto/logging.html
log.basicConfig(level=log.DEBUG, #asctime: fecha y hora| levelname: nivel| filename: nombre del archivo| message: mensaje
                format='%(asctime)s:%(levelname)s [%(filename)s:%(lineno)s] %(message)s',
                #date format: I:hora, M:min, S:seg, %p->PM, %a->AM
                datefmt='%I:%M:%S %p',
                #Concetpto de Handlers arroja la informacion no solo a una consola sino tb a un archivo
                handlers=[
                    log.FileHandler('capa_datos.log'), #Colocamos el archivo al cual queremos enviar informacion
                    log.StreamHandler() #Indicamos que enviamos informacion a la consola
                ])

#Llamamos una config basica:
if __name__=='__main__':
    log.debug('Mensaje a nivel Debug')
    log.info('Mensaje a nivel Info')
    log.warning('Mensaje a nivel Warning')
    log.error('Mensaje a nivel de Error')
    log.critical('Mensaje a nivel critical')

