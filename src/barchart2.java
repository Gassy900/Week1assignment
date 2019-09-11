
import hsa.Console;
import java.awt.Color;

public class barchart2 {

    public static void main(String[] args) {
        Console c = new Console();
        bar b1 = new bar();
        bar b2 = new bar();
        bar b3 = new bar();
        bar b4 = new bar();

        while (true) {
            c.println("Bar 1 value: ");
            b1.xloc = 10;
            b1.height = c.readInt();
            b1.col = Color.red;
            if (b1.height <= 450 && b1.height >= 50) {
                break;
            }
        }

        while (true) {
            c.println("Bar 2 value: ");
            b2.xloc = 110;
            b2.height = c.readInt();
            b2.col = Color.green;
            if (b2.height < 450 && b2.height >= 50) {
                break;
            }
        }

        while (true) {
            c.println("Bar 3 value: ");
            b3.xloc = 210;
            b3.height = c.readInt();
            b3.col = Color.orange;
            if (b3.height < 450 && b3.height >= 50) {
                break;
            }
        }

        while (true) {
            c.println("Bar 4 value: ");
            b4.xloc = 310;
            b4.height = c.readInt();
            b4.col = Color.blue;
            if (b4.height < 450 && b4.height >= 50) {
                break;
            }
        }

        c.clear();

        b1.draw(c);
        b2.draw(c);
        b3.draw(c);
        b4.draw(c);

    }

}
