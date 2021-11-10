import java.util.*;

public class App {

    public static void main(String[] args) {

        /*
        Consider:
        1. What do you need the collection to do
        2. Are you using the fastest collection for yo purposes
        (I think about insertion/deletion, retrieval, and traversal
         */

        //////////////////// LISTS ////////////////////////////////////

        // Store lists of objects
        // Duplicates are allowed
        // Objects remain in order
        // Elements are indexed via an integer
        // cf. shopping list
        // Checking for particular items in list is slow
        // Looking an item by index is fast
        // Note: You can sort lists if you want to.

        // If you only add or remove items at the end of list, use ArrayList.
        List<String> list = new ArrayList<String>();

        // Removing or adding items elsewhere in the list?
        List<String> list2 = new LinkedList<String>();

        /////////////////////// SETS ///////////////////////////////////

        // Only store unique values
        // Great for removing duplicates
        // Not indexed, unlike lists
        // Very fast to check if a particular object exists
        // If you want to use your own objects, you must implement hashCode() and equals().

        // Order is unimportant and OK if it changes?
        // HashSet is not ordered.
        Set<String> set1 = new HashSet<String>();

        // Sorted in natural order? Use TreeSet - must implement Comparable for custom types
        // (1,2,3 ...., a,b,c... etc)
        Set<String> set2 = new TreeSet<String>();

        // Elements remain in order they were added
        Set<String> set3 = new LinkedHashSet<String>();

        /////////////////////// MAPS ////////////////////////////////////////

        // Key value pairs.
        // Like lookup tables
        // Retrieving a value by key is fast
        // Iterating over maps values is very slow
        // Maps are not optimized for iteration
        // If you want to use your own objects as keys, you must implement hashCode() and equals()

        // Keys not in any particular order, and order liable to change
        Map<String, String> map1 = new HashMap<String, String>();

        // Keys sorted in natural order - must implement Comparable for custom types
        Map<String, String> map2 = new TreeMap<String, String>();

        // Keys remain in order added
        Map<String, String> map3 = new LinkedHashMap<String, String>();

        // There are also the SortedSet and SortedMap interfaces.
























    }
}
