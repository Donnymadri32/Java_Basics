import java.util.Scanner;

public class main{
    public static void main(String[] args){
        int counter = 0;

        Scanner input = new Scanner(System.in);

        // Output the prompt
        System.out.println("Welcome to the wonderful world of Pocket Monsters!\nPlease enter your name:");

        // Wait for the user to enter a name
        String newInput = input.next();

        // Tell them what they entered
        System.out.println("Hello " + newInput + "! \nIt is now time to choose your pokemon:");
        System.out.println("Press B for Bulba\n Press C for Char\n press S for Squir");

        Creature Evie = new Creature("Evie", 200, 100, 100, "Normal");

        String newInput2 = input.next();
        switch(newInput2){

            case "B":
            case "b":
                Creature Bulba = new Creature("Bulbasaur", 200, 100, 100, "Grasss");
                System.out.println("You choose Bulba");
                Creature.fight(Bulba, Evie);
                break;

            case "C":
            case "c":
                Creature Char = new Creature("Charizard", 200, 100, 100, "Fire");
                System.out.println("You choose Char");
                Creature.fight(Char, Evie);
                break;

            case "S":
            case "s":
                Creature Squir = new Creature("Squirtle", 200, 100, 100, "Electric");
                System.out.println("You choose Squir");
                Creature.fight(Squir, Evie);
                break;

            default:
                System.out.println("Command not recognized");
        }

        /*
        System.out.println("Now enter a number");

        while(true) {
            int newNumber = input.nextInt();
            counter++;
            if (newNumber == 0)
                break;
        }

         */

       // System.out.println("You entered " + (counter - 1) + " numbers");
     //   Creature Pikachu = new Creature("Pikachu", 1000, 100, 100, "Electric");
        //System.out.println(Pikachu.getName());
       // System.out.println(Pikachu.getCount());
       // System.out.println(Pikachu.id);
        //Pikachu.attack();
      //  Creature Squirtle = new Creature("Squirtle", 200, 100, 100, "Electric");
       // Creature.fight(Pikachu, Squirtle);
        //Creature.test();
    }
}
