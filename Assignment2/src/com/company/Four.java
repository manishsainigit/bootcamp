//Q4. WAP to create singleton class.
package com.company;
public class Four {
    public static void main (String[] args){
        FourSub obj2 = FourSub.getInstance();
        obj2.display();
        System.out.println("Hash code of obj2: " + obj2.hashCode());
    }
}
class FourSub{
    public static FourSub obj=new FourSub();
    private FourSub(){
    }
    public static FourSub getInstance(){
        return obj;
    }
    public void display(){
        System.out.println("HI I'm in class FourSub");
        System.out.println("Hash code of obj: "+obj.hashCode());
    }

}
