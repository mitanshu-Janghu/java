import java.util.HashMap;
import java.util.Scanner;

public class Identical_Twins {
    public static void main(String[] args) {
    Scanner  sc = new Scanner(System.in) ;
        int n = sc.nextInt();
        while(n>0){
           --n;
              int arr_size = sc.nextInt();
              int[] arr = new int[arr_size];
              for(int i = 0 ;i<arr_size;i++){
                arr[i]= sc.nextInt();
              }
              int result = 0;
              HashMap<Integer,Integer> h = new HashMap<>();
              for(int x : arr){
                if(h.containsKey(x)){
                    h.put(x,h.get(x)+1);
                }
                else{
                    h.put(x,1);
                }

              }
              for(int x : h.keySet()){
                if(h.get(x)>1){
                
                    result+=f(h.get(x));
                }
              }
System.out.println(result);
        }




    sc.close(); 
    }
   static int f(int x) {
    return x * (x - 1) / 2;
}
}
