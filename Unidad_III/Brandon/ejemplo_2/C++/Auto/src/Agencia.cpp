#include <auto.hpp>

int main()
{
    std::string cMarca,cModelo,cColor;
    int cYear, cKilo;

    Auto auto1;

    std::cout << "Ingrese la marca" << std::endl;
    std::cin >> cMarca;
    std::cout << "Ingrese el modelo" << std::endl;
    std::cin >> cModelo;
    std::cout << "Ingrese el año" << std::endl;
    std::cin >> cYear;
    std::cout << "Ingrese el kilometraje" << std::endl;
    std::cin >> cKilo;
    std::cout << "Ingrese el color" << std::endl;
    std::cin >> cColor;

    Auto* auto2 = new Auto(cMarca,cModelo,cYear,cKilo,cColor);

    auto1.Checar();
    auto2->Checar();

    std::cout << "Ingrese el nuevo color" << std::endl;
    std::cin >> cColor;
    auto2->Pintar(cColor);

    std::cout << "Ingrese cuanto corrió" << std::endl;
    std::cin >> cKilo;
    auto2->Correr(cKilo);

    std::cout << "Ingrese el nuevo modelo" << std::endl;
    std::cin >> cModelo;
    auto2->Modificar(cModelo);

    auto2->Checar();


return 0;
}