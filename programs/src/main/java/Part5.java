import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Part5 {


    public static void main(String args[]) {


        //create a list
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // sort the list in ASC order using stream api
        list.stream().sorted().forEach(System.out::println);

        // sort the list in DESC order using stream api
        List<Integer> sortedList = list.stream().sorted((i1, i2) -> i2.compareTo(i1)).collect(Collectors.toList());
        System.out.println(sortedList);

        List<Employee111> empList = Arrays.asList(new Employee111(18, "shaukat", "IT"),
                new Employee111(12, "wasim", "HR"),
                new Employee111(30, "azim", "Operation"));

        empList.stream().map(Employee111::getName).sorted().forEach(System.out::println);

        empList.stream().collect(Collectors.toMap(Employee111::getId, Employee111::getName)).forEach((k, v) -> System.out.println(k + "=" + v));

        Map<Integer, String> map = empList.stream().collect(Collectors.toMap(Employee111::getId, Employee111::getName));

        System.out.println(map);

        List<Map.Entry<Integer, String>> collect = map.entrySet().stream().sorted(Map.Entry.<Integer, String>comparingByKey()).collect(Collectors.toList());
        System.out.println(collect);

        Map<Integer,String> hashMap=new LinkedHashMap<>();
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEachOrdered(e-> hashMap.put(e.getKey(),e.getValue()));

        System.out.println(hashMap);

       // LinkedHashMap<Integer, String> collect1 = map.entrySet().stream().sorted(Map.Entry.<Integer, String>comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
     //   System.out.println(collect1);
    }
}

class Employee111 {

    private Integer id;
    private String name;
    private String dept;

    public Employee111(Integer id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}