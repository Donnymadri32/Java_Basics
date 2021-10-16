public class main{
    public static void main(String[] args){
        Creature Pikachu = new Creature("Pikachu", 1000, 100, 100, "Electric");
        System.out.println(Pikachu.getName());
        System.out.println(Pikachu.getCount());
        System.out.println(Pikachu.id);
        Pikachu.attack();
        Creature Squirtle = new Creature("Squirtle", 200, 100, 100, "Electric");
        Creature.fight(Pikachu, Squirtle);
        Creature.test();
    }
}
