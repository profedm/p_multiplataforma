#include <HolaMundo.hpp>

int main()
{
    std::string mensaje = "Hello there!";

    HolaMundo Obj;
    Obj.message = mensaje;

    Obj.say_hello();

    HolaMundo* Obj1 = new HolaMundo(mensaje);

    Obj1->say_hello();
return 0;
}