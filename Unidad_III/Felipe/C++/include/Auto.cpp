#include <Auto.hpp>

using namespace std;
//Costructores
Auto::Auto(void)
{
    marca = "KIA";
    modelo = "Seratto";
    year = 2017;
    kilometros= 30000;
    color = "Azul";
}

Auto:: Auto (string Cmarca, string Cmodelo, int Cyear, int Ckilometros, string CColor)
{
    marca = Cmarca;
    modelo = Cmodelo;
    year = Cyear;
    kilometros =Ckilometros;
    color = CColor;
}

//Metodos

void Auto::pintar(string a)
{
    color = a;
    cout<<"El color es"<<Auto::color<<endl;
    
}

void Auto::correr(int b)
{
    kilometros =kilometros+ b;
    cout<<"El kilometraje es"<<Auto::kilometros<<endl;
    
}

void Auto::modificar(string c)
{
    modelo= c;
    cout<<"El Modelo es"<<Auto::modelo<<endl;
    
}

void Auto::checar(void)
{
    cout<<"Marca"<<Auto::marca<<endl;
    cout<<"Año"<<Auto::year<<endl;
    cout<<"Color"<<Auto::color<<endl;
    cout<<"Kilometraje"<<Auto::kilometros<<endl;
    cout<<"Modelo"<<Auto::modelo<<endl;
    
}