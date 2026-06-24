public class childbaseclass {
    public static void main(String[] args) {
        human h1 = new human();
        h1.name = " normal ";
        h1.age = 10;
        System.out.println(h1.age);
    }
 static class animal{
int age;
}  
static class human extends animal {
    String name;
}
}


