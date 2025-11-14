class Movie {
  String title;
  String genre;
  double rating;
  
   Movie(String favtitle, String favgenre, double favrating){
    title = favtitle;
    genre = favgenre;
    rating = favrating;
  }
  
  public void displayInfo() {
    System.out.println("------Movie------");
    System.out.println("Title: " + title);
    System.out.println("Genre: " + genre);
    System.out.println("Rating: " + rating);
    System.out.println("-----------------");
  }
}
public class Main{
  public static void main(String[] args) {
    
    Movie favMovie1 = new Movie("Cruella", "Comedy Crime", 9.5);
    Movie favMovie2 = new Movie("Ballerina", "Action/Thriller", 9.8);
    
    favMovie1.displayInfo();
    favMovie2.displayInfo();
  }
}
