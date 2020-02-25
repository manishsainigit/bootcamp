package Q1;
interface MyInterfaceD{
    String convert(String str);
}
public class Q1_d {
    public static void main(String[] args) {
        MyInterfaceD my = str -> {
            return str.toUpperCase();
        };
        System.out.println(my.convert("tothenew"));
    }
}
