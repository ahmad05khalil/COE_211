import java.io.*;
import java.util.Scanner;

public class ExpensesTracker {
    public static void main(String[] args) throws IOException {
        // Create FileWriter & Scanner objects & y/n string
        Scanner scan = new Scanner(System.in);

        FileWriter fw = new FileWriter(new File("Expenses.txt"));
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter outToFile = new PrintWriter(bw);
        String name, purchase, answer1, answer2, logs;
        double payment;
        boolean flag = true;


        // Start gathering information inside the loop you will start
        while (flag) {
            System.out.println("Input your name: ");
            name = scan.nextLine();
            System.out.println("What did you purchase?");
            purchase = scan.nextLine();
            System.out.println("How much did you pay?");
            payment = scan.nextDouble();
            outToFile.println(name + " purchased " + purchase + " for " + payment + " US Dollars");
            scan.nextLine();
            System.out.println("Would you like to log another purchase? (y/n)");
            answer1 = scan.nextLine();
            if (answer1.equals("y")) {
                flag = true;
            } else {
                flag = false;
            }
        }
    }
}