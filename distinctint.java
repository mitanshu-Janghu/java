import java.util.Arrays;
public class distinctint {
    public static void main(String[] args) {
        int[] arr ={1,13,10,12,31};
        System.out.println(countDistinctIntegers(arr));
    }
   static public int countDistinctIntegers(int[] nums) {
        int[] arr = new int[2*nums.length];
        for(int i = 0 ;i<nums.length;i++){
            arr[i]=nums[i];
            int z = nums[i];
            int rev = 0; 
            while(z>0){
                rev*=10;
                rev+=z%10;
                z=z/10;
            }
            arr[i+nums.length]=rev;
        }
        int n=arr.length; int ans=0;
        for(int i=0;i<n;i++){
        boolean flag = true;
        for(int j=0;j<i;j++){
            if(arr[i] == arr[j]){
                flag = false;
                break;
            }
        }
        if(flag) ans++;
    }

        System.out.println(Arrays.toString(arr));
    return ans;}
}

