import java.util.*;

public class Circulo
{
        //Atributos
        double Area,Radio,Perimetro;
        static final double PI = 3.1416;

        //Costructores

        public Circulo()
        {
        };

        //Metodos

        public double Diametro (double r)
        {
            this.Radio = r;
            double diametro =  this.Radio*2;
            return diametro;

        }

        public double Perimetro (double d)
        {
            this.Perimetro = d*PI;
            return Perimetro;
        }

        public double Area (double r)
        {
            this.Area = PI*(r*r);
            return Area;
        }
}