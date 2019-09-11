
import java.util.Scanner;


public class Momentum {

    
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        double x,y,fin;
        System.out.println("Enter mass of object in kg: ");
        x = scan.nextDouble();
        System.out.println("Enter velocity of object in m/s");
        y = scan.nextDouble();
        fin = x * y;
        System.out.format("Your momentum is %.2f\n",fin);
    }
    
}
