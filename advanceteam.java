public class advanceteam {

    public static void main(String[] args) {
        System.out.println(team(7,0));
    } 
static int team(int n,int sum){
    if(n==0) return 0; 
    if(n%2==0)
        sum +=team(n/2, n/2);
    
    else 
        sum += team(n/2,(n/2)+1);

    return sum;
}

}