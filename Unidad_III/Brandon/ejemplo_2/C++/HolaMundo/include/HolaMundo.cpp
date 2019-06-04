#include <HolaMundo.hpp>

HolaMundo::HolaMundo( void ){}
HolaMundo::HolaMundo(std::string mensaje)
{
    message = mensaje;
}

void HolaMundo::say_hello(void)
{
    std::cout << message << std::endl;
}