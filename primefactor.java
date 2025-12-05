public class primefactor {
    public static void main(String[] args) {
        System.out.println(ugly(28));
    }
    static boolean ugly(int n){
        int sum=0;
        for(int i = 2 ; i<=n;i++){
            if(n%i==0) {
            if(i==2 || i==3 || i==5 || i==1) continue;
            else {
                sum=0;
                for(int j = 1 ; j<=i/2;j++){
            if(i%j==0) {

                System.out.println(i);
                sum++;
            }
        
            if(sum==1) return false;}

        }}}
    return true;}
}
