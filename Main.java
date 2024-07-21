import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> rentedVehicles = new ArrayList<>();

         Scanner scanner=new Scanner(System.in);

         while (true){
             System.out.println("Vehicle Rental System");
             System.out.println("1. Rent a Car");
             System.out.println("2. Rent a Bike");
             System.out.println("3. Rent a Truck");
             System.out.println("4. View Rented Vehicles");
             System.out.println("5. Exit");
             System.out.print("Enter your choice:");
             int input= scanner.nextInt(); //allow user to rent vehicles, calculate , details
             scanner.nextLine();

          switch (input){
              case 1:
                  //Prompt the user for the car model and rental days.
                  System.out.println();
                  System.out.print("Write Car Model: ");
                  String model = scanner.nextLine();
                  System.out.print("Write Rental Days: ");
                  int days = scanner.nextInt();
                  scanner.nextLine();
                  Car car = new Car(model, days);
                  rentedVehicles.add(car);
                  car.displayDetails();
                  break;
              case 2:
                  //Prompt the user for the bike brand and rental hours
                  System.out.println();
                  System.out.println(" Write Brand bike ");
                  String brand=scanner.nextLine();
                  System.out.println(" Write Hours: ");
                  int hours= scanner.nextInt();
                  scanner.nextLine();
                  Bike bike=new Bike(brand,hours);
                  rentedVehicles.add(bike);
                  bike.displayDetails();
                  break;
              case 3:
                  // Prompt the user for the truck type and rental weeks.
                  System.out.println();
                  System.out.println(" Write Trucks Type: ");
                  String type=scanner.nextLine();
                  System.out.println(" Write Weeks: ");
                  int weeks= scanner.nextInt();
                  scanner.nextLine();
                  Trucks trucks=new Trucks(type,weeks);
                  rentedVehicles.add(trucks);
                  trucks.displayDetails();
                  break;
              case 4:
                  //Display details of all rented vehicles.
                  System.out.println(" Rented Vehicles ");
                  for(Vehicle v:rentedVehicles){
                      v.displayDetails();
                      System.out.println();
                  }
                  break;

              case 5:
                  //Exit the program.
                  System.out.println(" Thank you for using the Vehicle Rental System! ");
                  return;
              default:
                  System.out.println(" invalid input ");
                  break;


          }
    }
  }
}