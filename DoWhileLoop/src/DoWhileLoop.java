import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /*
        System.out.println("Please enter a number.");
        int number = input.nextInt();

        while(number != 5) {
            System.out.println("Please enter a number.");
            number = input.nextInt();
        }
        */

        int number = 0;
        do {
            System.out.println("Please enter a number.");
            number = input.nextInt();
        }
        while(number != 5);

        System.out.println("Got 5!");
    }
}
