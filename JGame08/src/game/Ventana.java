/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package game;

/**
 *
 * @author martin
 */
import javax.swing.JFrame;

public class Ventana extends JFrame{

    public Ventana() {
        add(new Mostrar());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(325, 350);
        setTitle("Juego de Pixiles en Java");
        setVisible(true);
    }

    public static void main(String[] args){
        new Ventana();
    }

}
