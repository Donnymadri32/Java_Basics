import java.util.ArrayList;
import java.util.HashMap;

public class App {

    public static void main(String[] args){

        ////////////////////// Before Java 5 ////////////////////////////
        ArrayList list = new ArrayList();

        list.add("apple");
        list.add("banana");
        list.add("orange");

        String fruit = (String)list.get(1);

        System.out.println(fruit);

        ///////////////////// Modern Style /////////////////////////////
        ArrayList<String> strings = new ArrayList<String>();

        strings.add("cat");
        strings.add("dog");
        strings.add("aliigator");

        String animal = strings.get(1);
        System.out.println(animal);

        for (String string: strings)
        {
            System.out.println(string);

        }

        ///////////////////// There can be more than one type argument //////////

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        ///////////////////// Java 7 style //////////////////////

        ArrayList<String> someList = new ArrayList<>();
    }
}
