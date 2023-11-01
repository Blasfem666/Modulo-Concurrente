programa ej2
procesos
  proceso escalon(ES flores:numero; ES papeles:numero)
  variables
    largo:numero
  comenzar
    Random(largo,1,5)
    repetir largo
      si(HayFlorEnLaEsquina)
        tomarFlor
        flores:=flores+1
      si(HayPapelEnLaEsquina)
        tomarPapel
        papeles:=papeles+1
      mover   
    derecha 
    mover
    repetir 3
      derecha
  fin
areas
  ciudad:AreaC(1,1,100,100)
robots
  robot jefe
  variables
    f:numero
    id:numero
    total:numero
  comenzar
    total:=0
    EnviarMensaje(1,robot1)
    EnviarMensaje(2,robot2)
    EnviarMensaje(3,robot3)
    repetir 3
      RecibirMensaje(id,*)
      si(id=1)
        RecibirMensaje(f,robot1)
      si(id=2)
        RecibirMensaje(f,robot2)
      si(id=3)
        RecibirMensaje(f,robot3)
      total:=total+f
    Informar(total)
  fin
  robot recolector
  variables
    cantEscalones:numero
    identificador:numero
    flores:numero
    papeles:numero
  comenzar
    flores:=0
    papeles:=0
    cantEscalones:=0
    RecibirMensaje(identificador,robotJefe)
    repetir 4
      escalon(flores,papeles)
      si(flores>papeles)
        cantEscalones:=cantEscalones+1
      flores:=0
      papeles:=0
    EnviarMensaje(identificador,robotJefe)
    EnviarMensaje(cantEscalones,robotJefe)
  fin
variables
  robot1:recolector
  robot2:recolector
  robot3:recolector
  robotJefe:jefe
comenzar
  AsignarArea(robot1,ciudad)
  AsignarArea(robot2,ciudad)
  AsignarArea(robot3,ciudad)
  AsignarArea(robotJefe,ciudad)
  Iniciar(robot1,2,1)
  Iniciar(robot2,7,1)
  Iniciar(robot3,12,1)
  Iniciar(robotJefe,1,1)
fin