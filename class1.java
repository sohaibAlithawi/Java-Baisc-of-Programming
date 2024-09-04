import java.util.Scanner;

public class class1 {
    
    public static void main(String[] args){
        
        int num1, num2,result;
        char cont = 'A';
        Scanner scanner = new Scanner(System.in);

        while (cont != 'E') {
            System.out.println("Enter your first number: ");
            num1 = scanner.nextInt();
            System.out.println("Enter your secound number: ");
            num2 = scanner.nextInt();

            System.out.print("Enter an operator (+, -, *, /):  OR for exit just press E Button");
            char operator = scanner.next().charAt(0);


            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("The result is: " + result);
                    break;

                case '-':
                    result = num1 - num2;
                    System.out.println("The result is: " + result);
                    break;   

                case '*':
                    result = num1 * num2;
                    System.out.println("The result is: " + result);
                    break;

                case '/':
                    result = num1 / num2;
                    System.out.println("The result is: " + result);
                    break;  
                case 'E':
                cont = 'E';
                     break;          
            
                default:   
                System.out.println("Error Invalid operator"); 
                    break;
            }
        }


    }
}
