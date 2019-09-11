
import hsa.Console;
import java.awt.Color;

public class barchart1 {

    public static void main(String[] args) {
        Console c = new Console();
        int b1, b2, b3, b4;

        while (true) {
            c.print("Enter hight of Bar 1: ");
            b1 = c.readInt();
            if (b1 <= 450 && b1 >= 50) {
                break;
            }
        }

        while (true) {
            c.print("Enter hight of Bar 2: ");
            b2 = c.readInt();
            if (b2 <= 450 && b2 >= 50) {
                break;
            }
        }

        while (true) {
            c.print("Enter hight of Bar 3: ");
            b3 = c.readInt();
            if (b3 <= 450 && b3 >= 50) {
                break;
            }
        }

        while (true) {
            c.print("Enter hight of Bar 4: ");
            b4 = c.readInt();
            if (b4 <= 450 && b4 >= 50) {
                break;
            }
        }

        c.clear();

        c.setColor(Color.yellow);
        c.fillRect(10, 500 - b1, 50, b1);
        c.drawString("Value: " + b1, 10, 500 - b1 - 20);

        c.setColor(Color.red);
        c.fillRect(110, 500 - b2, 50, b2);
        c.drawString("Value: " + b2, 110, 500 - b2 - 20);

        c.setColor(Color.blue);
        c.fillRect(210, 500 - b3, 50, b3);
        c.drawString("Value: " + b3, 210, 500 - b3 - 20);

        c.setColor(Color.orange);
        c.fillRect(310, 500 - b4, 50, b4);
        c.drawString("Value: " + b4, 310, 500 - b4 - 20);
    }

}
