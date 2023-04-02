import java.util.*;

class PrintTable {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(Number + " x " + i + " = " + (i * Number));
        }
    }
}