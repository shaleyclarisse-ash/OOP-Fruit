public class MainGarage{
public static void main (String [] args){
    Garage myGarage = new Garage();
    Vehicle car1 = new Vehicle();
    Vehicle car2 = new Vehicle();
    
    Garage.GarageName = "Parking City Gate";
    
    car1.Brand = "Toyota";
    car1.type = "Sedan";
    car1.year = 2022;
    
    car2.Brand = "Porsche";
    car2.type = "Sports Car";
    car2.year = 1963;
  
    myGarage.displayGarage();
    car1.displayVehicle();
    car2.displayVehicle();
    
}
}
