package Q3;

import java.util.Map;
import java.util.TreeMap;


public class Q3 {
    public static void main(String[] args) {
        String str ="fjwefhhg";
        Map<Character, Integer> m = new TreeMap<Character, Integer>();
        for(int i =0; i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(m.containsKey(ch))
            {
                int value = m.get(ch);
                value = value + 1;
                m.put(ch, value);
            }
            else
            {
                m.put(ch,1);
            }
        }
        for(char count : m.keySet())
        {
            System.out.println(count+ ": "+ m.get(count));
        }
    }
}
