import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Strings {
    public static void main(String[] args) {
    Stream<String> strings = Arrays.asList("Sasha", "Vlad", "Kostia", "Dima", "Artem")
    //Stream<String> nameStream = stream
            .stream()
            .map(String :: toUpperCase)
            .sorted(Comparator.reverseOrder());
    List<String> names = strings.collect(Collectors.toList());


        System.out.println(names);
    }
}
