programa ej3
procesos
  proceso recorridoA(ES papeles:numero)
  comenzar
    repetir 10
      si(HayPapelEnLaEsquina)
        tomarPapel
        papeles:=papeles+1
      mover
  fin
  proceso recorridoB(ES flores:numero)
  comenzar
    repetir 10
      si(HayFlorEnLaEsquina)
        tomarPapel
        papeles:=papeles+1
      mover
  fin
areas
  ciudad:AreaC(1,1,100,100)
robots
  robot robot1
  variables
    papeles:numero
  comenzar
    Pos(1,1)
    recorridoA(papeles)
    EnviarMensaje(papeles,A2)
  fin
  robot robot2
  variables
    total:numero
    papeles:numero
  comenzar
    total:=0
    Pos(1,12)
    RecibirMensaje(papeles,A1)
    total:=papeles
    recorridoA(total)
    Informar(total)
  fin
  robot robot3
  variables
    flores:numero
  comenzar
    flores:=0
    Pos(2,5)
    recorridoB(flores)
    EnviarMensaje(flores,B2)
  fin
  robot robot4
  variables
    flores:numero
    total:numero
  comenzar
    total:=0
    Pos(2,16)
    RecibirMensaje(flores,B1)
    total:=flores
    recorridoB(total)
    Informar(total)
  fin
variables
  A1:robot1
  A2:robot2
  B1:robot3
  B2:robot4
comenzar
  AsignarArea(A1,ciudad)
  AsignarArea(A2,ciudad)
  AsignarArea(B1,ciudad)
  AsignarArea(B2,ciudad)
  Iniciar(A1,1,1)
  Iniciar(A2,1,2)
  Iniciar(B1,1,3)
  Iniciar(B2,1,4)
fin