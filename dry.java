

public class dry {
    public static void main(String[] args) {
int[] arr = {2,1,10};

System.out.println(longestMonotonicSubarray(arr));

    }
    static int longestMonotonicSubarray(int[] nums) {
        int i =0 ;
        int j = 0 ;
        int max = 0; 
        if(nums.length<=2){
            if(nums.length==2){
                if(nums[0]==nums[1]){
                    return 1;
                }
            }
        return nums.length;
        } 
        while(i<nums.length-1){
            
            if(nums[i+1]>nums[i]){
                j++;
            }
            
            else
            {
               j=0; 
            }
            if(j>max){
                max=j;
            }
            i++;
        }
        i=1;
        j=0;
        while(i<nums.length){
            
            if(nums[i-1]>nums[i]){
                j++;
            }
            
            else
            {
               j=0; 
            }
            if(j>max){
                max=j;
            }
            i++;
        }

    return max+1;}
}


