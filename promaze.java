public class promaze {
    public static void main(String[] args) {
       solvepath("",3, 3);
    }
    static int solve(int r , int c){
        if(r == 1 || c==1){
            System.out.println(r + "  " + c);
            return 1;
        }
        int left = solve( r-1 ,c);
        int right = solve( r ,  c-1);
        return left+right;
        

    }
    static void solvepath(String s ,int r , int c){
        if(r == 1 && c==1){
            System.out.println(s + "ans");
            return ;
        }
        if(r>1){
solvepath(s+" down - > ",r-1, c);
        }
        
        if(c>1) solvepath(s+" right -> ",r,c-1);
        if(c>1 && r>1 ) solvepath(s+" diagnol -> ",r-1,c-1);
        
        

    }
    
}
