import java.util.ArrayList;

public class subset2 {
    public static void main(String[] args) {
        int[] arr= {1,2,3};
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        boolean[] b = new boolean[arr.length];
        helper(arr, 0, ans, new ArrayList<>());
System.out.println(ans);
    }

    static void helper(int[] arr , int index , ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> help)
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

