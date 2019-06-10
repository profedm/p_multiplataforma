class Auto:
    #Cosntructor 
    def __init__(self, Marca ="Chevrolet", Modelo= 2019, Kilometraje = 14000, Color="Azul"):
        self.Marca = Marca
        self.Modelo = Modelo
        self.Kilometraje = Kilometraje
        self.Color = Color
        
    def mostrar (self):
        print(self.Marca)
        print(self.Modelo)
        print(self.Kilometraje)
        print(self.Color)
    
    def pintar (self, Ncolor):
        self.Color = Ncolor
        
    def correr (self, recorrido):
        self.Kilometraje = self.Kilometraje + recorrido
        