import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Part1 {
    public static void main(String[] args) {

        List<Integer> items = Arrays.asList(34, 23, 87, 45, 87, 13, 10);

         items.stream().filter(i -> i % 2 == 0).forEach(System.out::println);

//         items.stream().map(i-> i)


//        Collections.sort(items, (x, y) -> y - x);
//        System.out.println(items);
//
//
//        List<String> stringList = Arrays.asList("Honda", "TVS", "Honda", "Jupiter", "Honda", "TVS");
//
//        String str = "Raaj";
//
//        //find Occurrences of String
//        System.out.println(stringList.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting())));
//
//        //find Occurrences of char
//        System.out.println(str.chars()
//                .mapToObj(x -> (char) x)
//                .collect(Collectors.groupingBy(i -> i, Collectors.counting())));

    }
}
