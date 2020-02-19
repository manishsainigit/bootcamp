//2. WAP to sorting string without using string Methods?.
package com.company;
import java.util.Scanner;

public class Two {
    public void shotString(String str){
        char[] c=str.toCharArray();
        char temp=0;
        for(int i=0;i<c.length;i++){
            for(int j=i;j<c.length;j++){
                if(c[i]>c[j]){
                    temp=c[j];
                    c[j]=c[i];
                    c[i]=temp;
                }
            }
        }
        str=String.valueOf(c);
        System.out.println(str);
    }


    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        Two obj=new Two();
        obj.shotString(str);
    }
}
