//6. WAP showing try, multi-catch and finally blocks.
package com.company;
import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        System.out.println("Enter two number: ");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        Six obj=new Six();
        try{
            System.out.println(obj.div(x,y));
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (Exception e) {
            System.out.println(e);
        }finally {
            System.out.println("Final block");
        }

    }
    public int div(int x,int y){
        int z=x/y;
        return z;
    }
}
