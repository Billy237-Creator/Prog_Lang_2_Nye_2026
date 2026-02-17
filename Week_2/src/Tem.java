public class Temp {
    public static void main(String[] args) {
        // Just change this number and re-run the program
        int temp = 25;

        if (temp < 0) {
            System.out.println("Below freezing");
        } else if (temp < 30) {
            System.out.println("Average");
        } else {
            System.out.println("Too hot");
        }
    }
}