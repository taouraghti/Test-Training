import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
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

    @Test
    public void shouldReturnListBetween1And7WhenInputIs7(){
        List<Integer> result = new FizzBuzzListFactory().createList(7);
        List<Integer> list = List.of(1,2,3,4,5,6,7);
        Assertions.assertArrayEquals(list.toArray(), result.toArray());
    }

    @Test
    public void shouldReturnListBetween1And100WhenInputIs100(){
        List<Integer> result = new FizzBuzzListFactory().createList(100);
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= 100; i++) list.add(i);
        Assertions.assertArrayEquals(list.toArray(), result.toArray());
    }
}
