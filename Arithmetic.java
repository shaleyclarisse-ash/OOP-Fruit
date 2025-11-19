public class Arithmetic {
  double a;
  double b;
  
  Arithmetic(double a, double b) {
    this.a = a;
    this.b = b;
    
    System.out.println("First Value is " + a + " " + "Second Value is " + b);
    System.out.println("__________________________________________________");
  }
        public double addition (double a, double b){    //Parameter
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
}
