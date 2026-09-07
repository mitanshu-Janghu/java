import java.util.Stack;

public class stackquesdp {
    public static void main(String[] args) {
       Stack<Integer> s1  = new Stack<>();
       Stack<Integer> s2  = new Stack<>();
       int max =10;
        s1.push(4);

        s1.push(2);

        s1.push(4);

        s1.push(6);

        s1.push(1);

        s2.push(2);

        s2.push(1);

        s2.push(8);

        s2.push(5);
       System.out.println(sol(s1, s2, max));
    }
    static int sol(Stack<Integer> stack1,Stack<Integer> stack2,int max ){

    return solhelp( max ,  stack1 ,  stack2 , 0 );
}
 static int solhelp(int max , Stack<Integer> s1 , Stack<Integer> s2 , int sum ){
    if(sum>=max || (s1.isEmpty() && s2.isEmpty())) return 0;
//     int x = s1.pop();
//     int y = s2.pop();
//     int r = solhelp(max, s1,s2,sum+x,count+1);
//     int l = solhelp(max, s1,s2,sum+y,count+1);
// return Math.min(r,l);
int ans1 =0;
int ans2 = 0;
  if (!s1.isEmpty()) {

            int x = s1.pop();

            ans1 = 1 + solhelp(max, s1, s2, sum + x);

            s1.push(x); 

        }



        if (!s2.isEmpty()) {

            int y = s2.pop();

            ans2 = 1 + solhelp(max, s1, s2, sum + y);

            s2.push(y);

        }
          return Math.max(ans1, ans2);

 }
}
