#include <iostream>
#include <stdio.h>

class HolaMundo
{

  //Atributos
  std::string message = "Hola Mundo!";	

  public:

    //Constructores
    HolaMundo(void);
    HolaMundo(std::string mensaje);
  
    //Metodos
    void say_hello(void);
};
