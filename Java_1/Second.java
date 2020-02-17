//Q2. Write a program to find the number of occurrences of the duplicate words in a string and print them ?
import java.util.Scanner;

public class Second {
    Scanner sc=new Scanner(System.in);
    public void dublicateWords(){
        System.out.print("Enter a String: ");
        String string =sc.nextLine();
        int count;
        string = string.toLowerCase();
        String words[] = string.split(" ");

        System.out.println("Duplicate words in a given string : ");
        for(int i=0;i<words.length;i++){
            count=1;
            for(int j=i+1;j<words.length;j++){
                if(words[i].equals(words[j])){
                    count++;
                    words[j] = "0";
                }
            }
            if(count>1 && words[i]!="0")
                System.out.println(words[i]+" "+count);
        }

    }
    public static void main(String[] args) {
        Second obj = new Second();
        obj.dublicateWords();
    }
}