import java.util.Arrays;

public class shortinstring {
    public static void main(String[] args) {
        String sc="abc";
        char[] ch = sc.toCharArray();sort(ch);
        System.out.println(Arrays.toString(ch));

    }
   static void  sort(char[] ch){
    for(int i = 0 ; i<ch.length;i++){
        for(int j= i ; j>0;j--){
        if(ch[j]<ch[j-1]) swap(ch,j-1,j);
        else break;
    }
    }
   }
   static void swap(char[] ch , int a,int b){
    char temp = ch[a];
    ch[a]=ch[b];
    ch[b]=temp;
   }
}
