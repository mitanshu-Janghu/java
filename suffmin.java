
public class suffmin {
public static void main(String[] args) {

    int[] nums = {1,2,3,4,5};
    int max = nums[0];
         int n  = nums.length;
int[] suffMin = new int[nums.length];

suffMin[n - 1] = nums[n - 1];

for (int i = n - 2; i >= 0; i--) {
    suffMin[i] = Math.min(nums[i], suffMin[i + 1]);
}
}
    
}