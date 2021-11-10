import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class App {
    public static void main(String[] args) {
        HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
        LinkedHashMap<Integer, String> linkedHashMap= new LinkedHashMap<Integer, String>();
        TreeMap<Integer, String> treeMap= new TreeMap<Integer, String>();

        testMap(hashmap);
        System.out.println();
        testMap(linkedHashMap);
        System.out.println();
        testMap(treeMap);
    }

    public static void testMap(Map<Integer, String> map) {
        map.put(9, "fox");
        map.put(4, "giraffe");
        map.put(8, "swan");
        map.put(1, "snake");
        map.put(0, "bear");
        map.put(15, "dog");
        map.put(6, "cat");

        for(Integer key: map.keySet()) {
            String value = map.get(key);
            System.out.println(key + ": " + value);
        }
    }
}
