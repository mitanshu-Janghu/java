public class pivod {
    public static void main(String[] args) {
        int[] arr ={4,5,102,122,1226,1,2,3};
        System.out.println(pivid(arr));
    }
    static int pivid(int[] arr){
        int start = 0;
        int end =arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
        if(end!=mid &&  arr[mid]>arr[mid + 1]){
            return mid;
        }
        if(start!=mid && arr[mid]<arr[mid - 1]){
            return mid-1;
        }
        if(arr[mid]<=arr[start]){
            end =mid-1;
        }
        else{
            start = mid+1;
        }
        
        
        }
        return -1;

    }
}
