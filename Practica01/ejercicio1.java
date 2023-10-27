programa ej1
areas 
  ciudad: AreaC(1,1,100,100)
robots
  robot robot1
  variables
    cantFlores:numero
    cantEsquinas :numero
  comenzar
    cantFlores:=0
    cantEsquinas:=0
    mientras(PosCa < 100)
      si (HayFlorEnLaEsquina)
        tomarFlor
        cantFlores:=cantFlores+1
      sino
        cantEsquinas:=cantEsquinas+1
      mover
    si (HayFlorEnLaEsquina)
      tomarFlor
      cantFlores:=cantFlores+1
    sino
      cantEsquinas:=cantEsquinas+1
    Informar(cantFlores,cantEsquinas)
  fin  
variables
  Rbot1:robot1
  Rbot2:robot1
  Rbot3:robot1
comenzar
  AsignarArea(Rbot1,ciudad)
  AsignarArea(Rbot2,ciudad)
  AsignarArea(Rbot3,ciudad)
  Iniciar(Rbot1,1,1)
  Iniciar(Rbot2,3,1)
  Iniciar(Rbot3,5,1)
fin