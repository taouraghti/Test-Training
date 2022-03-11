import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzConverterTest {

    @Test
    public void shouldReturnFizzWhenInputIs3(){
        String result = new FizzBuzzConverter().convert(3);
        Assertions.assertEquals("Fizz", result);
    }

    @Test
    public void shouldReturnBuzzWhenInputIs5(){
        String result = new FizzBuzzConverter().convert(5);
        Assertions.assertEquals("Buzz", result);
    }

    @Test
    public void shouldReturnFizzBuzzWhenInputIs15(){
        String result = new FizzBuzzConverter().convert(15);
        Assertions.assertEquals("FizzBuzz", result);
    }

    @Test
    public void shouldReturnFizzWhenInputIsMultipleOf3(){
        String result = new FizzBuzzConverter().convert(6);
        Assertions.assertEquals("Fizz", result);
    }

    @Test
    public void shouldReturnBuzzWhenInputIsMultipleOf5(){
        String result = new FizzBuzzConverter().convert(10);
        Assertions.assertEquals("Buzz", result);
    }

    @Test
    public void shouldReturnFizzBuzzWhenInputIsMultipleOf15(){
        String result = new FizzBuzzConverter().convert(60);
        Assertions.assertEquals("FizzBuzz", result);
    }
}
