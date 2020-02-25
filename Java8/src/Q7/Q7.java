//Override the default method of the interface.
package Q7;

interface DemoInterface
{

    default void defaultMethod()
    {
        System.out.println("I am a default method..");
    }
}
public class Q7 implements  DemoInterface
{
    @Override
    public void defaultMethod()
    {
        System.out.println("I am a default method overridden in class..");
    }

    public static void main(String[] args)
    {
        DemoInterface obj2 = new Q7();
        Q7 obj1 = new Q7();
        obj1.defaultMethod();
        obj2.defaultMethod();
    }
}
