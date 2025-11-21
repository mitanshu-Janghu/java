import java.util.ArrayList;

public class subset {
    public static void main(String[] args) {
        
        System.err.println(subsetarr("", "abc"));
    }
    static ArrayList<String> subsetarr(String a,String b){
        if(b.isEmpty()){
           ArrayList<String> list = new ArrayList<>();
           list.add(a);
           return list;
        } 
        char ch = b.charAt(0);
         ArrayList<String> list1=subsetarr(a,b.substring(1)); 
         ArrayList<String> list2=subsetarr(a+ch,b.substring(1));
       list1.addAll(list2) ;
       return list1 ;}
       static void subset(String p , String c){
        if(c.isEmpty()){
            System.out.println(p);
            return ;
        }
        char x = c.charAt(0);
        subset(p,c.substring(1));
        subset(p+x,c.substring(1));

       }
    }

