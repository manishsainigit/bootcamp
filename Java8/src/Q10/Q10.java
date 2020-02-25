//Sum all the numbers greater than 5 in the integer list.
package Q10;

import java.util.Arrays;
import java.util.List;

public class Q10
{
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(34,2,4,1,6,9,10);
        System.out.println(list.stream().filter((i)->i>5).mapToInt(i->i).sum());
    }
}
