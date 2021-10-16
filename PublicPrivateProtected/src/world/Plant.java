package world;

public class Plant {

    // Bad Practice
    public String name;

    // Acceptable practice
    public final static int ID = 8;

    private String type;

    protected String size;

    int height;

    public Plant(){
        name = "Freddie";

        type = "Plant";

        size = "large";
    }


}
