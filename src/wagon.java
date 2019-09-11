import hsa.*;
import java.awt.Color;
public class wagon {

    public static void main(String[] args) {
        Console c = new Console();
        c.setColor(Color.cyan);
        c.fillRect(0,0,650,500);
        c.setColor(Color.green);
        c.fillRect(0,400,800,500);
        c.setColor(Color.red);
        c.fillRect(80, 310, 350, 100);
        c.setColor(Color.black);
        c.fillOval(120, 380, 80, 80);
        c.fillOval(320, 380, 80, 80);
        c.setColor(Color.black);
        c.drawLine(80, 310, 50, 50);
        c.setColor(Color.yellow);
        c.fillOval(500, 80, 60, 60);
        
    
    
    }
    
}
