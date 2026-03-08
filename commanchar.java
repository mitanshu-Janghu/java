import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class commanchar {
   public static void main(String[] args) {
    String[] s ={"bella","label","roller"};
    System.out.println(commonChars(s));
   }
   static public List<String> commonChars(String[] words) {
        List<String> list = new ArrayList<>();
        HashMap<Character,Integer> h1 = new HashMap<>();
        for(int i = 0 ;i<words.length;i++){
            String s = words[i];
            int index=i-1;
            for(int j = 0 ;j<words[i].length();j++){
            
            if(h1.containsKey(i) && i!=index){
           h1.put(s.charAt(i),h1.get(s.charAt(i))+1);
           index++;}
    else
     h1.put(s.charAt(i),1);
        }

        }
Set<Character> set =h1.keySet();
for(char i : set){
    if(h1.get(i)==words.length) {
        list.add(String.valueOf(i));
        }
}
        return list;
    }
}

