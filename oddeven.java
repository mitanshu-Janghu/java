import java.util.Scanner;
public class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter a number : ");
        int x = sc.nextInt();
        if((x&1)==0)
        System.out.println("no is even");
    else 
        System.out.println("no is odd");

    }
}
