public class solutionofdpmaze {
   static public int numberOfPaths(int m, int n) {
         int[][] dp = new int[m+1][n+1];
       for(int i= 0 ; i<=m ;i++)
       for(int j = 0 ; j<=n;j++)
       dp[i][j]=-1;
       
       return dpnumberOfPaths(m,n,dp);
        
    }
    static public int dpnumberOfPaths(int m, int n,int[][] dp) {
        if(m==1 && n==1) return 1;
        if(m==0 || n==0) return 0;
        if(dp[m][n]!=-1) return dp[m][n];
        int up = dpnumberOfPaths( m-1,  n,dp);
        int down = dpnumberOfPaths( m,  n-1,dp);
        return dp[m][n]=up+down;
    }
    public static void main(String[] args) {
        System.out.println(numberOfPaths(3,3));
    } 
}
