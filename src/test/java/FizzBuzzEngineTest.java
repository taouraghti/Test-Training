import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

public class FizzBuzzEngineTest {
    @Test
    public void shouldReturn1And2WhenInputIs2(){
        List<String> result = new FizzBuzzEngine().fizzBuzzList(2);
        Assertions.assertArrayEquals(List.of("1", "2").toArray(), result.toArray());
    }
}
