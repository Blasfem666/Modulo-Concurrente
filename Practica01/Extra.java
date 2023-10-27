programa EXTRA
procesos 
proceso Juntar(ES flor :numero)
comenzar
    mientras(HayFlorEnLaEsquina)
        tomarFlor
        Flor:= Flor+1
fin
proceso Rectangulo(E alto:numero; E ancho:numero; ES flores:numero)
comenzar
    flores=0
    repetir 2
        repetir alto
            Juntar(flores)
            mover
        derecha
        repetir ancho
            Juntar(flores)
            mover
        derecha
fin
areas
    ciudad: AreaC(1,1,100,100)
robots 
    robot tipo1
    variables
        f:numero
    comenzar
        Rectangulo
        Informar(f)
    fin
variables 
    robot1:tipo1
    robot2:tipo1
comenzar
    AsignarArea(robot1,ciudad)
    Iniciar(robot1,2,2)
    AsignarArea(robot2,ciudad)
    Iniciar(robot2,8,8)
fin