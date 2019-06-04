class Auto:
    def __init__(self,pMarca="Mazda",pModelo="v3",pYear=2019,pKilo=10000,pColor="Rojo"):
        self.marca=pMarca
        self.modelo=pModelo
        self.year=pYear
        self.kilo=pKilo
        self.color=pColor
    
    def Pintar(self,pColor):
        self.color=pColor
        print("El Nuevo color es: "+str(self.color))
    
    def Correr(self,pKilo):
        self.kilo=pKilo+self.kilo
        print("El auto viajo: "+str(self.kilo))
    
    def Modificar(self,pModelo):
        self.modelo=pModelo
        print("El Nuevo modelo es: "+str(self.modelo))
    
    def Checar(self):
        print("La marca es: "+str(self.marca))
        print("El modelo es: "+str(self.modelo))
        print("El año es: "+str(self.year))
        print("El kilometraje es: "+str(self.kilo))
        print("El color es: "+str(self.color))
