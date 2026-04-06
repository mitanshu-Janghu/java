public class binarytodec {
    public static void main(String[] args) {
        System.out.println(convortor("10111"));
    }
    static int convortor(String s){
  int p = 1;
  int ans=0;
  for(int i = s.length()-1;i>=0;i--){
    if(s.charAt(i)=='1'){
ans+=p;
    }
p*=2;
  }
return ans;

    }
}
