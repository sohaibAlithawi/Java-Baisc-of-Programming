import java.util.Scanner;

public class Calculator {


    public static void Calculation(Scanner scanner, int num1, int num2, int result,int choice){

       

        switch (choice) {
            case 1:

            System.out.println("Enter your first number: ");
            num1 = scanner.nextInt();
            System.out.println("Enter your secound number: ");
            num2 = scanner.nextInt();
            result = num1 + num2;
            System.out.println("The result is: " + result);
            break;

            case 2:
                System.out.println("Enter your first number: ");
                num1 = scanner.nextInt();
                System.out.println("Enter your secound number: ");
                num2 = scanner.nextInt();
                result = num1 - num2;
                System.out.println("The result is: " + result);
                break;

            case 3:
                System.out.println("Enter your first number: ");
                num1 = scanner.nextInt();
                System.out.println("Enter your secound number: ");
                num2 = scanner.nextInt();
                result = num1 * num2;
                System.out.println("The result is: " + result);
                break;

            case 4:
                System.out.println("Enter your first number: ");
                num1 = scanner.nextInt();
                System.out.println("Enter your secound number: ");
                num2 = scanner.nextInt();
                result = num1 / num2;
                System.out.println("The result is: " + result);
                break;

            case 5:

                break;

            default:
                break;
        }

    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice , num1 = 0, num2 = 0, result = 0;

        do {
            System.out.println("Enter your choice (1-5): ");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            choice = scanner.nextInt();

            Calculation(scanner, num1, num2, result, choice);

        } while (choice != 5);

    }

}
