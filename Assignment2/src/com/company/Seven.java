//Q7. WAP to convert seconds into days, hours, minutes and seconds.
package com.company;
import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        System.out.println("Enter Seconds: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Seven.convert(n);
    }
    static void convert(int n)
    {
        int day=n/(24*3600);

        n %=(24*3600);
        int hour=n/3600;

        n%=3600;
        int minutes=n/60 ;

        n%=60;
        int seconds=n;
        System.out.println(day+" days "+hour+" hours "+minutes+" minutes "+seconds+" seconds ");
    }
}
