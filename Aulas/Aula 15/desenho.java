
package graficot1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JComponent;

public class Desenho extends JComponent{
        
    public void paint(Graphics g){
        g.fillRect(10, 10, 30, 30);
        g.setColor(Color.red);
        g.fillOval(50, 10, 30, 30);
        
        Polygon p = new Polygon ();
        
        p.addPoint(25, 10);
        p.addPoint(10, 40);
        p.addPoint(40, 40);
        
        g.setColor(Color.GREEN);
        
         g.fillPolygon(p);
        
    }
}
