programa ej2
procesos
  proceso recorrido(ES flor:numero)
  comenzar
    repetir 20
      si(HayPapelEnLaEsquina)
        tomarPapel
        Flores:=Flores+1
      mover
  fin
areas
  ciudad: AreaC(1,1,100,100)
robots 
  robot robot1
  variables
    cantPapeles:numero
  comenzar
    Pos(10,10)
    recorrido(cantPapeles)
    Informar(cantPapeles)
  fin
  robot robot2
  variables
    cantPapeles:numero
  comenzar
    Pos(10,30)
    derecha
    recorrido(cantPapeles)
    Informar(cantPapeles)
  fin
  robot robot3
  variables
    cantPapeles:numero
  comenzar
    Pos(30,30)
    repetir 2
      derecha
    recorrido(cantPapeles)
    Informar(cantPapeles)
  fin
  robot robot4
  variables
    cantPapeles:numero
  comenzar
    Pos(30,10)
    repetir 3
      derecha
    recorrido(cantPapeles)
    Informar(cantPapeles)
  fin
variables
  Rinfo1:robot1
  Rinfo2:robot2
  Rinfo3:robot3
  Rinfo4:robot4
comenzar
  AsignarArea(Rinfo1,ciudad)
  AsignarArea(Rinfo2,ciudad)
  AsignarArea(Rinfo3,ciudad)
  AsignarArea(Rinfo4,ciudad)
  Iniciar(Rinfo1,1,1)
  Iniciar(Rinfo2,1,2)
  Iniciar(Rinfo3,1,3)
  Iniciar(Rinfo4,1,4)
fin