public class class2 {
    
    String firstName;
    String lastName;
    private char sex;

    public class2(String firstName,String lastName, char sex){
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
    }

    public void display (){

        System.out.println("First name is: " + firstName);
        System.out.println("Last Name is: " + lastName);
        System.out.println("Sex is: " + sex);

    }
}
