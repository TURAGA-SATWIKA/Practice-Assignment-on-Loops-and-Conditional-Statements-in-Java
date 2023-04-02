import java.util.*;

public class Substring {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("stringName : ");
        String str = sc.nextLine();
        System.out.print("Starting index: ");
        int start = sc.nextInt();
        System.out.print("Ending index: ");
        int last = sc.nextInt();
        System.out.println(
                "subString of " + str + " from " + start + " to " + last + " is: " + str.substring(start, last + 1));
    }
}
