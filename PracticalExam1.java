import java.util.Scanner;

public class App{
  public static void main (String [] args) {
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Enter your name: ");
    String name = scan.nextLine();
    
    System.out.println("Enter your gender: ");
    String gender = scan.nextLine();
    
    System.out.println("Enter your Height in Cm: ");
    double height = scan.nextInt();
    
    System.out.println("Enter your Weight in Kls: ");
    double weight = scan.nextInt();
    
    Person person = new Person(name, gender, height, weight);
    
    person.getInfo();
    person.getGender();
    person.getHeight();
    person.getBodyMassIndex();
    
    scan.close();
  }
}
