import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

    public static void main(String[] args) {

        // HashSet does not retain order
        Set<String> set1 = new HashSet<>();

        // LinkedHashSet remembers the order you added items in
        Set<String> set2 = new LinkedHashSet<>();

        // TreeSet stores in natural order
        Set<String> set3 = new TreeSet<>();

        if (set1.isEmpty()) {
            System.out.println("Set is empty at start");
        }
        set1.add("dog");
        set1.add("cat");
        set1.add("mouse");
        set1.add("snake");
        set1.add("bear");

        set2.add("dog");
        set2.add("cat");
        set2.add("mouse");
        set2.add("snake");
        set2.add("bear");

        set3.add("dog");
        set3.add("cat");
        set3.add("mouse");
        set3.add("snake");
        set3.add("bear");


        // Adding duplicate items does nothing
        set1.add("mouse");

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);

        /////////////////////// Iteration ///////////////////////

        for(String element: set1) {
            System.out.println(element);
        }

        //////////////////// Does Set contain a given item? ///////////////////////
        if (set1.contains("aardvark")) {
            System.out.println("Contains aardvark");
        }
        if (set1.contains("cat")) {
            System.out.println("Contains cat");
        }


        ////////////////// Intersection ///////////////////////
        Set<String> set4 = new TreeSet<>();


        set4.add("dog");
        set4.add("cat");
        set4.add("giraffe");
        set4.add("monkey");
        set4.add("ant");

        Set<String> intersection = new HashSet<String>(set1);

        intersection.retainAll(set4);
        System.out.println(intersection);

        ////////////////////// Difference //////////////////

        Set<String> difference = new HashSet<String>(set1);

        difference.removeAll(set4);
        System.out.println(difference);
    }
}
