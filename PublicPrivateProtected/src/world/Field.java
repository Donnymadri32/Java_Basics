package world;

public class Field {
    Plant plant2 = new Plant();

    public Field() {
        // This works.  Size is protected and field is in the same package as Plant.
        System.out.println(plant2.size);
    }
}
