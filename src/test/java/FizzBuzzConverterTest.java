import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzConverterTest {

    @Test
    public void shouldReturnFizzWhenInputIs3(){
        String result = FizzBuzzConverter.convert(3);
        Assertions.assertEquals("Fizz", result);
    }

    @Test
    public void shouldReturnBuzzWhenInputIs5(){
        String result = FizzBuzzConverter.convert(5);
        Assertions.assertEquals("Buzz", result);
    }

    @Test
    public void shouldReturnFizzBuzzWhenInputIs15(){
        String result = FizzBuzzConverter.convert(15);
        Assertions.assertEquals("FizzBuzz", result);
    }

    @Test
    public void shouldReturnFizzWhenInputIsMultipleOf3(){
        String result = FizzBuzzConverter.convert(6);
        Assertions.assertEquals("Fizz", result);
    }

    @Test
    public void shouldReturnBuzzWhenInputIsMultipleOf5(){
        String result = FizzBuzzConverter.convert(10);
        Assertions.assertEquals("Buzz", result);
    }

    @Test
    public void shouldReturnFizzBuzzWhenInputIsMultipleOf15(){
        String result = FizzBuzzConverter.convert(60);
        Assertions.assertEquals("FizzBuzz", result);
    }

    @Test
    public void shouldReturnInputWhenInputIsNotMultipleOf5And3(){
        String result = FizzBuzzConverter.convert(8);
        Assertions.assertEquals("8", result);
    }
}
