import java.util.InputMismatchException;
import java.util.Scanner;
public class EntryPoint {
    public static void main(String[] args) {
        for (int j =1; j > 0;)
            try {
                String str;
                Scanner scan = new Scanner(System.in);
                int i;
                System.out.println("Which service would you like to use?\n" +
                        "[1]: Basic week visualizer\n" +
                        "[2]: Advanced week visualizer\n" +
                        "[3]: Basic calculator\n" +
                        "[4]: Employee repertoire\n");
                i = scan.nextInt();

                if (i > 0 && i < 5) {
                    switch (i) {
                        case 1:
                            BasicWeek b = new BasicWeek();
                            b.printDays();
                            break;
                        case 2:
                            AdvancedWeek a = new AdvancedWeek();
                            a.printDays();
                            break;
                        case 3:
                            Calculator c = new Calculator();
                            break;
                        case 4:
                            Employee e = new Employee();
                            System.out.println(e.toString());
                            break;
                        default:
                            break;
                    }
                    scan.nextLine();
                    for (int k = 1; k>0;){
                        try {
                            System.out.println("Would you like to perform another operation? (y/n)");
                            str = scan.nextLine();
                            if (str.equalsIgnoreCase("y")) {
                                j = 1;
                                k = -1;
                            } else if (str.equalsIgnoreCase("n")) {
                                i = 10;
                                j = -1;
                                k = -1;
                            } else {
                                throw new IncorrectAnswer();
                            }
                        }catch (IncorrectAnswer e) {
                            System.out.println("please enter a valid input\n----------------------------------");
                            k = 1;
                        }
                    }
                }else {
                    System.out.println("please enter a valid input\n----------------------------------");
                }
            }catch (InputMismatchException ex){
                System.out.println("please enter a valid value\n----------------------------------");
            }
    }
}