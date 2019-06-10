#include <iostream>
#include <stdio.h>

class Holamundo
{
     public:
    //Atributos
    std::string msg = "Hola mundo";
   
    
    //Costructores
    Holamundo(void);
    Holamundo(std::string msg);
    
    //Metodos
    void say_hello(void);
};