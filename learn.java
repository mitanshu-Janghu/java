public class learn {
    public static void main(String[] args) {
        dog d1=new dog();
        d1.name="nall baz. ";
        d1.age=500000;
        d1.grap();
    }
}
class dog
{
    String name;
    int age;
    void grap(){
        System.out.println(name+age);
    }

}