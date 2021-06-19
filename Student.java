import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Student {
    ArrayList <String> userList = new ArrayList<String>();
    ArrayList <String> passList = new ArrayList<String>();
    
    // Login
    String username;
    String password;

    // Register
    String[] newUser = {"","","",""};

    String firstName;
    String lastName;
   
    public Student(String user, String pass){
        username = user.toLowerCase();
        password = pass.toLowerCase();
        defualt();
        
    }

    public Student(String user, String pass, String fName, String lName){
        newUser[0] = user.toLowerCase();
        newUser[1] = pass.toLowerCase();
        newUser[2] = fName;
        newUser[3] = lName;
        defualt();
    }

    
    public void defualt(){
        //Getting UserList Ready
        try {
            File userFile = new File("student-user.txt");
            Scanner reader = new Scanner(userFile);
            while(reader.hasNextLine()){
                userList.add(reader.nextLine());
            }
            reader.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("Sorry, file not found!");
        }

        //Getting PassList Ready
        try {
            File userFile = new File("student-pass.txt");
            Scanner reader = new Scanner(userFile);
            while(reader.hasNextLine()){
                passList.add(reader.nextLine());
            }
            reader.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("Sorry, file not found!");
        }
    }

    public String login(){
        //Checking if userlist contains the username if so lets check pass if so we are logged in 
        if(userList.contains(username)){
            int index = userList.indexOf(username);
            if(passList.get(index).equals(password)){
                return "You are logged in!";
            }
        }
        //else information is incorrect
        return "Sorry you have entered incorrect information.";
    }

    public String register(){
        //Add user and pass to desingated files
        //If username exists return already a user
        if(userList.contains(username))
            return "Sorry, a user is created for your username!" ;
        //If file exists for the fname and lname combination say file exists
        try {
            File newFile = new File(newUser[2]+"-"+newUser[3]+"-student.txt");
            if (!newFile.createNewFile()) 
               return ("File already exists!");
            
        } catch (IOException e) {
            return "An error occurred." ;
        }
               
        
        //Accessing and adding on files
        try {
            FileWriter writer = new FileWriter("student-user.txt",true);
            writer.write(newUser[0]);
            writer.write(System.lineSeparator());
            writer.close();
            
        } catch (IOException e) {
            System.out.println("Sorry, some error occured!");
        }
        try {
            FileWriter writer = new FileWriter("student-pass.txt",true);
            writer.write(newUser[1]);
            writer.write(System.lineSeparator());
            writer.close();
        } catch (IOException e) {
            System.out.println("Sorry, some error occured!");
        }

        //Add data to the new file
        
        try {
            FileWriter writer = new FileWriter(newUser[2]+"-"+newUser[3]+"-student.txt",true);
            for (String data: newUser){
                writer.write(data);
                writer.write(System.lineSeparator());
            }
            writer.write("Courses:");
            writer.write(System.lineSeparator());
            writer.close();
        } catch (IOException e) {
            System.out.println("Sorry, some error occured!");
        }
             
        return "Successfully Registered";
    }

    public void viewFile(String fname, String lname){
        firstName = fname;
        lastName = lname; 
        try {
            File userFile = new File(firstName+"-"+lastName+"-student.txt");
            Scanner reader = new Scanner(userFile);
            while(reader.hasNextLine()){
                System.out.println(reader.nextLine());
            }
            reader.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("Sorry, file not found!");
        }
    }


    

}
