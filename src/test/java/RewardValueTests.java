import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        RewardValue rewardValue = new RewardValue(100.0);

        // Check if converting $100 to miles
        assertEquals(100000.0, rewardValue.getMilesValue(), 0.001);
        // Explanation: 100 dollars * 1000 miles/dollar = 100000 miles
    }

    @Test
    void convert_from_miles_to_cash() {
        assert false;
    }
}
