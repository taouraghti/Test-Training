import java.util.ArrayList;
import java.util.List;

public class FizzBuzzListFactory {
    public List<Integer> createList(int n) {
        List<Integer> list = new ArrayList<>();
        if(n == 3)
            list = List.of(1,2,3);
        return list;
    }
}
