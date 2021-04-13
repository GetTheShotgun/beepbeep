import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Knopteller implements ActionListener {
    private int clicked;

    public void actionPerformed(ActionEvent e) {
        clicked++;
        System.out.println(clicked);
    }
}
