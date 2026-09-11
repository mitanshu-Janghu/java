import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class subset2 {
    public static void main(String[] args) {
        int[] arr= {4,4,1,4};
        Set<ArrayList<Integer>> ans = new HashSet<>();
        helper(arr, 0, ans, new ArrayList<>());
System.out.println(ans);
    }

    static void helper(int[] arr , int index , Set<ArrayList<Integer>> ans, ArrayList<Integer> help)
{
    if(index==arr.length){
        ans.add(new ArrayList<>(help));
        return ;}
       helper(arr,index+1,ans,help);
    help.add(arr[index]);
    helper(arr,index+1,ans,help);
    help.remove(help.size()-1);
}
        
        }


