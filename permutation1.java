public class permutation1 {
    public static void main(String[] args) {
        per("", "abc");
    }
    static void per(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
        char ch = up.charAt(0);
        for(int i = 0 ; i<=p.length();i++){
            String frist = p.substring(0, i);
            String second= p.substring(i,p.length());
            per(frist + ch + second, up.substring(1));
        }
    }
}
