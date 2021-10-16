import world.Plant;

/*
private --- only within same class
public --- from anywhere
protected --- subclass, and same package
no modifier -- same package only
 */

public class App {

    public static void main(String[] args){
       Plant plant1 = new Plant();
     //Oak oak1 = new Oak();

       System.out.println(plant1.name);
       System.out.println(plant1.ID);
        // Won't work.  type is private
        // System.out.println(plant1.type);
        // Size is protected.  App is not in the same package as Plant.
        //System.out.println(oak1.size);
        //Won't work; App and Plant in different packages, height has package-level visibility.
        //System.out.println(plant1.height);
    }
}
