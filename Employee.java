import java.util.Scanner;

public class Employee {
    // Initializing variables
    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    private String str;

    public Employee() {
        // Get user input
        Scanner scan = new Scanner(System.in);


    System.out.println("pleas enter the first name : ");
    firstName = scan.nextLine();
    System.out.println("pleas enter the last name : ");
    lastName = scan.nextLine();
    System.out.println("pleas enter the age : ");
    age = scan.nextInt();
    System.out.println("pleas enter the salary : ");
    salary = scan.nextDouble();

    }

    public String toString() {
        str ="Employee information:" +firstName+ " " + lastName+ ","
                + " " + age + "," + " " + salary ;
        return str;
    }
}