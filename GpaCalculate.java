import java.util.*;

public class GpaCalculate {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Marks obtained by student");
        int Marks_obtained = sc.nextInt();
        System.out.println("Total Marks");
        int Total_Marks = sc.nextInt();
        float percentage = ((float) Marks_obtained / Total_Marks) * 100;
        System.out.println(String.format("%.2f", percentage) + "%");
        if ((percentage >= 0) && (percentage < 60)) {
            System.out.println("Grade F, GPA = 0.0 ");
        } else if ((percentage >= 60) && (percentage < 70)) {
            System.out.println("Grade D, GPA = 1.0 ");
        } else if ((percentage >= 70) && (percentage < 80)) {
            System.out.println("Grade C, GPA = 2.0 ");
        } else if ((percentage >= 80) && (percentage < 90)) {
            System.out.println("Grade B, GPA = 3.0 ");
        } else if ((percentage >= 90) && (percentage <= 100)) {
            System.out.println("Grade A, GPA = 4.0 ");
        }
    }
}
