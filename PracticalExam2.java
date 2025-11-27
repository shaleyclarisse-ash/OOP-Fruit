class Person {
  String name,gender;
  double height, weight;
  final double Underweight = 18.5;
  final double Healthy_Weight = 24.9;
  final double Overweight = 29.9;
  final double Obese_1 = 34.9;
  final double Obese_2 = 39.9;
  final double Obese_3 = 40.0;
  
  Person(String name, String gender, double height, double weight) {
    this.name = name;
    this.gender = gender;
    this.height = height;
    this.weight = weight;
    
    System.out.println("");
    System.out.println("Name: " + name + " Gender: " + gender + " Height: " + height + " Weight: " + weight);
    System.out.println("");
  }
  
  void getInfo() {
    System.out.println("----Person's Information----");
    System.out.println("Name: " + name);
    System.out.println("Gender: " + gender);
    System.out.println("Height: " + height + " cm");
    System.out.println("Weight: " + weight + " kls");
  }
  
  void getGender(){
    System.out.println("Gender: " + gender);
  }
  
  void getHeight(){
    System.out.println("Height: " + (height / 100) + "m");
  }
  
  void getBodyMassIndex() {
    double height_m = height / 100;
    double BMI = weight / (height_m * height_m);
    System.out.println("--------------------------");
    
    if ( BMI <= Underweight ) {
        System.out.println("You are Underweight");
      } else if (BMI > Underweight && BMI <= Healthy_Weight) {
        System.out.println("You are Healthy");
      } else if (BMI > Healthy_Weight && BMI < Overweight) {
        System.out.println("You are Overweight");
      } else if (BMI > Overweight && BMI < Obese_1) {
        System.out.println("You are Obese 1");
      } else if (BMI > Obese_1 && BMI < Obese_2) {
        System.out.println("You are Obese 2");
      } else if (BMI > Obese_2 && BMI < Obese_3) {
        System.out.println("You are Obese 3"); 
      }
    
  }
}
