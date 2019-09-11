
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
        int x1, x2, x3, x4;
        System.out.println("Enter bar 1 value: ");
        x1 = s.nextInt();
        System.out.println("Enter bar 2 value: ");
        x2 = s.nextInt();
        System.out.println("Enter bar 3 value: ");
        x3 = s.nextInt();
        System.out.println("Enter bar 4 value: ");
        x4 = s.nextInt();
        

    }

    public static void makebar(Pen p, Penbar pb, int x, int y, int w, Color c){
            pb.x = x;
            pb.y = y;
            pb.w = w;
            pb.barColor = c;
            pb.draw(p);
}
}
