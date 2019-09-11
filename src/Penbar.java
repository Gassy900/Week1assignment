import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;
import java.awt.Color;
public class Penbar {
    int x,y,w;
    Color barColor;
    


public void draw(Pen p){
p.setColor(barColor);
p.up();
p.move(x,y);
p.setWidth(50);
p.down();
p.setDirection(0);
p.move
}
}
