#include <stdio.h>
#include <iostream>

class HolaMundo
{

 
 public:
     std::string message = "Hola Mundo";

     HolaMundo(void);
     HolaMundo(std::string mensaje);

     void say_hello(void);

};

