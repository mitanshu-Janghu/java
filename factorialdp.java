import java.util.Arrays;

public class factorialdp {
    public static void main(String[] args) {
        int n = 10;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(fact(n, dp));
    }
    static int fact(int x , int[] dp){
        if(x<=2) return x;
        if(dp[x]!=-1) return dp[x];

        return dp[x]=x*fact(x-1,dp);
    }
}
