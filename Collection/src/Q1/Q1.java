package Q1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {
        List<Float> flist=new ArrayList<>();
        flist.add(2.34f);
        flist.add(3.45f);
        flist.add(4.56f);
        flist.add(2.12f);
        flist.add(1.2f);

        float sum=0.0f;
        Iterator<Float> iterator= flist.iterator();
        while(iterator.hasNext()){
            sum+=iterator.next();
        }
        System.out.println(sum);
    }
}
