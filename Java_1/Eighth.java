//Q8. Write a program to reverse a string and remove character from index 4 to index 9 from the reversed string using String Buffer
import java.util.Scanner;

public class Eighth {
    public void stringBuffer(){
        System.out.println("Enter a String(minimum 9 characters): ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuffer sb=new StringBuffer(str);
        sb=sb.reverse();
        System.out.println("Reverse String: "+sb);
        sb=sb.delete(4,9);
        System.out.println("Modified String: "+sb);
    }

    public static void main(String[] args) {
        Eighth obj=new Eighth();
        obj.stringBuffer();
    }
}
