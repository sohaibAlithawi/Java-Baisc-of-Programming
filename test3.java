import java.util.Scanner;

public class test3 {

    public static void main(String[] args) {
          int number1= 0, number2 = 0, number3 = 0;
          Scanner scanNum1 = new Scanner(System.in);
          Scanner scanNum2 = new Scanner(System.in);  
          Scanner scanNum3 = new Scanner(System.in);
        

          
          while (true) {

            System.out.println("Enter The First number");
            number1 = scanNum1.nextInt(); 
            System.out.println("Enter The Secound number");  
            number2 = scanNum2.nextInt();
            System.out.println("Enter The Third number");  
            number3 = scanNum3.nextInt();

          if (number1 == number2 && number1 == number3){

            System.out.println("These numbers are equal");
          }else if(number1 == number2 || number2 == number3){
                System.out.println("The Number1 is equal to number2 or number2 equal to number3");
          }
          else if (number1 > number2 ) {
            System.out.println("The number1 is greater to number2");

          }else if (number2 > number3 ) {
            System.out.println("The number2 is greater then number3");
          }
          else if (number1 != number2) {
            System.out.println("The number1 is not equal to number2 ");
          }else{
            System.out.println("error");
          }
            
          }
    }

}
