import java.util.ArrayList;

public class permutation {
    public static void main(String[] args) {
        System.out.println(permutationlist("", "akb"));
    };
    static void permutation(String p , String x){
        if(x.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = x.charAt(0);
        for(int i =0 ;i<=p.length();i++){
            String f= p.substring(0, i);
            String s = p.substring(i,p.length());
            permutation(f+ch+ s,x.substring(1));
        }

    }
        static ArrayList<String> permutationlist(String p , String x){
        if(x.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = x.charAt(0);
        ArrayList<String> list1 = new ArrayList<>();
        for(int i =0 ;i<=p.length();i++){

            String f= p.substring(0, i);
            String s = p.substring(i,p.length());

            list1.addAll(permutationlist(f+ch+ s,x.substring(1)));
        }return list1;}
}
