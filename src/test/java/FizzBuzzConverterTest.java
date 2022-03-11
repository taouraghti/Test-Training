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
}
