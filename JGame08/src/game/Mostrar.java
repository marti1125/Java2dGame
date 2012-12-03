package game;

/**
 *
 * @author martin
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

//imagen de 10 x 10

enum tiles{
    a1, a2, a3, a4, a5, a6, a7, a8, a9, a10,
    b1, b2, b3, b4, b5, b6, b7, b8, b9, b10,
    c1, c2, c3, c4, c5, c6, c7, c8, c9, c10,
    d1, d2, d3, d4, d5, d6, d7, d8, d9, d10,
    e1, e2, e3, e4, e5, e6, e7, e8, e9, e10,
    f1, f2, f3, f4, f5, f6, f7, f8, f9, f10,
    g1, g2, g3, g4, g5, g6, g7, g8, g9, g10,
    h1, h2, h3, h4, h5, h6, h7, h8, h9, h10,
    i1, i2, i3, i4, i5, i6, i7, i8, i9, i10,
    j1, j2, j3, j4, j5, j6, j7, j8, j9, j10
}

public class Mostrar extends JPanel{
    private static final int tW = 32; // tile width
    private static final int tH = 32; // tile height
    private static final tiles map[][] =
    {
        {tiles.a1,tiles.a2,tiles.a3,tiles.a4,tiles.a5,tiles.a6,tiles.a7,tiles.a8,tiles.a9,tiles.a10},
        {tiles.b1,tiles.b2,tiles.b3,tiles.b4,tiles.b5,tiles.b6,tiles.b7,tiles.b8,tiles.b9,tiles.b10},
        {tiles.c1,tiles.c2,tiles.c3,tiles.c4,tiles.c5,tiles.c6,tiles.c7,tiles.c8,tiles.c9,tiles.c10},
        {tiles.d1,tiles.d2,tiles.d3,tiles.d4,tiles.d5,tiles.d6,tiles.d7,tiles.d8,tiles.d9,tiles.d10},
        {tiles.e1,tiles.e2,tiles.e3,tiles.e4,tiles.e5,tiles.e6,tiles.e7,tiles.e8,tiles.e9,tiles.e10},
        {tiles.f1,tiles.f2,tiles.f3,tiles.f4,tiles.f5,tiles.f6,tiles.f7,tiles.f8,tiles.f9,tiles.f10},
        {tiles.g1,tiles.g2,tiles.g3,tiles.g4,tiles.g5,tiles.g6,tiles.g7,tiles.g8,tiles.g9,tiles.g10},
        {tiles.h1,tiles.h2,tiles.h3,tiles.h4,tiles.h5,tiles.h6,tiles.h7,tiles.h8,tiles.h9,tiles.h10},
        {tiles.i1,tiles.i2,tiles.i3,tiles.i4,tiles.i5,tiles.i6,tiles.i7,tiles.i8,tiles.i9,tiles.i10},
        {tiles.j1,tiles.j2,tiles.j3,tiles.j4,tiles.j5,tiles.j6,tiles.j7,tiles.j8,tiles.j9,tiles.j10}
    };
    private Image tileset;

    public Mostrar() {
        //tileset = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("aaaa.png"));
        ImageIcon ii = new ImageIcon(this.getClass().getResource("mapa_java.png"));
        tileset = ii.getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(0, 0, getWidth(), getHeight());

        for(int i=0;i<10;i++)
            for(int j=0;j<10;j++)
                drawTile(g, map[j][i], i*tW,j*tH);
    }

    protected void drawTile(Graphics g, tiles t, int x, int y){
        // map Tile from the tileset
        int mx = t.ordinal()%10;
        int my = t.ordinal()/10;
        g.drawImage(tileset, x, y, x+tW, y+tH,
                mx*tW, my*tH,  mx*tW+tW, my*tH+tH, this);
    }
}
