import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Greetings are you a student or a teacher?");
        String role = scan.nextLine().toLowerCase();
        if(role.equals("student"))
            student();
        else
            teacher();
    }

    public static void teacher(){
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        System.out.println("Hey would you like to \n1.Login \n2.Register\nPlease enter the integer for the following choice");
        try {
            choice = scan.nextInt();
            
        } catch (Exception e) {
            System.out.println("Sorry you entered an invalid character!");
            System.exit(0);
        }
        switch (choice) {
            case 1:
                //login()
                System.out.println("Please enter your username?");
                String user = scan.next();
                System.out.println("Please enter your password?");
                String pass = scan.next();
                Teacher lteacher = new Teacher(user,pass);
                System.out.println(lteacher.login());
                break;
            case 2: 
                //register()
                System.out.println("Please enter your first name?");
                String fname = scan.next();
                System.out.println("Please enter your last name?");
                String lname = scan.next();
                System.out.println("Please enter your username?");
                String newUser = scan.next();
                System.out.println("Please enter your password?");
                String newPass = scan.next();
                Teacher rteacher = new Teacher(newUser, newPass, fname, lname);
                System.out.println(rteacher.register());
                break;
            default:
                System.out.println("Sorry, you inputted a different number.");
                break;
        }
    }
    public static void student(){
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        System.out.println("Hey would you like to \n1.Login \n2.Register\nPlease enter the integer for the following choice");
        try {
            choice = scan.nextInt();
            
        } catch (Exception e) {
            System.out.println("Sorry you entered an invalid character!");
            System.exit(0);
        }
        switch (choice) {
            case 1:
                //login()
                System.out.println("Please enter your username?");
                String user = scan.next();
                System.out.println("Please enter your password?");
                String pass = scan.next();
                Student lstudent = new Student(user,pass);
                System.out.println(lstudent.login());
                break;
            case 2: 
                //register()
                System.out.println("Please enter your first name?");
                String fname = scan.next();
                System.out.println("Please enter your last name?");
                String lname = scan.next();
                System.out.println("Please enter your username?");
                String newUser = scan.next();
                System.out.println("Please enter your password?");
                String newPass = scan.next();
                Student rstudent = new Student(newUser, newPass, fname, lname);
                System.out.println(rstudent.register());
                break;
            default:
                System.out.println("Sorry, you inputted a different number.");
                break;
        }
    }
}