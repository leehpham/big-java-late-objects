import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
Describes a running program
*/
public class Program
{
    private User currentUser;

    /**
     * Constructs a program
     */
    public Program()
    {
        currentUser = new User();
    }

    /**
     * Runs the program
     */
    public void run()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to LeeMail");
        while (true)
        {
            System.out.println("1. Sign Up");
            System.out.println("2. Sign In");
            System.out.println("3. Exit");
            System.out.print("Please enter your action: ");
            int userChoice = sc.nextInt();
            switch (userChoice)
            {
                case 1:
                    signUp(sc);
                    break;
                case 2:
                    signIn(sc);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid option");
            }
            if (userChoice == 3)
            {
                break;
            }
        }
        sc.close();
        System.out.println("See you next time!");
    }

    /**
     * Allows a user to sign in
     * @param sc The Scanner object to get user input
     */
    private void signIn(Scanner sc)
    {
        ArrayList<User> users = new ArrayList<User>();
        String line = "";        
        try
        {
            FileReader fileReader = new FileReader("users.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null)
            {
                String[] tokens = line.split(",");
                users.add(new User(tokens[0], tokens[1]));
            }

            bufferedReader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        
        while (true)
        {
            System.out.print("Enter your username: ");
            String userName = sc.next();
            System.out.print("Enter your password: ");
            String password = sc.next();

            boolean found = false;
            
            
            for (User user : users)
            {
                if (user.getUsername().equals(userName) && user.getPassword().equals(password))
                {
                    found = true;
                    currentUser.setUsername(userName);
                    currentUser.setPassword(password);
                }
                break;
            }
            if (found == false)
                System.out.println("Incorrect username or password. Please try again.");
            else
            {
                System.out.println("Logged in as " + currentUser.getUsername());
                break;
            }
        }
    }

    /**
     * Allows a user to sign up
     * @param sc the Scanner object to get user input
     */
    private void signUp(Scanner sc)
    {
        System.out.print("Enter your new username: ");
        String newUsername = sc.next();
        System.out.print("Enter your new password: ");
        String newPassword = sc.next();
        try
        {
            FileWriter fileWriter = new FileWriter("users.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.append(String.format("%s,%s\n", newUsername, newPassword));
            bufferedWriter.close();
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }
}