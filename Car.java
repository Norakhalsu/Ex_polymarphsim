
public class Car implements Vehicle{

    private final double daily_rate = 50;
    private  String model;
    private int days;

    // constructer
    public Car(){

    }
    public Car(String model, int days) {
        this.model = model;
        this.days = days;
    }

    // setter , getter
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public double calculateRentalCost() {
        return daily_rate * days;
    }

    @Override
    public void displayDetails() {
        System.out.println(" vehicle information : ");
        System.out.println(" Car Model: "+model);
        System.out.println(" Days: "+days);
        System.out.println(" Daily Rental Rate: $"+daily_rate);
        System.out.println(" Rental Cost: $"+calculateRentalCost());
        System.out.println();
    }
}
