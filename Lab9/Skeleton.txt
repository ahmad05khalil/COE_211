import java.util.Scanner;

public class Skeleton {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int labSessions, midterm, sum = 0;
        double result1, result2, result3;
        // Initialize array of integers
        int[] assignments = new int[5];
        // for loop to get user input & store in array
        for(int i = 0; i < assignments.length; i++) {
            System.out.println("Input the grade for assignment " + (i+1) );
            assignments[i] = scan.nextInt();
        }
        System.out.println("Input the number of attended labs");
        labSessions = scan.nextInt();
        System.out.println("Input the midterm grade");
        midterm = scan.nextInt();

        // for loop to iterate over the array & perform calculations
        for(int i = 0; i < assignments.length; i++ ) {
            sum += assignments[i];
        }
        result1 = (double) sum/5 * 0.3;
        result2 = labSessions * 100 * 0.05 / 7.0;
        result3 = midterm * 0.3;
        // display output to user
        System.out.println("Assignments (30%):" + result1 + "\n" + "Attendance (5%):" + result2 + "\n" + "Midterm (30%): " + result3);
    }
}