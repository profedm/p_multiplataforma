import sys
sys.path.append("../include")
from Auto import Auto
Ncolor = input("Que color lo quieres pintar")
recorrido = int(input("Cuanto as corrido"))

#Costructores
Obj=Auto()
Obj.pintar(Ncolor)
Obj.correr(recorrido)
Obj.mostrar()
