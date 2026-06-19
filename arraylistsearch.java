import java.util.ArrayList;

public class arraylistsearch {
    public static void main(String[] args) {
        int[] arr = {13,3,2,34,42,21,32,12,12,3,3,3,323,21};
        System.out.println(search(arr, 3, 0, new ArrayList<Integer>()));

    }
    static ArrayList<Integer> search(int[] arr , int target , int index , ArrayList<Integer> list){
if(index==arr.length-1) return list;
if(target == arr[index]) list.add(index);
return search(arr, target, index+1, list);
    }
}
