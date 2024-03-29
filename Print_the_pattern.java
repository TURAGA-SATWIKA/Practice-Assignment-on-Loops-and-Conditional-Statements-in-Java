public class Print_the_pattern {
    public static void main(String[] args) {
        // Define the number of rows in the pattern
        int rows = 5;

        // Print the upper half of the pattern
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Print the lower half of the pattern
        for (int i = 2; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
