import java.util.Arrays;

public class sortsquare {
    public static void main(String[] args) {
        int[] arr={-4,-1,12,12,0,3,103,32};
        for (int i=0 ;i<arr.length;i++) {
            arr[i]=(int)Math.pow(arr[i], 2);
        }
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
   static void sort(int[] arr){
    for(int i=0;i<arr.length;i++){
        for(int j=i-1;j>=0;j--){
            if(arr[j]>arr[j+1]){
                swap(arr,j,j+1);
            }
            else{
                break;
            }
        }
    }
   }
    static void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}
