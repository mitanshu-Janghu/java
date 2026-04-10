public class swapchar {
    public static void main(String[] args) {
        String s= " sjkdjbc-chj-vfdhjb-vfdk";
        char[] arr =s.toCharArray();
int i = 0, j=s.length()-1;
while(i<j){
    if(!Character.isLetter(arr[i])){
        i++;
        continue;
    }
    if(!Character.isLetter(arr[j])){
        j--;
        continue;
    }
char temp = arr[i];
arr[i]=arr[j];
arr[j]= temp;
i++;
j--;
}
s = new String(arr);
   System.out.println(s); }
}
