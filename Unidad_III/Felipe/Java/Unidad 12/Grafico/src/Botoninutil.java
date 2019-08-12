import javax.swing.*;

public class Botoninutil
{
    public static void main (String [] args)
    {
        //crear instancia de Jframe
        JFrame f=new JFrame ();
        f.setSize (600,700);
        f.setLayout(null);

        //Crear Instancia de boton

        JButton b = new JButton ("Alone");

        //Fijar pisicion y tamaño
        b.setBounds (130,100,100,40);
        f.add(b);
        f.setVisible(true);
    }
}