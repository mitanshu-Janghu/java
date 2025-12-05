public class happyno {
    public static void main(String[] args) {
        System.out.println(isHappy(16));
    }
    static public boolean isHappy(int n) {
        while(n>1){
            int s = n ; 
            int y =0 ;
            while(s>0){
                y+=(int)Math.pow(s%10,2);
                s=s/10;
            }
            System.out.println(n);
        n=y;
        if(n==4) return false;}
    if(n==1) return true;
    return false;}

}

