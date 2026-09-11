import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class subset2_2ndsol {
    public static void main(String[] args) {
        int[] arr= {1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        helper(arr, 0, ans, new ArrayList<>());
System.out.println(ans);
    }

    static void helper(int[] arr, int index,
                List<List<Integer>> ans,
                List<Integer> help) {
        ans.add(new ArrayList<>(help));

        for (int i = index; i < arr.length; i++) {

            if (i > index && arr[i] == arr[i - 1]) {
                continue;
            }

            help.add(arr[i]);

            helper(arr, i + 1, ans, help);

            help.remove(help.size() - 1);
        }
    }
        
        }

