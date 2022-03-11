import java.util.ArrayList;
import java.util.List;

public class FizzBuzzEngine {
    public List<String> fizzBuzzList(int n) {
        List<String> result = new ArrayList<>();
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        if(n == 2) {
            List<Integer> list = new FizzBuzzListFactory().createList(n);
            list.forEach(l -> result.add(fizzBuzzConverter.convert(l)));
        }
        return result;
    }
}
