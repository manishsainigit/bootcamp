/*Q8. WAP to read words from the keyboard until the word done is entered. For each word except done,
report whether its first character is equal   to  its last character. For the required loop, use a
        a)while statement
        b)do-while statement*/
package com.company;
import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.println("Enter String");
            String str = sc.nextLine();
            if (str.equals("done")){
                System.out.println("bye");
                break;
            }
            else if(str.charAt(0)==str.charAt(str.length()-1))
                System.out.println("Equal");
            else
                System.out.println("Not Equal");

        }
    }
}
