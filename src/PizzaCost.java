import java.util.Scanner;
public class PizzaCost {

 
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       double size,topfin,sizefin,price;
       int top;
        System.out.print("What size of pizza do you want in inches: ");
        size = scan.nextDouble();
        System.out.print("How many toppings you want: ");
        top = scan.nextInt();
        topfin = top * .75;
        sizefin = size * .5;
        price = topfin + sizefin + 1.50 + .75;
        System.out.format("The final price fo your pizza is $%.2f\n",price);
        
        
       
        
    }
    
}
