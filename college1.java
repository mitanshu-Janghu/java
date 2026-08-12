import java.util.Scanner;
public class college1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your acc no ");
        int ac = sc.nextInt();
        int no = ac;
        int sum =0 ;
        int rev = 0;
        int l = Integer.MIN_VALUE ;
        int s =Integer.MAX_VALUE ;
while(ac>0){
    int temp = ac%10;
    sum+=temp;
    if(temp>l) l = temp;
    if(temp<s) s= temp;
    rev*=10;
    rev+=temp;
    ac/=10;
}
System.out.println("sum of digits are " + sum);
System.out.println("largest digit : " + l + " smallest digit : " + s);
System.out.println("reverse of ac is " + rev);
if(rev%2==0) System.out.println(" even ");
else System.out.println("odd ");
if(no%3==0) System.out.println("A");
if(no%5==0) System.out.println("B");
if(no%7==0) System.out.println("C");
if(no==rev) {System.out.println("acc number is palindrone");}
        sc.close();
    }
}
