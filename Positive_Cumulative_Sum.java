import java.util.Scanner;

public class Positive_Cumulative_Sum {
        public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while(n>0)  
        {
            n--;
            int arr_size = sc.nextInt();
            int[] arr= new int[arr_size];
            for(int i=0;i<arr_size;i++){
                arr[i]= sc.nextInt();
            }
            int sum = 0;
            for(int i=0;i<arr_size;i++){
                sum+=arr[i];
                arr[i]=sum;
            }
for(int i=0;i<arr_size;i++)
{if(arr[i]>0)
System.out.print(arr[i]+" ");}
System.out.println();
        }  
    }
}
