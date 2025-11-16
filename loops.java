import java.util.Scanner;

public class loops {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number : ");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(i*n);
        }

sc.close();
    }
}
