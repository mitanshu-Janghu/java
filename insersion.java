import java.util.Arrays;

public class insersion {
   public static void main(String[] args) {
    int[] x={5,3,4,2,1,12,21,32,132,-12,-21};
        sort(x);
        System.out.println(Arrays.toString(x));
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
