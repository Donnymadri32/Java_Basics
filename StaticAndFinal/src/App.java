class Thing {
    // Instance variable
    public String name;
    // Class variable
    public static String description;
    public static int count = 0;

    public int id;

    public Thing() {
        id = count;
        count++;
    }
    // Constant variable
    public final static double OUR_PI = 3.141592653589793;

    public void showName(){
        System.out.println("Object id : " + id + ", " + description + ": " + name);
    }

    public static void showInfo(){
        System.out.println(description);
        // Won't work: System.out.println(name);
    }
}

public class App {

    public static void main(String[] args){

        Thing.description = "I am a thing";

        Thing.showInfo();

        System.out.println("Before creating objects, count is: " + Thing.count);

        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        System.out.println("After creating objects, count is: " + Thing.count);

        thing1.name = "Josh";
        thing2.name = "Sue";

        System.out.println(thing1.name);
        System.out.println(thing2.name);

        thing1.showName();
        thing2.showName();

        System.out.println(Math.PI);

        // Math.PI = 2;

        System.out.println(Thing.OUR_PI);
    }
}
