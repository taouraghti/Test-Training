import java.util.ArrayList;
import java.util.List;

public class FizzBuzzEngine {
    public List<String> fizzBuzzList(int n) {
        List<String> result = new ArrayList<>();
        FizzBuzzListFactory.createList(n).forEach(e -> result.add(FizzBuzzConverter.convert(e)));
        return result;
    }
}
