//Create and access default and static method of an interface.
package Q6;

interface MyInterface
{
    static void staticAddMethod(int a , int b)
    {
        System.out.println("I am a static method ");
        System.out.println("The Sum of "+ a + " and " + b +" is : "+ (a+b));
    }
    default void defaultMethod()
    {
        System.out.println("I am a default method..");
    }
}
public class Q6 implements  MyInterface
{
    public static void main(String[] args)
    {
        Q6 obj = new Q6();
        MyInterface.staticAddMethod(100,450);
        obj.defaultMethod();
    }
}
