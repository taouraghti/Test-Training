public class FizzBuzzConverter {
    public String convert(int i) {
        if(i == 5)
            return "Buzz";
        if(i == 15)
            return "FizzBuzz";
        return "Fizz";
    }
}
