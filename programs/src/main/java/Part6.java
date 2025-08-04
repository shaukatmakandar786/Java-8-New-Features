import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Part6 {

    public static void main(String[] args) {

        String s1="I am a boy";
        String s2="I am a girl";

        List<String> list = Arrays.asList(s1, s2);

        List<String> collect1 = list.stream().flatMap(i -> Arrays.stream(i.split(" "))).collect(Collectors.toList());

        System.out.println(collect1);

        Map<String, Long> collect = list.stream().flatMap(i -> Arrays.stream(i.split(" ")))
                .collect(Collectors.groupingBy(p -> p, Collectors.counting()));

        System.out.println(collect);

        List<String> collect2 = list.stream().flatMap(i -> Arrays.stream(i.split(" "))).collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                .entrySet().stream().filter(i -> i.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());

        System.out.println(collect2);

        List<String> stringList = Arrays.asList("Honda", "TVS", "hero", "jupiter", "Bajaj", "TVS");

        List<String> collect3 = stringList.stream().filter(i -> Character.isUpperCase(i.charAt(0))).sorted((i1, i2) -> Integer.valueOf(i2.length()).compareTo(Integer.valueOf(i1.length()))).collect(Collectors.toList());
        System.out.println(collect3);
    }
}
/*
[I, am, a, boy, I, am, a, girl]
{a=2, I=2, girl=1, am=2, boy=1}
[girl, boy]
[Honda, Bajaj, TVS, TVS]

*/
