public class fibobydp {
    public static void main(String[] args) {
        int n = 6;
        int[] dp = new int[n+1];
        for(int i = 0 ; i<n+1;i++) dp[i]=-1;
        System.out.println(fibo(n, dp));
    }
    static int fibo(int n , int[] dp ){
        if(n<=1) return 1;
        if(dp[n]!=-1) return dp[n];
        return dp[n]= fibo(n-1, dp)+fibo(n-2, dp);
    }
}
