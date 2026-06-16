public class sevie {
   public static void main(String[] args) {
    int n = 20;
    boolean[] b = new boolean[n+1];
    isprime(n,b);
   } 
   static void isprime(int n , boolean[] arr){
for(int i = 2 ;  i*i<=n ; i++){
    if(!arr[i]){
for(int j = i*2 ; j<=n;j+=i){
    arr[j] = true;
}
    }
}
for(int i = 2 ;  i<=n ; i++){
    if(!arr[i]) System.out.println(i );
}
   

}
}


