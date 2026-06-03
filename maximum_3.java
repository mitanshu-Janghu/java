import java.util.Scanner;

public class maximum_3 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("please enter first value : ");
int a = sc.nextInt();
 System.out.println("please enter second value : ");
int b = sc.nextInt();
 System.out.println("please enter third value : ");
int c = sc.nextInt();
System.out.print(Math.max(a,(Math.max(b,c))));
 // String.trim()


}   
}
