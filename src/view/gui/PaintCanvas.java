package view.gui;

import javax.swing.JComponent;
import java.awt.*;

public class PaintCanvas extends JComponent {

    public Graphics2D getGraphics2D() {

        //RJK
        /*
        Graphics2D graphics = (Graphics2d)getGraphics();
        graphics.drawPolygon();     //draw triangles
        graphics.drawRect();        //draw rectangles
        graphics.drawOval();        //draw ellipses
        graphics.fillPolygon();     //fill triangles
        */
        //RJK End

        return (Graphics2D)getGraphics();
    }
}
