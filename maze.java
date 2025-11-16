public class maze {
public static void main(String[] args) {

    
}
static int mazeans(int r , int c){
    if(r==1 || c==1)
    return 1;
    int left=mazeans(r-1, c);
    int right=mazeans(r, c-1);
    return left+right;
}
static void pathmazeans(String s,int r , int c){
    if(r==0 && c==0){
    System.out.println(s);
    }
    if(r>1)
    pathmazeans(s+'d',r-1, c);
    if(c>1)
    pathmazeans(s+'l',r, c-1);
}

}
