
public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor that accepts cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertToMiles(cashValue);
    }

    // Constructor that accepts miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = convertToCash(milesValue);
    }

    // Method to convert cash value to miles
    private double convertToMiles(double cashValue) {
        return cashValue * 1000; // Example: 1 dollar = 1000 miles
    }

    // Method to convert miles value to cash
    private double convertToCash(double milesValue) {
        return milesValue * 0.0035;
    }

    // Getter method for cash value
    public double getCashValue() {
        return cashValue;
    }

    // Getter method for miles value
    public double getMilesValue() {
        return milesValue;
    }
}
