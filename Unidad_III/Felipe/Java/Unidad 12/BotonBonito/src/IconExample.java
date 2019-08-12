import javax.swing.*;

public class IconExample
{
    IconExample()
    {
        JFrame f = new JFrame("Boton Bonito");
        JButton b = new JButton (new ImageIcon("../src/Icon.png"));
        b.setBounds (100,100,100,40);
        f.add(b);
        f.setSize(300,400);
        f.setLayout(null); 
        f.setVisible (true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main (String [] args)
    {
        IconExample obj = new IconExample();
        new IconExample();
    }
}