public class Creature implements IPocketMonster{


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

        public static void test(){
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

        @Override
        public void returnHealth() {

        }

        @Override
        public void runAway() {

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
        if (one.strength > two.strength) {
            System.out.println(one.getName());
        } else System.out.println(two.getName());
    }


}

