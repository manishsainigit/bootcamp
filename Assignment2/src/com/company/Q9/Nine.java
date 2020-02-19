package com.company.Q9;

public class Nine {
    public static void main(String[] args) {
        Chair cObj=new Chair("metal",true,true);
        Table tObj=new Table("wooden",true,true);
        System.out.println("Chair Details:\nType: "+cObj.type+"\nFire test: "+cObj.fire+"\nStress test: "+cObj.fire);
        System.out.println("***************************************************************");
        System.out.println("Table Details:\nType: "+tObj.type+"\nFire test: "+tObj.fire+"\nStress test: "+tObj.fire);
    }
}
