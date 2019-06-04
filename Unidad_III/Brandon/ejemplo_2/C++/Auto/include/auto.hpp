#include <stdio.h>
#include <iostream>

class Auto
{
    public:
    std::string marca;
    std::string modelo;
    int year;
    int kilometros;
    std::string color;

    Auto(void);
    Auto(std::string cMarca,std::string cModelo,int cYear,int cKilo,std::string cColor);

    void Pintar (std::string cColor);

    void Correr (int cKilo);

    void Modificar (std::string cModelo);

    void Checar (void);

};