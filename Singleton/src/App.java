public class App {

    public static void main(String[] args){

        // Instantiating Singleton class with variable x
        Singleton x = Singleton.getInstance();

        // Instantiating Singleton class with variable y
        Singleton y = Singleton.getInstance();

        // Instantiating Singleton class with variable z
        Singleton z = Singleton.getInstance();

        // Printing the hash code for above variable as
        // declared

        System.out.println("Ashcode of x is " + x.hashCode());

        System.out.println("Ashcode of x is " + y.hashCode());

        System.out.println("Ashcode of x is " + z.hashCode());

        // Condtion check
        if (x == y && y == z) {
            // Print Statement
            System.out.println("Three ojects point to the same memory location on the heap i.e. to the same object");
        }

        else {
            // Print statement
            System.out.println("Three objects DO NOT print to the same memory location on the heap");
        }
    }
}
