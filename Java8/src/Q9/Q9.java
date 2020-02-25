//Collect all the even numbers from an integer list.
package Q9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q9
{
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(2,3,6,5,34,55);
        System.out.println(list.stream().filter((i)->i%2==0).collect(Collectors.toList()));
    }
}