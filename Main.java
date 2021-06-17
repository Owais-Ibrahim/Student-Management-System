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
        switch (choice) {
            case 0:
            System.out.println("Hey would you like to \n1.Login \n2.Register\nPlease enter the integer for the following choice");
            try {
                choice = scan.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Sorry you entered an invalid character!");
                System.exit(1);
            }
            case 1:
                //login()
                break;
            case 2: 
                //register- add login info to teacher-login file and  create a teacher file where students name will be stored
                break;
            default:
                System.out.println("Sorry, you inputted a different number.");
                break;
        }
    }
    public static void student(){
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        switch (choice) {
            case 0:
            System.out.println("Hey would you like to \n1.Login \n2.Register\nPlease enter the integer for the following choice");
            try {
                choice = scan.nextInt();
                break;
            }catch (Exception e) {
                System.out.println("Sorry you entered an invalid character!");
                System.exit(1);
            }
            case 1:
                //login()
                System.out.println("Please enter your username?");
                String user = scan.nextLine();
                System.out.println("Please enter your password?");
                String pass = scan.nextLine();
                Teacher teacher = new Teacher(user,pass);
                System.out.println(teacher.login());
                break;
            case 2: 
                //register- add login info to student-login file and  create a student file where student's teacher and course info will be stored
                System.out.println("Please enter your first name?");
                String fname = scan.nextLine();
                System.out.println("Please enter your last name?");
                String lname = scan.nextLine();
                System.out.println("Please enter your username?");
                String newUser = scan.nextLine();
                System.out.println("Please enter your password?");
                String newPass = scan.nextLine();
                
                break;
            default:
                System.out.println("Sorry, you inputted a different number.");
                break;
        }
    }
}