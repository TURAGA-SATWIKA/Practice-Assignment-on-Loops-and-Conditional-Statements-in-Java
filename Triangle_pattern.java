public class Triangle_pattern {
    public static void main(String[] args) {
        // Define the number of rows in the pattern
        int rows = 5;

        // Print the upper half of the pattern
        for (int i = 1; i <= rows; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        // Print the lower half of the pattern
        for (int i = rows - 1; i >= 1; i--) {
            if (i % 2 != 0) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
