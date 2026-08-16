import java.util.Scanner;
public class Even_Number_of_Digits {
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
            for(int i = 0 ; i<arr_size;i++){
                if((int)(Math.log10(arr[i])+1)%2==0){
                    System.out.print(arr[i] + " ");
                }
            }
        System.out.println("");} 
        sc.close(); 
    }
    }

