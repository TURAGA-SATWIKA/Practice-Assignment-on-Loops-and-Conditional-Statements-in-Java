import java.util.*;

public class Unit_conversion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean bool = true;
        while (bool) {
            System.out.println("Menu based app - Unit conversion for Distance");
            System.out.println("1.CM to M");
            System.out.println("2.M to KM");
            System.out.println("3.KM to M");
            System.out.println("4.M to CM");
            System.out.print("Enter your menu - ");
            int choice = sc.nextInt();
            int value;
            if (choice == 1) {
                System.out.print("Please enter the CM Value: ");
                value = sc.nextInt();
                System.out.println(value + " CM = " + ((value * 0.01) + " M"));
            } else if (choice == 2) {
                System.out.print("Please enter the M Value: ");
                value = sc.nextInt();
                System.out.println(value + " M = " + ((value * 0.001) + " KM"));
            } else if (choice == 3) {
                System.out.print("Please enter the KM Value: ");
                value = sc.nextInt();
                System.out.println(value + " KM = " + ((value * 1000) + " M"));
            } else {
                System.out.print("Please enter the M Value: ");
                value = sc.nextInt();
                System.out.println(value + " M = " + ((value * 100) + " CM"));
            }
            System.out.print("Do you want to Continue: ");
            char ch = sc.next().charAt(0);
            if (ch == 'y') {
                bool = true;
            } else
                bool = false;
        }
    }
}
