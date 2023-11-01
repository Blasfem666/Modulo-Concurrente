programa ej1
procesos
  proceso recorrido(ES flores:numero)
  comenzar
    repetir 9
      si(HayFlorEnLaEsquina)
        tomarFlor
        flores:=flores+1
      mover
  fin
areas
  ciudad: AreaC(1,1,100,100)
robots
  robot fiscalizador
  variables
    maximo:numero
    minimo:numero 
    ultimo:numero
    primero:numero
    diferencia:numero
    id:numero
    f:numero
  comenzar
    minimo:=101
    maximo:=0
    diferencia:=0
    EnviarMensaje(1,robot1)
    EnviarMensaje(2,robot2)
    EnviarMensaje(3,robot3)
    EnviarMensaje(4,robot4)
    EnviarMensaje(5,robot5)
    EnviarMensaje(6,robot6)
    repetir 6
      RecibirMensaje(id,*)
      si(id=1)
        RecibirMensaje(f,robot1)
      si(id=2)
        RecibirMensaje(f,robot2)
      si(id=3)
        RecibirMensaje(f,robot3)
      si(id=4)
        RecibirMensaje(f,robot4)
      si(id=5)
        RecibirMensaje(f,robot5)
      si(id=6)
        RecibirMensaje(f,robot6)
      si(f >= maximo)
        maximo:=f
        primero:=id
      si(f <= minimo)
        minimo:=f
        ultimo:=id
    diferencia:=maximo-minimo
    Informar(primero)
    Informar(maximo)
  fin
  robot competidor
  variables
    cantFlores:numero
    identificador:numero
  comenzar
    cantFlores:=0
    RecibirMensaje(identificador,robotFiscal)
    recorrido(cantFlores)
    EnviarMensaje(identificador,robotFiscal)
    EnviarMensaje(cantFlores,robotFiscal)
  fin
variables
  robot1:competidor
  robot2:competidor
  robot3:competidor
  robot4:competidor
  robot5:competidor
  robot6:competidor
  robotFiscal:fiscalizador
comenzar
  AsignarArea(robot1,ciudad)
  AsignarArea(robot2,ciudad)
  AsignarArea(robot3,ciudad)
  AsignarArea(robot4,ciudad)
  AsignarArea(robot5,ciudad)
  AsignarArea(robot6,ciudad)
  AsignarArea(robotFiscal,ciudad)
  Iniciar(robot1,1,1)
  Iniciar(robot2,2,11)
  Iniciar(robot3,3,21)
  Iniciar(robot4,4,31)
  Iniciar(robot5,5,41)
  Iniciar(robot6,6,51)
  Iniciar(robotFiscal,2,1)
fin