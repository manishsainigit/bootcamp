//Write the following a functional interface and implement it using lambda:
//(1) First number is greater than second number or not         Parameter (int ,int ) Return boolean
//(2) Increment the number by 1 and return incremented value    Parameter (int) Return int
//(3) Concatination of 2 string                                 Parameter (String , String ) Return (String)
//(4) Convert a string to uppercase and return .                Parameter (String) Return (String)
package Q1;

interface MyInterFace{
    boolean grater(int a,int b);
}
public class Q1 {
    public static void main(String[] args) {
        MyInterFace my=(a,b)->{
         if(a>b)
             return true;
         return false;
        };
        System.out.println("a is grater: "+my.grater(3,4));
    }
}
