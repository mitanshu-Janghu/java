
import java.util.Arrays;

public class Min_Cost_Climbing_Stairs {
public static void main(String[] args) {
    int[] arr = {10,15,20};
    int[] dp = new int[arr.length+1] ;
    Arrays.fill( dp,-1);
    System.out.println(ans(arr, dp, 0));

}
   static int ans(int[] arr , int[] dp , int index){
    if(index>=arr.length) return 0;
    if(dp[index]!= -1) return dp[index];
    int take=ans(arr, dp, index+1);
    int not=ans(arr, dp, index+2);
    return dp[index]=arr[index]+Math.min(take,not);
   }
}