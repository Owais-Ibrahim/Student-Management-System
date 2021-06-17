import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class Teacher {
    ArrayList <String> userList;
    ArrayList <String> passList;
    
    String firstName;
    String lastName;
    String username;
    String password;
   
    public Teacher(String user, String pass){
        username = user.toLowerCase();
        password = pass.toLowerCase();
    }

    public Teacher(String user, String pass, String fName, String lName){
        firstName = fName.toLowerCase();
        lastName = lName.toLowerCase();
        username = user.toLowerCase();
        password = pass.toLowerCase();
    }

    

    public String login(){
        //Getting UserList Ready
        try {
            File userFile = new File("teacher-user.txt");
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
            File userFile = new File("teacher-pass.txt");
            Scanner reader = new Scanner(userFile);
            while(reader.hasNextLine()){
                passList.add(reader.nextLine());
            }
            reader.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("Sorry, file not found!");
        }

        if(userList.contains(username)){
            int index = userList.indexOf(username);
            if(passList.get(index).equals(password)){
                return "You are logged in!";
            }
        }

        return "Sorry you have entered incorrect information.";
    }

    public String register(){
        //Add user and pass to desingated files
        //Create new txt file based on fname and lname
        //Add data to the new file
        return "Successfully Registered";
    }
    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }


    
}
