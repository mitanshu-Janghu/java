
public class conversion {
    public static void main(String[] args) {
        int x = 100;
        String y ="" ;

        while(x>0){
            y+=x%2;

            x/=2;

        }
StringBuilder s = new StringBuilder(y);
        System.out.println(s.reverse());
    }
}
