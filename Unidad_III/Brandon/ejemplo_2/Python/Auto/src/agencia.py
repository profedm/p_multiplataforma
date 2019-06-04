import sys
sys.path.append("../include")
from auto import Auto

auto1 = Auto()

pMarca=input("Ingrese la marca:  ")
pModelo=input("Ingrese el modelo:  ")
pYear=input("Ingrese el año:  ")
pKilo=input("Ingrese el Kilometraje:  ")
pKilo=int(pKilo)
pColor=input("Ingrese el color:  ")

auto2 = Auto(pMarca,pModelo,pYear,pKilo,pColor)

auto1.Checar()
auto2.Checar()

pColor=input("Ingrese el nuevo color: ")
auto2.Pintar(pColor)

pKilo=input("Cuanto corrio el auto? ")
pKilo=int(pKilo)
auto2.Correr(pKilo)

pModelo=input("Cual es el nuevo modelo: ")
auto2.Modificar(pModelo)

auto2.Checar()
