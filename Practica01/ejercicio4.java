programa ej4
procesos
  proceso recorrerR1(ES flores:numero;ES pos:numero)
  comenzar
    mientras(PosCa<100)
      si(HayFlorEnLaEsquina)
        tomarFlor
        flores:=flores+1
    pos:=pos+1
    si(HayFlorEnLaEsquina)
      tomarFlor
      flores:=flores+1
  fin
  proceso recorrerR2(ES papeles:numero;ES pos:numero)
  comenzar
    mientras(PosCa<100)
      si(HayPapelEnLaEsquina)
        tomarPapel
        papeles:=papeles+1
    pos:=pos+1
    si(HayPapelEnLaEsquina)
      tomarPapel
      papeles:=papeles+1
  fin
areas
  Area1: AreaPC(1,1,25,100)
  Area2: AreaPC(26,1,50,100)
  Area3: AreaPC(51,1,75,100)
  Area4: AreaPC(76,1,100,100)
robots 
  robot robot1
  variables
    posicion:numero
    cantFlores:numero
  comenzar
    cantFlores:=0
    posicion:=1
    Pos(posicion,1)
    repetir 24
      recorrerR1(cantFlores,posicion)
      Pos(posicion,1)
    posicion:=51
    Pos(posicion,1)
    repetir 24
      recorrerR1(cantPapeles,posicion)
      Pos(posicion,1)
    Informar(cantFlores)
  fin
  robot robot2
  variables
    posicion:numero
    cantPapeles:numero
  comenzar
    cantPapeles:=0
    posicion:=26
    Pos(pos,1)
    repetir 24
      recorrerR2(cantPapeles,posicion)
      Pos(posicion,1)
    posicion:=76
    repetir 24
      recorrerR2(cantPapeles,posicion)
      Pos(posicion,1)
    Informar(cantPapeles)   
  fin
variables
  Rbot1:robot1
  Rbot2:robot2
comenzar 
  AsignarArea(Rbot1,Area1)
  AsignarArea(Rbot1,Area3)
  AsignarArea(Rbot2,Area2)
  AsignarArea(Rbot2,Area4)
  Iniciar(Rbot1,2,2)
  Iniciar(Rbot2,2,26)
fin