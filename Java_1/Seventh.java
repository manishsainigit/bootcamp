//Q7. Write a program to print your Firstname,LastName & age using static block,static method & static variable respectively
public class Seventh {
    static {
        String name="Manish";
        System.out.println(name);
    }
    static int age=21;
    static void staticMethod(){
        String last_name="Saini";
        System.out.println(last_name);
    }

    public static void main(String[] args) {
        Seventh.staticMethod();
        System.out.println(Seventh.age);
    }
}
