//Q1. Write a program to replace a substring inside a string with other string ?
import java.util.Scanner;

public class First {
    Scanner sc=new Scanner(System.in);
    String str,rep_str,new_str;
    public void set(){
        System.out.println("Enter a String:");
        str=sc.nextLine();
        System.out.println("Enter String to replace:");
        rep_str=sc.nextLine();
        System.out.println("Enter new String:");
        new_str=sc.nextLine();
    }
    public void repSubString(){
        String replaced_str=str.replace(rep_str,new_str);
        System.out.println("New String: "+replaced_str);

    }

    public static void main(String[] args) {
        First obj=new First();
        obj.set();
        obj.repSubString();
    }
}
