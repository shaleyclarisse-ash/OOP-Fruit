pubic class Calculator {
    public void addNumbers(int a, int b){
      int sum = a + b;
      System.out.println("The sum is: " + sum);
    }
    
    public static void multiplyNumbers(int x, int y) {
      int product = x * y;
      System.out.println("The product is: " + product);
    }
public static void main(String[] args){
  Calculator calc = new Calculator();
  
  calc.addNumbers(10, 20);
  
  Calculator.multiplyNumbers(5,6);
}
}
