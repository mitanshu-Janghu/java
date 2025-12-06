import java.util.HashMap;
public class hashmap {
    public static void main(String[] args) {
        HashMap<String , Integer> hmap=new HashMap<>();
        hmap.put("no 1", 1);
        hmap.put("no 2", 2);
        hmap.put("no 3", 3);
        hmap.put("no 4", 4);
        hmap.put("no 5", 5);
        hmap.remove("no 5");
        
        System.out.println(hmap.get("no 4"));
    }
}
