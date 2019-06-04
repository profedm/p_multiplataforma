#include <auto.hpp>

Auto::Auto( void )
{
    marca = "Mazda";
    modelo = "v3";
    year = 2019;
    kilometros = 10000;
    color = "Rojo";
};

Auto::Auto(std::string cMarca, std::string cModelo, int cYear, int cKilo, std::string cColor)
{
    marca = cMarca;
    modelo = cModelo;
    year = cYear;
    kilometros = cKilo;
    color = cColor;
}
void Auto::Pintar(std::string cColor)
{
    color = cColor;
    std::cout<<"El color del auto es: "<<Auto::color<<std::endl;
}
void Auto::Correr(int cKilo)
{
    kilometros = (cKilo+kilometros);
    std::cout << "El kilometraje del auto es: " << Auto::kilometros << std::endl;
}
void Auto::Modificar(std::string cModelo)
{
    modelo = cModelo;
    std::cout << "El modelo del auto es: " << Auto::modelo << std::endl;
}
void Auto::Checar(void)
{
    std::cout << "La marca del auto es: " << Auto::marca << std::endl;
    std::cout << "El modelo del auto es: " << Auto::modelo << std::endl;
    std::cout << "El año del auto es: " << Auto::year << std::endl;
    std::cout << "El kilometraje del auto es: " << Auto::kilometros << std::endl;
    std::cout << "El color del auto es: " << Auto::color << std::endl;
}