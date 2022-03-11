import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FizzBuzzListFactoryTest {
    @Test
    public void shouldReturnEmptyListWhenInputIs0(){
        List<Integer> result = new FizzBuzzListFactory().createList(0);
        Assertions.assertTrue(result.isEmpty());
    }
}
