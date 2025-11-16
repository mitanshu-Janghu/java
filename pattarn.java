public class pattarn {
    public static void main(String[] args) {
        shape4(6);
    }
    static void shape(int n){
        for(int i=0;i<n;i++){
            for(int space=0;space<n-i;space++){
                System.out.print(" ");
            }
            for(int star=0;star<i+1;star++){
                System.out.print("* ");
            }
        System.out.println("");}
    }
    static void shape2(int n){
        for(int i=0;i<n*2;i++){
            if(i<n){
            for(int space=1;space<n-i;space++){
                System.out.print(" ");
            }
            for(int star=0;star<i+1;star++){
                System.out.print("* ");
            }}
            else{
               for(int space=i-n+1;space>0;space--){
                System.out.print(" ");
            }
            for(int star=i-n;star<n-1;star++){
                System.out.print("* "); }}
            
        System.out.println("");}
    }
       static void shape3(int n){
        for(int i=1;i<=n*2;i++){
            int c = i<=n?i:2*n-i; ;
            for(int space=0;space<n-c;space++){
                System.out.print("  ");
            }

            for(int star=c;star>=1;star--){
                System.out.print(star+" ");
            }
            for(int star=2;star<=c;star++){
                System.out.print(star+" ");
            }
        System.out.println("");}
    } 
 static void shape4(int r){
    for(int i=1;i<=r;i++){  
        for(int j=0;j<i;j++){
            if(j%2!=0){
                System.out.print(1);
            }
            else{
                System.out.print(0);
            }
        }
        for(int j=0;j<2*(r-i);j++){
            System.out.print(" ");
        }
        for(int j=0;j<i;j++){
            if(j%2!=0){
                System.out.print(1);
            }
            else{
                System.out.print(0);
            }
}

    System.out.println("");


    }}}
 

