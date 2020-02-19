//Q1  Create Java classes having suitable attributes for Library management system.Use OOPs concepts in your design.
// Also try to use interfaces and abstract classes.
package com.company;
import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        System.out.println("-----------------Welcome to Library---------------------");
        System.out.println("Choose a option\n");
        System.out.println("1. All Books");
        System.out.println("2. Add Book");
        System.out.println("3. Issue Book");
        System.out.println("4. Exit");
        Scanner sc=new Scanner(System.in);
        while (true) {
            int opt = sc.nextInt();
            LibData l = new LibData();
            if (opt == 1)
                l.allBook();
            else if (opt == 2) {
                l.addBook(l.bookDetails());
            }
            else if (opt == 3) {
                l.issueBook(l.bookDetails());
            }
            else if(opt==4){
                System.out.println("Thank you for coming:)");
                break;
            }
            else
                System.out.println("Please enter valid option");
        }
    }
}
interface Library{
    void allBook();
    void addBook(String bookName);
    void issueBook(String bookName);
}

class LibData implements Library{
    Scanner sc=new Scanner(System.in);
    public void allBook(){
        System.out.println("All books are here");
    }
    public void addBook(String bookName){
        System.out.println(bookName+" is added");
    }
    public void issueBook(String bookName){
        System.out.println(bookName+" is issued");
    }
    public String bookDetails(){
        System.out.println("Enter book name: ");
        String bookName=sc.nextLine();
        return bookName;
    }
}


