public class sum {
    public static void main(String[] args) {
        System.out.println(alternateDigitSum(521));
    }
    static public int alternateDigitSum(int n) {
       int sum=0;
       String s = Integer.toString(n);
    for(int i = 0 ; i<s.length();i++){
        int x=(int)s.charAt(i)-'0';
        if(i%2==0)sum+=x;
        else sum-=x;
        System.out.println(x);
    }
   return sum; }
}
