

public class Trucks implements Vehicle{

    private  final double weekly_rate=500;
    private String type;
    private int week;

    // constructers
    public Trucks(){

    }
    public Trucks(String type, int week) {
        this.type = type;
        this.week = week;
    }

    // setter, getter
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    @Override
    public double calculateRentalCost() {
        return weekly_rate*week;
    }

    @Override
    public void displayDetails() {
        System.out.println(" vehicle information : ");
        System.out.println(" Truck Type: "+type);
        System.out.println(" Weeks: "+week);
        System.out.println(" Weekly Rate: "+weekly_rate);
        System.out.println(" Rental Cost $: "+calculateRentalCost());
        System.out.println();
    }
}
