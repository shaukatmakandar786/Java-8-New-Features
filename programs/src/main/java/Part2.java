import java.util.*;
import java.util.stream.Collectors;

class Employee{

    private Integer id;
    private String name;
    private Double salary;

    private String gender;

    public Employee(Integer id, String name, Double salary, String gender) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Double getSalary() {
        return salary;
    }
}

public class Part2 {
    public static void main(String[] args) {

        List<Employee> employeeList= Arrays.asList(
                new Employee(101,"shaukat",50000d,"M"),
                new Employee(102,"Wasim",40000d,"M"),
                new Employee(103,"Azim",30000d,"F"),
                new Employee(104,"Sajjad",100000d,"F")
        );

//        Comparator<Employee> comparator=new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//
//               return o1.getName().compareTo(o2.getName());
//            }
//        };

//        Comparator<Employee> comparator=new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//
//                if(o1.getSalary()>o2.getSalary())
//                    return -1;
//                else
//                    return 0;
//            }
//        };

        System.out.println(employeeList);
//        Collections.sort(employeeList,comparator);

//        Collections.sort(employeeList,(e1,e2)-> {
//            if(e1.getSalary()>e2.getSalary())
//                return -1;
//            else
//                return 0;
//        });
//        List<Employee> collect = employeeList.stream().sorted((e1,e2)-> (int) (e2.getSalary()-e1.getSalary())).collect(Collectors.toList());
//        Employee employee = employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
////                .skip(1)
//                .findFirst().get();
//
//        List<Employee> collect = employeeList.stream().sorted((e1, e2) -> e2.getName().length() - e1.getName().length()).collect(Collectors.toList());
//
//        System.out.println(collect);
//
//        Map<String, Long> collect1 = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
//        System.out.println(collect1);

        //sort by name ASC
        System.out.println(employeeList.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList()));

        //sort by name DESC
        System.out.println(employeeList.stream().sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList()));

        //sort by name length low to high
        System.out.println(employeeList.stream().sorted(Comparator.comparingInt(e -> e.getName().length())).collect(Collectors.toList()));

        //sort by name length high to low
        System.out.println(employeeList.stream().sorted((e1,e2)-> e2.getName().length()-e2.getName().length()).collect(Collectors.toList()));

        //find max salary of an Employee
        System.out.println(employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
                .findFirst().get()
        );

        //find second highest salary of an Employee
        System.out.println(employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(1)
                .findFirst().get()
        );
    }

}
