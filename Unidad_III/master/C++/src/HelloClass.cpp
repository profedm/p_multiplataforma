#include <stdio.h>
#include <stdio.h>
#include "HolaMundo.hpp"

//Main
int main()
{

  //Variables locales
  std::string mensaje = "Hello there!";

  //Inicializar objetos
  HolaMundo* Obj = new HolaMundo(mensaje);

  //Imprimir mensaje
  Obj->say_hello();

return 0;
}
