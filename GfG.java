import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class GfG {

    static void subsetRecur(int i, int[] arr,
                            ArrayList<ArrayList<Integer>> res,
                            ArrayList<Integer> subset) {
        if (i == arr.length) {
            res.add(new ArrayList<>(subset));
            return;
        }

        // Include the current element
        subset.add(arr[i]);
        subsetRecur(i + 1, arr, res, subset);

        // Exclude the current element
        subset.remove(subset.size() - 1);
        subsetRecur(i + 1, arr, res, subset);
    }

    static ArrayList<ArrayList<Integer>> subsets(int[] arr) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> subset = new ArrayList<>();
        
        // finding recursively
        subsetRecur(0, arr, res, subset);

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        ArrayList<ArrayList<Integer>> res = subsets(arr);

       for (ArrayList<Integer> subset : res) {
            System.out.print("[");
            for (int i = 0; i < subset.size(); i++) {
                System.out.print(subset.get(i));
                if (i != subset.size() - 1) System.out.print(", ");
            }
            System.out.println("]");
        }
    }
}
