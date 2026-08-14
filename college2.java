import java.util.Scanner;
public class college2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter arr size : ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for(int i =0 ; i<n;i++) {
            System.out.print("enter digit "+(i+1)+" : ");
            arr[i]=sc.nextInt();
        }
        single(arr);
        oddeven(arr);
        sc.close();
    }
    static void single(int[] arr){
        for(int i = 0 ; i<arr.length;i++){
            arr[i]=(arr[i]-1)%9+1;
        }
    }
    static void oddeven(int[] arr){
        for(int x : arr){
            if((x%2)==1) System.out.println("odd");
            else System.out.println("even");
        }
    }
}
