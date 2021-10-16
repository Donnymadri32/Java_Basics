import java.util.Scanner;

public class GettingUserInput {
    public static void main(String[] args){

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Output the prompt
        System.out.println("Please enter your name");

        // Wait for the user to enter a name
        String newInput = input.next();

        // Tell them what they entered
        System.out.println("You have entered " + newInput);

        System.out.println("Now enter a number");

        int newNumber = input.nextInt();

        System.out.println("The number you entered was " + newNumber);
    }
}
