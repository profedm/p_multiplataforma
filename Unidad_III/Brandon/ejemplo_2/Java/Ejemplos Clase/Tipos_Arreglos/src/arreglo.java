import java.*;

public class arreglo
{
    public static void main(String[] args) {
        String[] cars = {"Volvo","BMW","Ford","Mazda"};

        for(String i : cars)
        {
            System.out.println(i);
        }

        String[][] auto;

        auto = new String[][]{{"Volvo","BMW","Ford","Mazda"},{"2019","2018","1991","2013"}};


        for(int j=0;j<auto.length;j++)
        {
            for(int k=0;k<auto[0].length;k++)
            {
                System.out.println(auto[j][k]);
            }
        }
    }
}