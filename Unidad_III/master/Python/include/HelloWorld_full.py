class HolaMundo:

  #Constructores
  def __init__(self, mensaje = "Hola mundo!"):
    self.message = mensaje
  
  #Metodos
  def say_hello(self):
    print self.message

def main():
  sam = HolaMundo("Hello world!")
  sam.say_hello()

if __name__ == "__main__":
  main()
