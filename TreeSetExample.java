import java.util.*;


public class TreeSetExample {

    public static void main(String[] args) {
        SortedSet<String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("hydrabad");
        ts.add("Chennai");
        ts.add("Delhi"); // Duplicate Entry
        ts.remove("Delhi"); // Removing Delhi
        System.out.println("After Removing Delhi...");
        for(Iterator i = ts.iterator(); i.hasNext();){
            System.out.println(i.next());
        }

    }
}
