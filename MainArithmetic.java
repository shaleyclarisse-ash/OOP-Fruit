import java.util.Scanner;
public class Main {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
       
        System.out.println("Enter the first number: ");
        double a = scan.nextDouble();

        System.out.println("Enter the second number: ");
        double b = scan.nextDouble();
        
        System.out.println();

        scan.close();
        
        Arithmetic calc = new Arithmetic(a, b);
        

        System.out.println("Addition Result: " + calc.addition(a, b)); //Argument
        System.out.println("Subtraction Result: " + calc.subtraction(a, b));
        System.out.println("Multiplication Result: " + calc.multiplication(a, b));
        System.out.println("Division Result: " + calc.division(a, b));
        
    }
}
