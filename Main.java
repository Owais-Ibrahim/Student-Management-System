import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Greetings are you a student or a teacher?");
        String role = scan.next().toLowerCase();
        if(role.equals("student"))
            student();
        else
            teacher();
    }

    public static void teacher(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Hey would you like to 1.Login, 2.Register, or 3.Change Password? Please enter the integer for the following choice");
        int choice = scan.nextInt();
        System.out.println("Please enter your username:");
        String username = scan.next();
        System.out.println("Please enter your password:");
        String password = scan.next();
        Teacher teacher = new Teacher(username, password);
        System.out.println(teacher.getUsername());
        System.out.println(teacher.password);

    }
    public static void student(){
        System.out.println("Hey Student");
    }
}