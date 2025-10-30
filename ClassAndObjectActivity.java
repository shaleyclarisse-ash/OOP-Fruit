class Gadget{
    String brand; 
    String type;
    int price;
}

void displayInfo(){
    System.out.println("Gadget Brand: " + brand);
    System.out.println("Gadget Type: " + type);
    System.out.println("Gadget Price: " + price);   
}

public static void main (String [] args){
    Gadget Samsung = new Gadget();
    Gadget Apple = new Gadget();
    Gadget Huawei = new Gadget();

    Samsung.brand = "Samsung";
    Samsung.type = "Android"; 
    Samsung.price = 35000;

    Samsung.displayInfo();
    System.out.println("--------------------------");

    Apple.brand = "Apple";
    Apple.type = "Ios";
    Apple.price = 30000;

    Samsung.displayInfo();
    System.out.println("--------------------------");

    Huawei.brand = "Huawei";
    Huawei.type = "Android";
    Huawei.price = 25000;

    Samsung.displayInfo();
    System.out.println("--------------------------");
}
