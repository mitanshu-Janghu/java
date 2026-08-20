import java.util.HashMap;
public class anagramchecker2  implements anagramchecker{
   public boolean check(String s1,String s2){
HashMap<Character,Integer> map = new HashMap<>();
for(char ch : s1.toCharArray()){
if(map.containsKey(ch)){
map.put(ch,map.get(ch)+1);
}
else map.put(ch, 1);
}
for(char ch : s2.toCharArray()){
if(map.containsKey(ch)){
map.put(ch,map.get(ch)-1);
}
else return false;
}
for(char ch : map.keySet()){
    if(map.get(ch)!=0) return false;
}
    return true;}

}

