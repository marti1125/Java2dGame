package rtype;

/**
 *
 * @author martin
 */
import javax.swing.JFrame;

import javax.swing.JFrame;

public class Rtype extends JFrame {

    public Rtype() {

        add(new Board());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setTitle("R - Type");
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Rtype();
    }
}
