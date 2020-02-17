//Q10.Write a single program for following operation using overloading
//  A) Adding 2 integer number
//  B) Adding 2 double
//  C) multiplying 2 float
//  D) multiplying 2 int
//  E) concate 2 string
//  F) Concate 3 String
public class Tenth {
    public static void main(String[] args) {
        int a=5,b=10;
        double c=10.56,d=23.54;
        float e=10.56f,f=23.54f;
        String s1="Manish ",s2="Saini ",s3="Meerut ";
        add(a,b);
        add(c,d);
        multi(a,b);
        multi(e,f);
        concat(s1,s2);
        concat(s1,s2,s3);
    }
    public static void add(int a,int b){
        System.out.println("Added Int: "+(a+b));
    }
    public static void add(double c,double d){
        System.out.println("Added Float: "+(c+d));
    }
    public static void multi(float e,float f){
        System.out.println("Multiply Float: "+(e*f));
    }
    public static void multi(int a,int b){
        System.out.println("Multiply Int: "+(a*b));
    }
    public static void concat(String s1,String s2){
        System.out.println("Concat Two Strings: "+s1.concat(s2));
    }
    public static void concat(String s1,String s2,String s3){
        System.out.println("Concat Three String: "+(s1+s2+s3));
    }
}
