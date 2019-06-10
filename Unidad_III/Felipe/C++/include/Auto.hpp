#include <stdio.h>
#include <iostream>

using namespace std;

class Auto
{
  public: 
    string marca;
    string modelo;
    int year;
    int kilometros;
    string color;
    
    Auto (void);
    Auto (string Cmarca, string Cmodelo, int Cyear, int Ckilometros, string CColor);
    
    void pintar (string a);
    
    void correr (int b);
    
    void modificar (string c);
    
    void checar (void);
        
        
};