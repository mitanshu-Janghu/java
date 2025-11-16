import java.util.Scanner;

public class lopps2 {
   public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int x=sc.nextInt();
    if(x>7){
        for(int i=0;i<6;i++){
        System.out.println(x+" 😶‍🌫️");}
    }
    else{
        System.out.println(x+" 😎");
    }
    sc.close();
   }
}
