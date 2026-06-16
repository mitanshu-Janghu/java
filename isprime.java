public class isprime {
    public static void main(String[] args) {
        int n = 4;
        boolean b = true;
        for(int i = 2 ; i<= (int)(Math.sqrt(n));i++){
            if(n%i==0) {b = false;
                break;
            }
        }
        System.out.println( n + " is prime = " + b);
    }
}
