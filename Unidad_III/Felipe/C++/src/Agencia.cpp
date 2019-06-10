#include <Auto.hpp>


using namespace std;

int main()
{
    string Cmarca, Cmodelo, Ccolor;
    int Cyear, Ckilometros;
    
    cout << "Ingrese la marca" << std::endl;
    cin >> Cmarca;
    cout << "Ingrese el modelo" << std::endl;
    cin >> Cmodelo;
    cout << "Ingrese el año" << std::endl;
    cin >> Cyear;
    cout << "Ingrese el kilometraje" << std::endl;
    cin >> Ckilometros;
    cout << "Ingrese el color" << std::endl;
    cin >> Ccolor;
    
    Auto auto1;
    
     Auto* auto2 = new Auto(Cmarca,Cmodelo,Cyear,Ckilometros,Ccolor);
    
     auto1.checar();
     auto2->checar();

    cout << "Ingrese el nuevo color" << endl;
    cin >> Ccolor;
    auto2->pintar(Ccolor);

    cout << "Ingrese cuanto corrió" << endl;
    cin >> Ckilometros;
    auto2->correr(Ckilometros);

    cout << "Ingrese el nuevo modelo" << endl;
    cin >> Cmodelo;
    auto2->modificar(Cmodelo);

    auto2->checar();

return 0;

    
}