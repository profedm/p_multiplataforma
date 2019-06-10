class HelloMundo:
    def __init__(self, msg="Hola mucno"):
        self.mensaje=msg
    
    
    def say_hello(self):
        print(self.mensaje)
        
def main ():
       
        
    #ejemplo constructor basico 
    obj=HelloMundo()
    obj.say_hello()
        
    #Ejemplo constructor definido
    Obj2=HelloMundo("Que chin su madre el america")
    Obj2.say_hello()
    
if __name__ =="__main__":
    main()