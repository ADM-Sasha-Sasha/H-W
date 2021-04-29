import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Names {
   // List<String> names = Arrays.asList("Sasha", "Vlad", "Kostia", "Dima", "Artem");
    private static List <Index> Names = Arrays.asList(new Index(1, "Sasha"), new Index(2, "Vlad")
                                                           , new Index(3, "Kostia"), new Index(4, "Dima")
                                                           , new Index(5, "Artem"));
    public static void main(String[] args) {

    String name = Names.stream()
            .filter(humans -> humans.getFirst()%2 != 0)
            .map(Index :: toString)
            .collect(Collectors.joining(","));



        System.out.println(name);
    }
}
