#include "Holamundo.hpp"

//Main

int main ()
{
    //variable locales
        std::string mensaje = "Hola mundo";
    
    //iniciar de objetos
        Holamundo Obj;
        Obj.msg = mensaje;
    //imprimir mensaje
        Obj.say_hello();
    
        Holamundo* Objeto = new Holamundo(mensaje);
    //Imprimir Mensaje
        Objeto-> say_hello();
    return 0;
    
    
}