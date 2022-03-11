import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

public class FizzBuzzListFactoryTest {
    @Test
    public void shouldReturnEmptyListWhenInputIs0(){
        List<Integer> result = new FizzBuzzListFactory().createList(0);
        Assertions.assertTrue(result.isEmpty());
    }

    @Test
    public void shouldReturnListBetween1And3WhenInputIs3(){
        List<Integer> result = new FizzBuzzListFactory().createList(3);
        List<Integer> list = List.of(1,2,3);
        Assertions.assertArrayEquals(list.toArray(), result.toArray());
    }
}
