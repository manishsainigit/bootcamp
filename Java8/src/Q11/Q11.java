//Find average of the number inside integer list after doubling it.
package Q11;

import java.util.Arrays;
import java.util.List;

public class Q11
{
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(23,42,53,43,23,41);
        System.out.println(list.stream().map((i)->i*2).mapToInt(i->i).average());
    }
}
