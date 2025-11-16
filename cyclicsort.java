import java.util.Arrays;
public class cyclicsort {
    public static void main(String[] args) {
        int[] x={5,3,4,2,1};
        cycle(x);
        System.out.println(Arrays.toString(x));
    }
    static void cycle(int[] nums){
        int i=0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[correct]!=nums[i]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}
