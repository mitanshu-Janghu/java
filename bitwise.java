public class bitwise {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(-10));
        
    }
    static boolean oddenven(int x){

        return (x&1)==0;

    }
    static int exor(int[] arr) {
        int unique = 0;
        for (int i : arr) {
            unique^=i;
        }
        return unique;
    }
    static int leftshift(int x){
        return (x<<1);
    }
}
