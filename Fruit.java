class Fruit {
  String name;
  String color;
  String taste;
  String texture;

  void displayInfo() {
      System.out.println("Fruit Name: " + name);
      System.out.println("Color: " + color);
      System.out.println("Taste: " + taste);
      System.out.println("Texture: " + texture);
  }
  void ripen() {
      System.out.println("The " + color +" "+ name + " is ripening.");
}
  void eat() {
      System.out.println("I like to eat " + color + " " + name + "" + ". It tastes " + taste + " and feels " + texture + ".");
}

    
public static void main(String[] args) {
  Fruit apple = new Fruit();

  apple.name = "Apple";
  apple.color = "Red";
  apple.taste = "Sweet";
  apple.texture = "Crisp";

  apple.displayInfo();
  apple.ripen();
  apple.eat();
  System.out.println("------------------------");

  Fruit banana = new Fruit();

  banana.name = "Banana";
  banana.color = "Yellow";
  banana.taste = "Sweet";
  banana.texture = "Soft";

  banana.displayInfo();
  banana.ripen();
  banana.eat();
  System.out.println("------------------------");

  Fruit mango = new Fruit();

  mango.name = "Mango";
  mango.color = "Green";
  mango.taste = "Sour";
  mango.texture = "Juicy";

  mango.displayInfo();
  mango.ripen();
  mango.eat();
  System.out.println("------------------------");

  }
  }
