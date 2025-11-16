import java.util.ArrayList;

public class phone {
    public static void main(String[] args) {
       System.out.println(no("", "9")); 
    }
    static ArrayList<String> no(String a,String n){
        if(n.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(a);
            return list;
        }
        ArrayList<String> list1 = new ArrayList<>();
        int digit =n.charAt(0)-'0'-1;
        if(digit<6){
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch = (char) ('a'+i);
            list1.addAll(no(a+ch, n.substring(1)));
            System.out.println(1);
        }}
        else if(digit==6 ){
           for(int i=(digit-1)*3;i<(digit*3)+1;i++){
            char ch = (char) ('a'+i);
            list1.addAll(no(a+ch, n.substring(1)));
            System.out.println(2);
        } }
        else if(digit==8){
           for(int i=((digit-1)*3)+1;i<(digit*3)+2;i++){
            char ch = (char) ('a'+i);
            list1.addAll(no(a+ch, n.substring(1)));
            System.out.println(2);
        }}
        else{
            
            for(int i=((digit-1)*3)+1;i<digit*3+1;i++){
            char ch = (char) ('a'+i);
            list1.addAll(no(a+ch, n.substring(1)));
        }
    
        }
        


    return list1;}
}
