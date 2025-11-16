import java.util.Scanner;
public class input {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number :");
        int x = sc.nextInt();
        System.out.println("number is "+x);
        sc.close();
    }
}
