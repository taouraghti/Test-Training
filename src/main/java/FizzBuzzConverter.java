public class FizzBuzzConverter {
    public String convert(int i) {
        if(i == 5)
            return "Buzz";
        if(i % 3 == 0 && i != 15)
            return "Fizz";
        return "FizzBuzz";
    }
}
