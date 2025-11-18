import java.util.Scanner;
public class Main {
    static class Calculator {
        public double addition (double a, double b){
            return a + b;
        }
        public double subtraction (double a, double b) {
            return a - b;
        }
        public double multiplication (double a, double b) {
            return a * b;
        }
        public double division (double a, double b) {
            if(a == 0 || b == 0){
                throw new IllegalArgumentException("Division by Zero is not allowed.");
            }
            return a / b;
        }
        public double modulo (double a, double b) {
            return a % b;
        }
    }
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Enter the first number: ");
        double a = scan.nextDouble();

        System.out.println("Enter the second number: ");
        double b = scan.nextDouble();

        scan.close();

        System.out.println("Addition Result: " + calc.addition(a, b));
        System.out.println("Subtraction Result: " + calc.subtraction(a, b));
        System.out.println("Multiplication Result: " + calc.multiplication(a, b));
        System.out.println("Division Result: " + calc.division(a, b));
        System.out.println("Modulo Result: " + calc.modulo(a, b));
        
    }
}
