import java.util.Scanner;

public class TripCostCalculator {

    private final double fuelComsumptionPerKm = 0.05;

    public void calculator() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance of the trip in km: ");
        double distance = sc.nextDouble();
        System.out.println("Enter the cost of fuel per litre: ");
        double fuelCost = sc.nextDouble();
        double totalCost = calculateTotalCost(distance, fuelCost);
        System.out.println("The total cost of the trip is: " + totalCost);
    }

    public double calculateTotalCost(double distance, double fuelCost) {
        double totalCost = distance * fuelComsumptionPerKm * fuelCost;
        return totalCost;
    }

}
