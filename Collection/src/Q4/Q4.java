package Q4;

import java.util.*;

public class Q4{
    public static void main(String[] args) {
        Map<String,String> map= new HashMap<>();
        map.put("key1","dog");
        map.put("key2","cat");
        map.put("key3","ant");
        map.put("key4","pig");
        map.put("key5","bird");
        List<Map.Entry<String,String>> list = new LinkedList<Map.Entry<String, String>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                return (o1.getValue().compareTo(o2.getValue()));
            }
        });
        HashMap<String,String> hashMap = new LinkedHashMap<>();
        for (Map.Entry<String,String> entry:list) {
            hashMap.put(entry.getKey(),entry.getValue());
        }
        for (Map.Entry<String,String> entry:hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}