import java.util.Scanner;

public class Prime_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("num: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        if (num == 1 || num == 0) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;`
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("The given number " + num + " is a Prime number");
        } else {
            System.out.println("The given number " + num + " is NOT a Prime number.");
        }
    }
}
