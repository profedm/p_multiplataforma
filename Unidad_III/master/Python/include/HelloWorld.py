class HolaMundo:

  #Constructores
  def __init__(self, mensaje = "Hola mundo!"):
    self.message = mensaje
  
  #Metodos
  def say_hello(self):
    print self.message 
