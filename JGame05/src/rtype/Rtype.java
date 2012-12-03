package rtype;

/**
 *
 * @author martin
 */
import javax.swing.JFrame;

public class Rtype extends JFrame{

    public Rtype() {
        add(new Board());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setTitle("R-Type");
        setResizable(true);
        setVisible(true);        
    }

    public static void main(String[] args){
        new Rtype();
    }
}
