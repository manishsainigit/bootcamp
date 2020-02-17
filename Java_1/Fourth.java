//Q4. Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters, Digits And Other Special Characters In A String
import java.util.Scanner;

public class Fourth{
        public void percentageString(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter String");
            String str=sc.nextLine();
            int upperCase = 0,lowerCase = 0,digits = 0,others = 0;
            for (int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                if (Character.isUpperCase(ch)){
                    upperCase++;
                }
                else if(Character.isLowerCase(ch)){
                    lowerCase++;
                }
                else if(Character.isDigit(ch)){
                    digits++;
                }
                else {
                    others++;
                }
            }
            int totalChar = str.length();
            double upperCaseLetterPercentage = (upperCase * 100) / totalChar;
            double lowerCaseLetterPercentage = (lowerCase * 100) / totalChar;
            double digitsPercentage = (digits * 100) / totalChar;
            double otherCharPercentage = (others * 100) / totalChar;
            System.out.println("IN: "+str);
            System.out.println("Uppercase letters are " + upperCaseLetterPercentage + "% ");
            System.out.println("Lowercase letters are " + lowerCaseLetterPercentage + "%");
            System.out.println("Digits Are " + digitsPercentage + "%");
            System.out.println("Other Characters Are " + otherCharPercentage + "%");

        }
        public static void main(String[] args) {
            Fourth obj=new Fourth();
            obj.percentageString();
        }
}
