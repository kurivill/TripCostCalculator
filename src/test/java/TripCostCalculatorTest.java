import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TripCostCalculatorTest {

    @Test
    void main() {
        int distance = 100;
        double price = 2.5;
        double expected = 100 * 0.05 * 2.5;

    }

    @Test
    void calculator() {
    }

    @Test
    void calculateTotalCost() {
        double distance = 100;
        double fuelCost = 2.5;
        assertEquals(12.5, new TripCostCalculator().calculateTotalCost(distance, fuelCost));
    }
}