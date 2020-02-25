//Create a functional interface whose method takes 2 integers and return one integer.
package Q2;
interface MyMethod{
    int add(int a,int b);
}
public class Q2 {
    public static void main(String[] args) {
        MyMethod my=(a,b)->{return a+b;};
        System.out.println(my.add(5,6));
    }
}
