
import hsa.Console;
import java.awt.Color;

public class bar {
    int xloc, height;
    Color col;
    
    public void draw(Console c){
        c.setColor(col);
        c.fillRect(xloc,500-height,50,height);
        c.drawString("Value: "+ height, xloc,500 - height -10);
        
    }
}
