import java.util.Arrays;

public class oddevensort {
    public static void main(String[] args) {
        
        System.out.println(Arrays.toString(sortArrayByParity(new int[] {1,0,3})));
    }
    static public int[] sortArrayByParity(int[] nums) {
        int cur=nums.length-1;
        int i = 0 ;
        while(i<=cur){
            if(nums[i]%2==1){
                swap(nums,i,cur);
                cur--;
            }
            if(nums[i]%2==0) i++;
        }
    return nums;}
    static void swap(int[] nums,int a,int b){
        int temp = nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}

