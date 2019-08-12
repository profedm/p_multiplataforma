import java.awt.event.*;
import javax.swing.*;
import java.lang.*;

public class ActionExample
{
    public static void main (String [] args)
    {
        //Crear Frame
        JFrame f = new JFrame ("Ejemplo de boton");
        //Crear Caja de texto
        final JTextField tf = new JTextField();
        tf.setBounds ( 50,50,150,120);

        //Crear Boton
        JButton b= new JButton ("Alone");
        b.setBounds(50,200,95,30);

        b.addActionListener(new ActionListener()
            {public void actionPerformed(ActionEvent e)
                 {
                     tf.setText("Sigo sinendo inutil.");
                 }
 
             }
                            );

        f.add(b); f.add(tf);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    
    }
}