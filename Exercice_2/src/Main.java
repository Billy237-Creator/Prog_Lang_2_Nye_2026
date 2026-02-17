public class Main {
    public static void main(String[] args) {
        // We take the first argument provided (args[0])
        double seconds = Double.parseDouble(args[0]);

        // Repeat/Check if the value is negative
        if (seconds < 0) {
            System.out.println("Error: Value cannot be negative!");
        } else {
            // Calculate: Distance = Seconds * 300 m/s
            double distance = seconds * 300;
            System.out.println("The strike was " + distance + " meters away.");
        }
    }
}