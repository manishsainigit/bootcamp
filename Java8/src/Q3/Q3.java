//Using (instance) Method reference create and apply add and subtract method and using (Static) Method reference create
// and apply multiplication method for the functional interface created.
package Q3;
interface MyInterface{
    void display(int a,int b);
}
public class Q3 {
    static void add(int a,int b){
        System.out.println(a+b);
    }
    static void sub(int a,int b){
        System.out.println(a-b);
    }
    static void div(int a,int b){
        System.out.println(a/b);
    }
    static void multi(int a,int b){
        System.out.println(a*b);
    }

    public static void main(String[] args) {
        MyInterface m1  = Q3::add;
        m1.display(3,4);
        MyInterface m2 =Q3::sub;
        m2.display(4,2);
        MyInterface m3  = Q3::div;
        m3.display(8,4);
        MyInterface m4 =Q3::multi;
        m4.display(4,2);
    }
}
