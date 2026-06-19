import java.util.Arrays;

public class mersgeosrt2 {
    public static void main(String[] args) {
        int[] arr = {1,23,4323,3233423,4234,23423,41231345,45,345,345,35,345,54,4532,53,42,2,52,3,232,423,133,431,31};
       arr=sort(arr);
       System.out.println(Arrays.toString(arr));
    }
    static int[] sort(int[] arr){
        if (arr.length == 1) return arr;
        int mid = arr.length/2;
        int[] left=sort(Arrays.copyOfRange(arr,0,mid));
        int[] right=sort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left , right);
    }
    static int[] merge(int[] left , int[] right){
        int i = 0 , j =0 , k = 0 ;
int[] mix = new int[left.length + right.length];
        while(i<left.length && j<right.length){
if(left[i]<right[j]){
    mix[k]= left[i];
    i++;
}
else{
    mix[k]= right[j];
    j++;
}
k++;
        }
        while(i<left.length ){
    mix[k]= left[i];
    i++;
k++;
        }
        while(j<right.length ){
    mix[k]= right[j];
    j++;
k++;
        } 
    return mix;}
}
