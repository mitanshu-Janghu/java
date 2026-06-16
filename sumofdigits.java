public class sumofdigits {
    public static void main(String[] args) {
        System.out.println(sumofdigit(2230));
    }
    static int sumofdigit(int n){
        if(n==0) return 0;
        return n%10+sumofdigit(n/10);
    }
}
