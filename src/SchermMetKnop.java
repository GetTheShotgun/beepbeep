import javax.swing.*;

public class SchermMetKnop {
    public static void main(String[] args) {
        JFrame scherm = new JFrame("piep");
        scherm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        scherm.setSize(300, 300);
        JButton knop = new JButton("click here");
        knop.addActionListener(new Beeper());
        knop.addActionListener(new Knopteller());
        scherm.add(knop);
        scherm.setVisible(true);
    }
}

