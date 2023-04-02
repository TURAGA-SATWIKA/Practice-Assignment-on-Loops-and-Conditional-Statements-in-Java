import java.util.*;

public class Even_odd_checker {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean bool = true;
        while (bool) {
            System.out.println("Menu based app - Even/Odd Checker");
            System.out.print("Please enter the number ");
            int n = sc.nextInt();
            sc.nextLine();
            if (n % 2 == 0) {
                System.out.println("The given number - " + n + " is an EVEN Number");
            } else {
                System.out.println("The given number - " + n + " is a ODD Number");
            }
            System.out.print("Do you want to Continue: ");
            char ch = sc.next().charAt(0);
            if (ch == 'y' || ch == 'Y') {
                bool = true;
            } else
                bool = false;
        }
    }
}
