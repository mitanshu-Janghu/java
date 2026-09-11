import java.util.ArrayList;
import java.util.List;
public class Combinationsum {
    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] b = new boolean[10];
        helper(3, 9, 1, 0, ans, new ArrayList<Integer>() {},b);
        System.out.println(ans);
    }
    static void helper( int k , int n,int cur , int sum , List<List<Integer>> ans , List<Integer> help ,boolean[] b ){
        if(sum > n) return ;
        if(help.size()>k) return;
        if(sum == n && help.size()==k) {
            ans.add(new ArrayList<Integer>(help));
            return;
        }
for (int i = cur ; i<=9;i++){
    if(!b[i]){
    help.add(i);
    b[i]=true;
    helper(k,n,i+1,sum+i,ans,help,b);
    help.remove(help.size()-1);
     b[i] = false;
}
}
    }
}
