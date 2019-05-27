#include "HolaMundo.hpp"

//Constructores
HolaMundo::HolaMundo( void ){}

HolaMundo::HolaMundo(std::string  mensaje)
{
	message = mensaje;
}

//Metodos
void HolaMundo::say_hello(void)
{
	std::cout << message << std::endl; 
}

