import java.util.Scanner;

public class ScannerProject {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String userName;
        int age;
		System.out.println("What is your name? ");
        userName = scanner.nextLine();
        System.out.println("How old are you?");
        age = scanner.nextInt();
        if(userName.contains("Justin") && age == 45){
            System.out.println("Your name is " +userName+ " and you are "+age+" years old.");
        }else if(userName == ""){
            System.out.println("Error");
        }
		
	}

}
