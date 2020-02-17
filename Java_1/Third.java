//Q3. Write a program to find the number of occurrences of a character in a string without using loop?
import java.util.Scanner;
public class Third {
    Scanner sc=new Scanner(System.in);
    public void findChar(){
        System.out.println("Enter String: ");
        String str=sc.nextLine();
        System.out.println("Enter character to count:");
        char arr=sc.next().charAt(0);
        String temp=str.replaceAll(String.valueOf(arr),"");
        int count=str.length()-temp.length();
        System.out.println("count of "+arr+" is "+count);
    }

    public static void main(String[] args) {
        Third obj=new Third();
        obj.findChar();
    }
}
