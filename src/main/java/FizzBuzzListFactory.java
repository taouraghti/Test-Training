import java.util.ArrayList;
import java.util.List;

public class FizzBuzzListFactory {
    public static List<Integer> createList(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++)
            list.add(i);
        return list;
    }
}
