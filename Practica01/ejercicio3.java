programa ej3
procesos 
  proceso vertical(ES altura:numero;ES papeles:numero;ES flores:numero)
  comenzar
    altura:=altura+1
    repetir altura
      si(HayFlorEnLaEsquina)
        tomarFlor
        flores:=flores+1
      si(HayPapelEnLaEsquina)
        tomarPapel
        papeles:=papeles+1
      mover
    derecha 
  fin
  proceso horizontal(ES base:numero;ES papeles:numero;ES flores:numero)
  comenzar
    base:=base+1
    repetir base
      si(HayFlorEnLaEsquina)
        tomarFlor
        flores:=flores+1
      si(HayPapelEnLaEsquina)
        tomarPapel
        papeles:=papeles+1
      mover
    repetir 3
      derecha 
  fin
areas
  ciudad: AreaC(1,1,100,100)
robots
  robot robot1
  variables
    base:numero
    altura:numero
    cantEscalones:numero
    cantFlores:numero
    cantPapeles:numero
  comenzar
    base:=1
    altura:=1
    cantFlores:=0
    cantPapeles:=0
    cantEscalones:=0
    Pos(6,12)
    repetir 4
      vertical(altura,cantPapeles,cantFlores)
      horizontal(base,cantPapeles,cantFlores)
      si(cantPapeles=cantFlores+1)
        cantEscalones:=cantEscalones+1
      cantPapeles:=0
      cantFlores:=0
    Informar(cantEscalones)
  fin
  robot robot2
  variables
    base:numero
    altura:numero
    cantEscalones:numero
    cantFlores:numero
    cantPapeles:numero
  comenzar
    base:=1
    altura:=1
    cantFlores:=0
    cantPapeles:=0
    cantEscalones:=0
    Pos(10,17)
    repetir 4
      vertical(altura,cantPapeles,cantFlores)
      horizontal(base,cantPapeles,cantFlores)
      si(cantPapeles=cantFlores+1)
        cantEscalones:=cantEscalones+1
      cantPapeles:=0
      cantFlores:=0
    Informar(cantEscalones)
  fin
  robot robot3
  variables
    base:numero
    altura:numero
    cantEscalones:numero
    cantFlores:numero
    cantPapeles:numero
  comenzar
    base:=1
    altura:=1
    cantFlores:=0
    cantPapeles:=0
    cantEscalones:=0
    Pos(14,22)
    repetir 4
      vertical(altura,cantPapeles,cantFlores)
      horizontal(base,cantPapeles,cantFlores)
      si(cantPapeles=cantFlores+1)
        cantEscalones:=cantEscalones+1
      cantPapeles:=0
      cantFlores:=0
    Informar(cantEscalones)
  fin
variables
  Rbot1:robot1
  Rbot2:robot2
  Rbot3:robot3
comenzar
  AsignarArea(Rbot1,ciudad)
  AsignarArea(Rbot2,ciudad)
  AsignarArea(Rbot3,ciudad)
  Iniciar(Rbot1,1,1)
  Iniciar(Rbot2,1,2)
  Iniciar(Rbot3,1,3)
fin