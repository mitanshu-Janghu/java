public class robbers {
    public static void main(String[] args) {
        System.out.println(permutation("", "aab","baa" ));
    }
    static boolean subset(String p , String c,String d){
        if(c.isEmpty()){
            return p.equals(d);
            
        }
        char x = c.charAt(0);
       if( subset(p,c.substring(1),d))
        return true;
       if(subset(p+x,c.substring(1),d))
        return true;

       return false;}
    static boolean permutation(String p , String x,String d){
        if(x.isEmpty()){
            return p.equals(d);
        }
        char ch = x.charAt(0);
        for(int i =0 ;i<=p.length();i++){
            String f= p.substring(0, i);
            String s = p.substring(i,p.length());
            if(permutation(f+ch+ s,x.substring(1),d))
                return true;}

        

    return false;}
}
