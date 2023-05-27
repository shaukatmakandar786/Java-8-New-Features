import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Part4 {

    public static void main(String[] args) {

        //sorting logic for map
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(102,"BBBBBB");
        hm.put(103,"DDD");
        hm.put(101,"CCCC");

        System.out.println(hm.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toList()));
        System.out.println(hm.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList()));

        System.out.println(hm.entrySet().stream().sorted(Map.Entry.<Integer, String>comparingByKey().reversed()).collect(Collectors.toList()));
        System.out.println(hm.
                entrySet()
                .stream()
                .sorted(Map.
                        Entry.<Integer,String>comparingByValue()
                        .reversed()).collect(Collectors.toList()));

        System.out.println(hm.entrySet().stream().sorted((i1,i2)-> Integer.compare(i2.getValue().length(), i1.getValue().length())).collect(Collectors.toList()));
    }
}
