import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> hotelItems = new ArrayList<String>();
        hotelItems.add("AluPuri");
        hotelItems.add("Panipuri");
        hotelItems.add("Pav Bhaji");
        hotelItems.add("Bhelpuri");
        Collections.sort(hotelItems);
        System.out.println(hotelItems);
        for (Iterator i = hotelItems.iterator(); i.hasNext();) { 
        System.out.println(i.next());
        }
    }
}
