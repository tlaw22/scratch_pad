public class Lasagna {

    // Expected oven time according to the recipe
    private final int expectedOvenTime = 40;

    // Minutes the lasagna has spent in the oven
    private int minutesInOven;

    // Number of layers in the lasagna
    private int numLayers;

    // Getter for minutesInOven
    public int getMinutesInOven() {
        return minutesInOven;
    }

    // Method to update the lasagna's cooking time
    public void remainingMinutesInOven(int minutesInOven) {
        this.minutesInOven = minutesInOven;
    }

    // Expected minutes the lasagna should be in the oven
    public int expectedMinutesInOven() {
        return expectedOvenTime;
    }

    // Remaining minutes in the oven based on actual time spent
    public int remainingMinutesInOven() {
        return expectedOvenTime - minutesInOven;
    }

    public int preparationTimeInMinutes() {
        return numLayers * 2;
    }

    // Total time spent cooking the lasagna
    public int totalTimeInMinutes(int minutesInOven) {
        return preparationTimeInMinutes() + minutesInOven;
    }
//e
    // Example usage
    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();
        lasagna.remainingMinutesInOven(20);
        System.out.println("Expected oven time: " + lasagna.expectedMinutesInOven() + " minutes");
        System.out.println("Remaining time in oven: " + lasagna.remainingMinutesInOven() + " minutes");
        System.out.println("Total cooking time so far: " + lasagna.totalTimeInMinutes(lasagna.getMinutesInOven()) + " minutes");
    }
}
