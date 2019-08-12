import java.*;
public class Matriz 
{
    public static void main (String args[])
    {
        String [][] cars;
        cars = new String [][] {{"volvo", "BMW","Ford","Mazda"},
                                  {"2019","2018","1991","2013"  }};

        String[][] autos = {{"volvo", "BMW","Ford","Mazda"},
      {"2019","2018","1991","2013" }};


      for (int i =0 ;i<cars.length; i++)
      {
          for (int j=0; j<autos[0].length; j++)
          {
             System.out.println(autos[i][j]);
          }
      }
    }
}