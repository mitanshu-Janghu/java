import java.util.Arrays;
public class maxsum {
    public static void main(String[] args) {
        int[] arr={3,6,5,1,8};
        System.out.println(sumthree(0, arr, 0,arr.length));
    }
    static int sumthree(int sum,int[] arr,int st,int end){
        Arrays.sort(arr);
        if(st==arr.length||end==0){
             return 0 ;
        }
        for(int i=st;i<end;i++){
            sum+=arr[i];
        }
        if(sum%3==0){ 
            System.out.println(sum);
            return sum;}
        else{
        
        sumthree(0, arr, st+1,end);
        sumthree(0, arr, st, end-1);}
        return sum; 
    }
}
