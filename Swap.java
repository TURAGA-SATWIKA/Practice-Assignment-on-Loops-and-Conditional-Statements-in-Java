import java.util.*;

public class Swap {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        System.out.println(numA + " " + numB);
        int temp = numB;
        numB = numA;
        numA = temp;
        System.out.println("numA = " + numA);
        System.out.println("numB = " + numB);
    }
}
