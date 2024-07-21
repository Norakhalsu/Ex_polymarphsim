public class Bike implements Vehicle{

    private final double hourly_rate=10;
    private String brand;
    private int hour;

    // Cobtructers
    public Bike(){

    }
    public Bike(String brand, int hour) {
        this.brand = brand;
        this.hour = hour;
    }

    // setter , getter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public double calculateRentalCost() {
        return hourly_rate*hour;
    }

    @Override
    public void displayDetails() {
        System.out.println(" vehicle information : ");
        System.out.println(" Bike Brand: "+brand);
        System.out.println(" Hours: "+hour);
        System.out.println(" Hourly Rental Rate: $"+hourly_rate);
        System.out.println(" Rental Cost $: "+calculateRentalCost());
        System.out.println();

    }
}
