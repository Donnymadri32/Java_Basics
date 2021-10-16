class Machine {
    private String name;
    private int code;
    public Machine(){
        this("Arnie", 0);
        System.out.println("Constructor running!");


    }

    public Machine(String name){
        this(name, 0);
        this.name = name;
        System.out.println("This is the second constructor!");
    }

    public Machine(String name, int code){
        this.name = name;
        this.code = code;
        System.out.println("This is the third constructor");
    }
}

public class Constructors {

    public static void main(String[] args){
        Machine machine1 = new Machine();

        //new Machine("Steve");

       // new Machine("Chalky", 7);

    }
}
