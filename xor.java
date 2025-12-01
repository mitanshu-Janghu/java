import java.util.Arrays;
public class xor{
    public static void main(String[] args) {
        System.out.println(5^2^0);
        System.out.println(Arrays.toString(findArray(new int[] {5,2,0,3,1})));
    }
    static public int[] findArray(int[] pref) {
        int[] nums=new int[pref.length];
        nums[0]=pref[0];
         for(int i = 1 ; i<pref.length;i++){
        nums[i] = pref[i] ^ pref[i-1];
        }
    return nums;}
}
