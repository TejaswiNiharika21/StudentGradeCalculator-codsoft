import java.util.*;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks (out of 100) for each subject:");
        int t = 0;
        int n;

        System.out.print("Number of subjects: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Marks for subject " + i + ": ");
            int m = sc.nextInt();
            t += m;
        }

        System.out.println("Total: " + t);

        double avg = (double) t / n;
        System.out.println("Average: " + avg);

        char g;
        if (avg >= 90) {
            g = 'A';
        } else if (avg >= 80) {
            g = 'B';
        } else if (avg >= 70) {
            g = 'C';
        } else if (avg >= 60) {
            g = 'D';
        } else {
            g = 'F';
        }

        System.out.println("Grade: " + g);

        sc.close();
    }
}
