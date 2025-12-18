import java.util.HashSet;
import java.util.Iterator;
public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();
        h.add(2);
        h.contains(1);
        h.remove(2);
        h.add(1);
        h.add(2);
        Iterator it =h.iterator();
        while(it.hasNext())
        System.out.println(it.next());
    }

}
