public class App {
  public static void main (String [] args) {
    
    User user1 = new User("Alice", "alice@gmail.com", "alice123", "admin", "00918273");
    User user2 = new User("Kier", "Kier@gmail.com");
    
    user1.getName();
    user1.setName("Kier Perd");
    
    System.out.println("Name: " + user1.getName());
    
    
  }
  
}
