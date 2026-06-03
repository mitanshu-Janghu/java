import java.util.Arrays;
public class insertion2 {
    public static void main(String[] args) {
        int[] arr={1,2,4,3,2,23,34,232,11,21};

        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] nums ){
for(int i = 0 ;i<nums.length-1 ;i++){
    for(int j= i+1 ; j>0;j--){
 if(nums[j]<=nums[j-1]){
    int temp = nums[j];
    nums[j]=nums[j-1];
    nums[j-1]=temp;
 }
else{
    break;
}
    }
}
    }
}
