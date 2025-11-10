public class Calculator {
    public void addNumbers(int a, int b){
        int sum = a + b;
        System.out.println("The sum is: " + sum);
    }
    public void subtractNumbers(int a, int b){
        int difference = a - b;
        System.out.println ("The difference is: " + difference);
    }
    
    public static void multiplyNumbers(int x, int y) {
        int product = x * y;
        System.out.println("The product is: " + product);
    }
    public static void divideNumbers(int x, int y) {
        int quotient = x / y;
        System.out.println("The quotient is: " + quotient);
    }
      
public static void main(String[] args){
  Calculator calc = new Calculator();
  
  calc.addNumbers(10, 20);

  calc.subtractNumbers(40, 10);

  Calculator.multiplyNumbers(5,6);

  Calculator.divideNumbers(2, 10);
}
}
