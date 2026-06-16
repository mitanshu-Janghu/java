public class newtonrepson {
    public static void main(String[] args) {
        System.out.println(newton(40));
    }
    static double newton(int n ){
double x = n;
        double root ;
        while(true){
            root = 0.5 * (x + n/x );
if(Math.abs((root*root)-n)<0.00001)
    return root;
x = root;
        }

    }
}
