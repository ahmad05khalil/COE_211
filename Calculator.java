import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private String operator;
    private String c = "";
    private int result;

    // Constructor to initialize the calculator
    public Calculator() {
        // Get user input
        Scanner scanCalc = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int num1 = scanCalc.nextInt();
        scanCalc.nextLine();
        System.out.println("please enter the operator:\n(+, -, x, /)");
        String i =scanCalc.nextLine();
        System.out.print("Input the second number: ");
        int num2 = scanCalc.nextInt();
        scanCalc.nextLine();

        // Decide on the operation to perform
        for(int k = 1; k>0;){
            try {
                switch (i) {
                    case "+":
                        add(num1, num2);
                        break;
                    case "-":
                        subtract(num1, num2);
                        break;
                    case "x":
                        multiply(num1, num2);
                        break;
                    case "/":
                        divide(num1, num2);
                        break;
                    default:
                        throw new CalculatorErrorOp();
                }
                k = -1;
            }catch (CalculatorErrorOp e) {
                System.out.println("\n-------------------------\nYour input is not valid\nplease enter a valid operator:\n(+, -, x, /)");
                i =scanCalc.nextLine();
                k = 1;
            }
        }
        System.out.println(c);
    }

    public String add(int a, int b) {
        result = a + b;
        c = ""+a + " + " + b + " = " + result;
        return c;
    }

    public String subtract(int a, int b) {
        result = a -b;
        c = ""+a + " - " + b + " = " + result;
        return c;
    }

    public String multiply(int a, int b) {
        result = a * b;
        c = ""+a + " x " + b + " = " + result;
        return c;
    }

    public String divide(int a, int b) {
        result = a / b;
        c = ""+a + " / " + b + " = " + result;
        return c;
    }
}