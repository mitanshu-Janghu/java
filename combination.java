import java.util.ArrayList;
public class combination {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        helper(arr, 0, 10, ans, new ArrayList<>(), 0);
System.out.println(ans);
    }
        static void helper(int[] arr , int index , int target , ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> help ,int sum )
{
    if(target==sum){ans.add(new ArrayList<>(help));
        return;}
        if(target<sum) return ;
        for(int i = index ; i<arr.length ; i++){
            help.add(arr[i]);
            helper(arr,index,target,ans,help,sum+arr[i]);
            help.remove(help.size()-1);
        }
}
    }
