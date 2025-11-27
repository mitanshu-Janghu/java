public class simplestair {
    public static void main(String[] args) {
        int[] arr={4,3,1,6};
        System.out.println(isArraySpecial(arr));
    }
    static public boolean isArraySpecial(int[] nums) {

        if(nums.length==1) return true;
        int sum=0;
        for(int i=0;i<nums.length-1;i++){
            if((nums[i]%2==0 && nums[i+1]%2==1) || (nums[i]%2==1 && nums[i+1]%2==0))
            sum+=1;
        }System.out.println(sum);
   if(sum==(nums.length-1))return true;
   return false; }}
 