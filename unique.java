public class unique {
    public static void main(String[] args) {
        System.out.println(uniqueno((100), 0));
    }
    static int uniqueno(int n,int count){
        if(n==-1){
            return count;
        }
        int add=0;
        if(check(n)){
            add += uniqueno(n-1, count+1); 
        }else{
             add+=uniqueno(n-1, count);
        }
 
        
        
    return add;}
    static boolean check(int n){
        String s =String.valueOf(n); 
        int terms=(int) (Math.log10(n))+1;
    
    for(int i =0;i<terms;i++){
        for(int j=i+1;j<terms;j++){
            if(s.charAt(i)==s.charAt(j)){
                return false;
            }
        }
    }

return true;}}
