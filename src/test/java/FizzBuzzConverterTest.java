import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzConverterTest {

    @Test
    public void shouldReturnFizzWhenInputIs3(){
        String result = new FizzBuzzConverter().convert(3);
        Assertions.assertEquals("Fizz", result);
    }
}
