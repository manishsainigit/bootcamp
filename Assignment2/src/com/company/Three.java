//Q3. WAP to produce NoClassDefFoundError and ClassNotFoundException exception.
package com.company;
public class Three {
    public static void main(String[] args) {
        //part 1
        try{
            Class.forName("mansih");
        }catch (ClassNotFoundException e){
            System.out.println(e);
        }
        //part 2
        try {
            SubThree obj=new SubThree();
            obj.print();
        }catch (NoClassDefFoundError e){
            System.out.println(e);
        }

    }

}
class SubThree{
    void print(){
        System.out.println("Hello I'm in SubThree class");
    }
}
