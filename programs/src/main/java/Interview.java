import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Interview {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(2, 3, 7, 4, 8,6);

        List<Integer> collect = integers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);

    }
}
