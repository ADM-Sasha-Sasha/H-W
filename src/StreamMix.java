import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMix<T>{
    private static int first;
    private static int second;

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second)
    {
        Iterator<T> iteratorFirst = first.iterator();
        Iterator<T> iteratorSecond = second.iterator();
        Stream<T> mixStream = Stream.empty();
        while (iteratorFirst.hasNext() && ((Iterator <?>)iteratorSecond).hasNext())
        {
            mixStream = Stream.concat(mixStream, Stream.of(iteratorFirst.next(), iteratorSecond.next()));
        }
        return mixStream;
    }
    public static void main(String[] args) {
        System.out.println(StreamMix.zip(Arrays.stream(new String[]{"My", "is", "Sasha"})
                    , Arrays.stream(new String[]{"name", "Sasha"}))
        .collect(Collectors.joining(" ")));
    }
}
