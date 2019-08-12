import javax.swing.*;

public class IconExample
{
    IconExample()
    {
        JFrame f = new JFrame("Boton Bonito");
        JButton b = new JButton(new ImageIcon("../include/icondoge.png"));
        b.setBounds(100,100,100,100);
        f.add(b); f.setSize(300,400);
        f.setLayout(null); f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        IconExample obj = new IconExample();
    }
}