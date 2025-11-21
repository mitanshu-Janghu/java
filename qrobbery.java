import java.util.Arrays;

public class qrobbery {
        public static void main(String[] args) {
            System.out.println(rob(new int[]{1,3,1,3,100}));
        }
    static int rob(int[] nums)
    {
        if(nums.length==1) return nums[0];
        return nums.length%2==0?even(nums):odd(nums);
    }
    static int even(int[] nums){
        int sum1=0;
        int sum2=0;
        for(int i=0;i<nums.length-1;i+=2){
            sum1+=nums[i];
        }
        for(int i=1;i<nums.length;i+=2){
            sum2+=nums[i];
        }
        if(sum1>sum2) return sum1;
    return sum2;}
    static int odd(int[] nums){
        if(case1(nums)>case2(nums)) return case1(nums);
        else return case2(nums);
    }
static int case1(int[] nums){
        int sum1=0;
        int sum2=0;
        int[] nums2 = Arrays.copyOf(nums, nums.length);
        nums2[0]=0;
        for(int i=0;i<nums.length;i+=2){
            sum1+=nums2[i];
        }
        for(int i=1;i<nums.length-1;i+=2){
            sum2+=nums2[i];
        }
System.out.println(sum1);
    if(sum1>sum2) return sum1;
    return sum2;}
static int case2(int[] nums){
        int sum1=0;
        int sum2=0;
        int[] nums2 = Arrays.copyOf(nums, nums.length);
        nums2[nums.length-1]=0;
        for(int i=0;i<nums.length;i+=2){
            sum1+=nums2[i];
            
        }
        for(int i=1;i<nums.length-1;i+=2){
            sum2+=nums2[i];
        }
    if(sum1>sum2) return sum1;
    return sum2;}
}
