import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

public class FizzBuzzEngineTest {
    @Test
    public void shouldReturn1And2WhenInputIs2(){
        List<String> result = new FizzBuzzEngine().fizzBuzzList(2);
        Assertions.assertArrayEquals(List.of("1", "2").toArray(), result.toArray());
    }

    @Test
    public void shouldReturn1And2AndFizzWhenInputIs3(){
        List<String> result = new FizzBuzzEngine().fizzBuzzList(3);
        Assertions.assertArrayEquals(List.of("1", "2", "Fizz").toArray(), result.toArray());
    }

    @Test
    public void shouldReturn1And2AndFizzAnd4AndBuzzWhenInputIs5(){
        List<String> result = new FizzBuzzEngine().fizzBuzzList(5);
        Assertions.assertArrayEquals(List.of("1", "2", "Fizz", "4", "Buzz").toArray(), result.toArray());
    }
}
