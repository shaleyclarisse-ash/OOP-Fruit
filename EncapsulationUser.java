public class User {

      private String name;
      private String email;
      private String password;
      private String role;
      private String ContactNum;
      
      public User(String name, String email, String password, String role, String ContactNum) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
        this.ContactNum = ContactNum;
      }
      
      public User(String name, String email){
        this.name = name;
        this.email = email;
      }
  
    public String getName() {
      return name;
    }
    
    public String setName(String name) {
      this.name = name;
    }
}
