public class newsol {
    public static void main(String[] args) {
        System.out.println(permutation("", "uhh",0));
    }
    static int permutation(String p , String x,int count){
        if(x.isEmpty()){
            System.out.println(p);
            return count+1;
        }
        char ch = x.charAt(0);
        for(int i =0 ;i<=p.length();i++){
            String f= p.substring(0, i);
            String s = p.substring(i,p.length());
           count= permutation(f+ch+ s,x.substring(1),count);
        }

   return count; }
}
