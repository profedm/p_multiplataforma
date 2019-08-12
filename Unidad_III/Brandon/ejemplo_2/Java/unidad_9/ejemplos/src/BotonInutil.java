import javax.swing.*;
public class BotonInutil
{
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(400,500);f.setLayout(null);

        JButton b = new JButton("ALONE");

        b.setBounds(130, 100, 100, 40);
        f.add(b);
        f.setVisible(true);
    }
}