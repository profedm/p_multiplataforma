#include "Holamundo.hpp"

//Costructor
Holamundo::Holamundo(void){}
Holamundo::Holamundo(std::string mensaje)
{
    msg = mensaje;
}

//metodos
void Holamundo::say_hello(void)
{
    std::cout << msg << std::endl;
}