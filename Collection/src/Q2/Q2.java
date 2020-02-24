package Q2;

import java.util.HashSet;

import java.util.Set;

public class Q2 {
    public static void main(String[] args) {
        String str="sdsdffdsadads";
        Set<Character> s=new HashSet();
        char ch;
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            s.add(ch);
        }
        System.out.println(s.size());
    }
}
