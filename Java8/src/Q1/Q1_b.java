package Q1;
interface MyInterface{
    int increment(int a);
}
public class Q1_b {
    public static void main(String[] args) {
        MyInterface i = a -> {return ++a;};
        System.out.println("New number: "+i.increment(5));
    }
}
