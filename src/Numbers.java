import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {

        List<String> numbers = Arrays.asList(new String[]{"1, 2, 0", "4, 5"});
        String num = numbers.stream()
                .flatMap((number) -> Arrays.stream(number.split(", ")))
                .sorted()
                .collect(Collectors.joining(","));
        System.out.println(num);
    }
}
