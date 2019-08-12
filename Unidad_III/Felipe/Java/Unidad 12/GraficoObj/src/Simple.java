import javax.swing.*;

public class Simple 
{
    JFrame f;

    Simple()
    {
        f = new JFrame();
        JButton b = new JButton("Alone");
        b.setBounds (130,100,100,40);
        f.add(b); 
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main (String [] args)
    {
        Simple sim = new Simple ();
        new Simple();
    }
}