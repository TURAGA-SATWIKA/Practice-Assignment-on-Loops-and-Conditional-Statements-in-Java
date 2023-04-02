import java.util.*;

public class Small_avg_large {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("num1 = ");
        int num1 = sc.nextInt();
        System.out.print("num2 = ");
        int num2 = sc.nextInt();
        System.out.print("num3 = ");
        int num3 = sc.nextInt();

        int small = num1;
        if (num2 < small) {
            small = num2;
        }
        if (num3 < small) {
            small = num3;
        }

        int large = num1;
        if (num2 > large) {
            large = num2;
        }
        if (num3 > large) {
            large = num3;
        }

        System.out.println("The Smallest Number: " + small);
        System.out.println("The Largest Number: " + large);
        System.out.println("Average of all three numbers: " + (num1 + num2 + num3) / 3);

    }
}
