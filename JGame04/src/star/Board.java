package star;

/**
 *
 * @author martin
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements ActionListener {

    Image star;
    Timer timer;
    int x, y;

    public Board() {
        setBackground(Color.black);
        ImageIcon ii = new ImageIcon(this.getClass().getResource("star.png"));
        star = ii.getImage();

        setDoubleBuffered(true);

        x = y = 10;

        timer = new Timer(50, this);
        timer.start();
    }

    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(star, x, y, this);
        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }

    public void actionPerformed(ActionEvent ae) {
        x += 1;
        y += 1;

        if (y > 240) {
            y = -45;
            x = -45;
        }
        repaint();
    }
}
