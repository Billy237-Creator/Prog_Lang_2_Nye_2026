public class Main {
    public static void main(String[] args) {
        // args[0] takes the first word/number you type after the program name
        int temp = Integer.parseInt(args[0]);

        if (temp < 0) {
            System.out.println("Below freezing");
        } else if (temp < 30) {
            System.out.println("Average");
        } else {
            System.out.println("Too hot");
        }
    }
}