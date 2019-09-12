
import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;
import java.awt.Color;
import java.util.Scanner;

public class barchart3 {

    int x, y, w;
    Color barColor;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Penbar pb1, pb2, pb3, pb4;
        pb1 = new Penbar();
        pb2 = new Penbar();
        pb3 = new Penbar();
        pb4 = new Penbar();

        while (true) {
            System.out.print("Enter bar 1 value: ");
            pb1.width = s.nextInt();
            if (pb1.width <= 450 && pb1.width >= 50) {
                break;
            }
        }
        while (true) {
            System.out.println("Enter bar 2 value: ");
            pb2.width = s.nextInt();
            if (pb2.width <= 450 && pb2.width >= 50) {
                break;
            }
        }
        while (true) {
            System.out.println("Enter bar 3 value: ");
            pb3.width = s.nextInt();
            if (pb3.width <= 450 && pb3.width >= 50) {
                break;
            }
        }
        while (true) {
            System.out.println("Enter bar 4 value: ");
            pb4.width = s.nextInt();
            if (pb4.width <= 450 && pb4.width >= 50) {
                break;
            }
        }
        Pen p = new StandardPen(new SketchPadWindow(800, 600));
        makebar(p, pb1, -350, 200, pb1.width, Color.blue);
        makebar(p, pb2, -350, 100, pb2.width, Color.orange);
        makebar(p, pb3, -350, 0, pb3.width, Color.green);
        makebar(p, pb4, -350, -100, pb4.width, Color.cyan);

    }

    public static void makebar(Pen p, Penbar pb, int x, int y, int w, Color c) {
        pb.x = x;
        pb.y = y;
        pb.width = w;
        pb.barColor = c;
        pb.draw(p);
    }
}
