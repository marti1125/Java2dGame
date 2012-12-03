package rtype;

/**
 *
 * @author martin
 */
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Craft {

    private static final long serialVersionUID = 1L;
    private String craft = "craft.png";
    private int dx;
    private int dy;
    private int x;
    private int y;
    private Image image;

    public Craft() {
        ImageIcon ii = new ImageIcon(this.getClass().getResource(craft));
        image = ii.getImage();
        x = 40;
        y = 60;
    }

    public void Move() {
        x += dx;
        y += dy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImage() {
        return image;
    }

    public void KeyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = -10;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 10;
        }

        if (key == KeyEvent.VK_UP) {
            dy = -10;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 10;
        }
    }
    
    public void KeyReleased(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP) {
            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }
}
