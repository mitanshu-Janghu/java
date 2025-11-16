import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
        int[] x={5,4,3,2322,323,23,423421,2,34,242,42,1};
        
    }
    static int[] mergesort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left = mergesort(Arrays.copyOfRange(arr, 0,mid));
        int[] rigth=mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,rigth);
    }
    static int[] merge(int[] left,int[] rigth){
        int[] mix = new int[left.length + rigth.length];
        int i=0;
        int j = 0;
        int k= 0;
        while(i<left.length && j<rigth.length){
            if(left[i]<rigth[j]){
                mix[k]=left[i];
                i++;
            }
            else{
              mix[k]=rigth[j];
                j++;  
            }
            k++;
        }
           while (i < left.length) {
            mix[k] = left[i];
            i++;
            k++;
        }
        while(j<rigth.length){
            mix[k]=rigth[j];
                j++;  
                k++;
        }
return mix;
    }
}
