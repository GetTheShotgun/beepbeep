import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Beeper implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        // zo kan je een "beep" laten horen:
        Toolkit.getDefaultToolkit().beep();
    }
}
