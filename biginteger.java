import java.math.BigInteger;
public class biginteger {
    public static void main(String[] args) {
        String s ="10";
        BigInteger b = new BigInteger(s,2);
        System.out.println(b);
        System.out.println(b.pow(9));
    }
}
