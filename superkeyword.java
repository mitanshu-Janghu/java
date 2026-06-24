public class superkeyword {
    public static void main(String[] args) {
        child c1 = new child(10,20);
System.out.println(c1.age);
    }
    static class parent{
        int age;
        parent(int a){
age = a;
        }
    }
    static class child extends parent{
        int sec;
public child(int a , int b){
    super(a);
    sec=b;
}
    } 
}
