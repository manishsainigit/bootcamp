package Q1;
interface MyInterfaceC{
    String concat(String str1, String str2 );
}
public class Q1_c {
    public static void main(String[] args) {
        MyInterfaceC my=(str1,str2)->{
          return str1+str2;
        };
        System.out.println(my.concat("Manish ","Saini"));
    }
}
