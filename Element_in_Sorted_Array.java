import java.util.Scanner;

public class Element_in_Sorted_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while(n>0)  
        {
            n--;
            int arr_size = sc.nextInt();
            int key = sc.nextInt();
            int[] arr= new int[arr_size];
            for(int i=0;i<arr_size;i++){
                arr[i]= sc.nextInt();
            }
            int ans = 0;
            for(int x : arr){
                if(x>key){
                    ans = x;
                    break;
                }
            }
            if(ans == 0) System.out.println(key);
            else System.out.println(ans);
        } 
        sc.close(); 
    }
    }

