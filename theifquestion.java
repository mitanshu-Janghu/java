import java.util.ArrayList;

public class theifquestion {
    public static void main(String[] args) {
        int[] arr = {6,5,6,1,4};
        System.out.println(ans(arr, 0));
        
    }
    static int ans(int[] arr,int index){
        if(index>=arr.length){
            return 0;
        }
        int st = arr[index]+ans(arr, index+2);
        int no = ans(arr,index+1);
        return Math.max(st,no);
        
    }
}
