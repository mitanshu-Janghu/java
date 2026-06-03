import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[] nums= {12,12,3,43,34,2,21,43,64};
        sort(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void sort(int[] nums){
for(int i = 0 ;i<nums.length;i++)
{
    int index = nums.length-i-1;
int maxindex=getMaxIndex(nums,index);
swap(nums , index,maxindex);
}

    }
    static int getMaxIndex(int[] arr, int a ){
        int max =Integer.MIN_VALUE ;
        int maxind = 0;
        for(int i = 0 ;i<=a;i++){
            if(max<arr[i]){ max = arr[i];
                maxind = i;
            }
        }
        return maxind;
    }
    static void swap(int[] arr, int a , int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
