import java.util.ArrayList;

public class sub {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
       System.out.println(subarrlist("","abc",list)); 
    }
    static void sub(String s, String up){
        if(up.isEmpty()){
            System.out.println(s);
            return ;
        }
char ch = up.charAt(0);
sub(s+ch, up.substring(1));
sub(s, up.substring(1));

    }
      static ArrayList<String> subarrlist(String s, String up,ArrayList<String> list){
        if(up.isEmpty()){
            list.add(s);
            return list;
        }
char ch = up.charAt(0);
subarrlist(s+ch, up.substring(1),list);
subarrlist(s, up.substring(1),list);
return list;
    }
}
