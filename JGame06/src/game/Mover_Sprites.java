package game;

import javax.swing.JFrame;

public class Mover_Sprites extends JFrame {

    private static final long serialVersionUID = 1L;

    public Mover_Sprites() {
        add(new Escenario());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(640, 480);
        setLocationRelativeTo(null);
        setTitle("Mover Sprites");
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Mover_Sprites();
    }
}

