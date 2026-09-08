import java.util.ArrayList;

public class numberpermutation {
    public static void main(String[] args) {
        int[] arr= {1,2,3};
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        boolean[] b = new boolean[arr.length];
        helper(arr, 0, ans, new ArrayList<>(),b);
System.out.println(ans);
    }
        static void helper(int[] arr , int index , ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> help ,boolean[] b)
{
    if(help.size()==arr.length){ans.add(new ArrayList<>(help));
        return;}
        for(int i = index ; i<arr.length ; i++){
            if(!b[i]){
                b[i]=true;
            help.add(arr[i]);
            helper(arr,index,ans,help,b);
             b[i]=false;
            help.remove(help.size()-1);}
        }
}

}
