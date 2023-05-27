import java.util.*;
import java.util.stream.Collectors;

public class Part1 {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Honda", "TVS", "Honda", "Jupiter", "Honda", "TVS");

        String str = "Raaj";

        //find Occurrences of String
        System.out.println(stringList.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting())));

        //find Occurrences of char
        System.out.println(str.chars()
                .mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(i -> i, Collectors.counting())));

    }
}
