
import java.io.*;
import java.util.Scanner;
 
public class test1 {

    public static void main(String[] args){
        String firstName;
        int age =0;

        Scanner sName = new Scanner(System.in);   
        Scanner sAge = new Scanner(System.in);     
        
        
        System.out.println("Enter your name");
        firstName = sName.nextLine();

        while (true) {
        try{
            System.out.println("Enter your age");
                age = sAge.nextInt();

                System.out.println("Your name is : " + firstName + "Your age is : "+ age);
                break;
        }catch(Exception e){
                System.out.println("Wrong Input" + e);
                break;
        }

       }


    } 
 
           
        
}
