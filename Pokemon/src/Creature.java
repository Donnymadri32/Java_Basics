import java.util.*;

public class Creature implements IPocketMonster {


    private int count = 0;
    private String name = "Unkown";
    private int strength = 1;
    private int speed = 1;
    private int health = 1;
    private String type = "normal";
    public int id;

    public String getName() {
        return name;
    }

    public static void test() {
        System.out.println("This is a static method");
    }

    public int getStrength() {
        return strength;
    }

    public int getSpeed() {
        return speed;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public void returnHealth() {
        System.out.println(this.health);
    }

    @Override
    public void runAway() {
        double rand = Math.random() * (10);
        if (rand >= .5) {
            System.out.println("You ran away successfully");
        } else {
            System.out.println("You could not run away");
        }

    }

    public String getType() {
        return type;
    }

    public int getCount() {
        return count;
    }

    public Creature(String name, int strength, int speed, int health, String type) {
        count++;
        this.name = name;
        this.strength = strength;
        this.speed = speed;
        this.health = health;
        this.type = type;
        id = count;
    }

    public Creature() {

    }

    public void attack() {
        System.out.println(name + " attacked");
    }

    public static void fight(Creature one, Creature two) {
        if (one.speed > two.speed) {
            System.out.println(one.name + " attacks first");
            int battleHealth = two.health - one.strength;
            if (battleHealth <= 0) {
                two.setHealth(0);
                System.out.println(two.name + " has fainted");
                System.out.println(one.name + " has won the batlle!");

            }
        } else if (one.speed == two.speed) {
            double rand = Math.random() * (10);
            System.out.println(rand);
            if (rand >= 5) {
                System.out.println(one.name + " attacks first");
                int battleHealthTwo = two.health - one.strength;
                if (battleHealthTwo <= 0) {
                    two.setHealth(0);
                    System.out.println(two.name + " has fainted");
                    System.out.println(one.name + " has won the batlle!");
                }
            } else {
                System.out.println(two.name + " attacks first");
                int battleHealthThree = one.health - two.strength;
                if (battleHealthThree <= 0) {
                    one.setHealth(0);
                    System.out.println(one.name + " has fainted");
                    System.out.println(two.name + " has won the batlle!");

                }
            }
        } else {
            System.out.println(two.getName() + " attacks first");
            int battleHealthFour = one.health - two.strength;
            if (battleHealthFour <= 0) {
                two.setHealth(0);
                System.out.println(one.name + " has fainted");
                System.out.println(two.name + " has won the batlle!");
            }
        }

    }

}
