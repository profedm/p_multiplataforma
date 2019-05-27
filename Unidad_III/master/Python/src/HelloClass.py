import sys
sys.path.append("../include")
from HelloWorld import HolaMundo

#Generar objeto
Obj = HolaMundo("Hola hola tacubaya!")

#Imprimir mensaje
Obj.say_hello() 
