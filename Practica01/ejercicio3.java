programa ej3
procesos 
  proceso cumple(ES ok:boolean;E flores:numero;E papeles:numero)
  variables
    flores_mas_uno:numero
  comenzar
    flores_mas_uno:=flores+1
    ok:=papeles>flores_mas_uno
  fin
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
    ok:boolean
    base:numero
    altura:numero
    cantEscalones:numero
    cantFlores:numero
    cantPapeles:numero
  comenzar
    base:=0
    altura:=0
    cantFlores:=0
    cantPapeles:=0
    cantEscalones:=0
    repetir 4
      vertical(altura,cantPapeles,cantFlores)
      horizontal(base,cantPapeles,cantFlores)
      cumple(ok,cantFlores,cantPapeles)
      si(ok)
        cantEscalones:=cantEscalones+1
      cantPapeles:=0
      cantFlores:=0
    Informar(cantEscalones)
  fin
variables
  Rbot1:robot1
  Rbot2:robot1
  Rbot3:robot1
comenzar
  AsignarArea(Rbot1,ciudad)
  AsignarArea(Rbot2,ciudad)
  AsignarArea(Rbot3,ciudad)
  Iniciar(Rbot1,12,14)
  Iniciar(Rbot2,17,10)
  Iniciar(Rbot3,22,6)
fin