//Implement multiple inheritance with default method inside  interface.
package Q8;

interface Interface1
{
    default  void hi()
    {
        System.out.println("hi");
    }
}
interface Interface2
{
    default  void hello(){
        System.out.println("hello");
    }
}
public class Q8 implements Interface1,Interface2
{
    public static void main(String[] args)
    {
        Q8 obj = new Q8();
        obj.hi();
        obj.hello();
    }
}