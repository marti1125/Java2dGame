package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Escenario extends JPanel implements ActionListener {

    private static final long serialVersionUID = 1L;
    private Timer timer;
    private Nave nave;
    private String escenario = "luna.jpg";
    ImageIcon image_icon;

    public Escenario() {

        addKeyListener(new TAdapter());
        setFocusable(true);
        setBackground(Color.BLACK);
        setDoubleBuffered(true);

        image_icon = new ImageIcon(this.getClass().getResource(escenario));

        nave = new Nave();
        timer = new Timer(5, this);
        timer.start();
    }

    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(image_icon.getImage(), 0, 0, this);
        g2d.drawImage(nave.getImage(), nave.getX(), nave.getY(), this);

        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }

    public void actionPerformed(ActionEvent e) {
        nave.move();
        repaint();
    }

    private class TAdapter extends KeyAdapter {

        public void keyReleased(KeyEvent e) {
            nave.keyReleased(e);
        }
        
        public void keyPressed(KeyEvent e) {
            nave.keyPressed(e);
        }
    }
}



