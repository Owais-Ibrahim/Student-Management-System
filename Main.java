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
                if(lteacher.login().equals("Sorry you have entered incorrect information.")){
                    System.out.println(lteacher.login());
                    System.exit(0);
                }
                System.out.println(lteacher.login());
                System.out.println("Please enter your first name?");
                String tfname = scan.next();
                System.out.println("Please enter your last name?");
                String tlname = scan.next();
                lteacher.viewFile(tfname, tlname);
                System.out.println("0. Quit! \n 1. Add student \n2. View Student \n3. Add Course for Student");
                choice = scan.nextInt();
                while(choice!=0){
                    if(choice == 1){
                        System.out.println("Please enter student's first name?");
                        String sfname = scan.next();
                        System.out.println("Please enter student's last name?");
                        String slname = scan.next();
                        lteacher.addStudent(sfname, slname);
                        lteacher.viewFile(tfname, tlname);
                        System.out.println("0. Quit! \n 1. Add student \n2. View Student \n3. Add Course for Student");
                        choice = scan.nextInt();
                    }
                    else if(choice == 2){
                        System.out.println("Please enter student's first name?");
                        String sfname = scan.next();
                        System.out.println("Please enter student's last name?");
                        String slname = scan.next();
                        lteacher.viewStudent(sfname, slname);
                        System.out.println("0. Quit! \n 1. Add student \n2. View Student \n3. Add Course for Student");
                        choice = scan.nextInt();
                    }
                    else if (choice == 3){
                        System.out.println("Please enter student's first name?");
                        String sfname = scan.next();
                        System.out.println("Please enter student's last name?");
                        String slname = scan.next();
                        System.out.println("Please enter student's course?");
                        String course = scan.next();
                        lteacher.addCourse(sfname, slname,course);
                        lteacher.viewStudent(sfname, slname);
                        System.out.println("0. Quit! \n1. Add student \n2. View Student \n3. Add Course for Student");
                        choice = scan.nextInt();
                    }
                    else{
                        System.out.println("Sorry wrong number was inputted, press 1 to add student or 0 to quit!");
                        choice = scan.nextInt();
                    }
                }
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
                if(lstudent.login().equals("Sorry you have entered incorrect information.")){
                    System.out.println(lstudent.login());
                    System.exit(0);
                }
                else{
                    System.out.println(lstudent.login());
                    System.out.println("Please enter your first name?");
                    String sfname = scan.next();
                    System.out.println("Please enter your last name?");
                    String slname = scan.next();
                    lstudent.viewFile(sfname, slname);
                }
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