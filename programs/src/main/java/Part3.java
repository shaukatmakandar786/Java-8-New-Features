import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee1{
    private Integer id;
    private String name;
    private List<String> city;

    public Employee1(Integer id, String name, List<String> city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city=" + city +
                '}';
    }
}

public class Part3 {

    public static void main(String[] args) {

        List<String> city1 = Arrays.asList("Pune", "Mumbai", "Nasik");
        Employee1 e1=new Employee1(101,"Shaukat",city1);

        List<String> city2 = Arrays.asList("Pune", "Mumbai", "Goa");
        Employee1 e2=new Employee1(102,"Zakir",city2);

        List<String> city3 = Arrays.asList("Suraj", "Mumbai", "Kolapur");
        Employee1 e3=new Employee1(103,"Azim",city3);

        List<Employee1> employee1List=new ArrayList<>();
        employee1List.add(e1);
        employee1List.add(e2);
        employee1List.add(e3);

//        List<Integer> ids=new ArrayList<>();
//        for(Employee1 emp:employee1List){
//            ids.add(emp.getId());
//        }
//        System.out.println(ids);

        System.out.println(employee1List.stream().map(e->e.getId()).collect(Collectors.toList()));

        System.out.println(employee1List.stream().map(e->e.getCity()).collect(Collectors.toList()));

        System.out.println(employee1List.stream().flatMap(e->e.getCity().stream()).collect(Collectors.toList()));
    }
}
