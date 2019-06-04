class HelloWorld:
    def __init__(self,msg="Hola Mundo"):
        self.mensaje=msg
    def Say_Hello(self):
        print(self.mensaje)
def main():
    obj=HelloWorld()
    obj.Say_Hello()

    obj2=HelloWorld("Que chingue su madre el America")
    obj2.Say_Hello()
if __name__ == "__main__":
    main()