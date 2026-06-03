import java.util.Arrays;

public class cyclic2 {
    public static void main(String[] args) {
        int[] nums = {2,3,4,6,5,1};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void sort(int[] arr ){
int i=0;
while(i<arr.length){
    int correct = arr[i]-1;
if(correct!=i) 
    swap(arr, i, correct);
else{
    i++;
}
}
   }
    static void swap(int[] arr, int a , int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
