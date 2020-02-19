package com.company;
public class Thirteen {
    public static void main(String[] args) {
        try{
            throw new CustomException("In CustomException");
        }catch (CustomException e){
            System.out.println(e);
        }

    }
}
class CustomException extends Exception{
    CustomException(String msg){
        super(msg);
    }
}
