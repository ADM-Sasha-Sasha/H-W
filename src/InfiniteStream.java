import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InfiniteStream {

        public static Stream<Long> generator (long a, long c, long m, long seed) throws RuntimeException
        {
            return Stream.iterate(seed, n -> (a * n + c) % m);
        }
        public static void main(String[] args) {
        System.out.println(InfiniteStream.generator (
                25214903917L, 11L
                , (long) Math.pow(2, 48),100)
                .limit(5)
                .collect(Collectors.toList()
        ));
    }
}
