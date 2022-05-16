# Stream in java 8:

## Collection & Stream:

1. If we want to represents a group of objects as a single entity then we should go for Collection.
2. If want to process objects from the Collection then we can use stream concepts of java 8.
3. Stream s=c.stream();
4. java.util.stream pkg

        import java.util.ArrayList;
        import java.util.List;
        import java.util.stream.Collectors;

        public class Main{
            public static void main(String[] args) {

                ArrayList<Integer> l1=new ArrayList<Integer>();

                l1.add(0);
                l1.add(3);
                l1.add(6);
                l1.add(8);
                l1.add(7);
                List<Integer> collect = l1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
                System.out.println(collect);
                
                List<Integer> collect1 = l1.stream().map(i -> i + 5).collect(Collectors.toList());

                System.out.println(collect1);
            }
        }
        
        [0,6,8]
        [5, 8, 11, 13, 12]
     
-----------------------------------------------------------------------------------------------------------------------------------------     
        
                import java.util.ArrayList;

                public class Main{
                    public static void main(String[] args) {

                        ArrayList<Integer> l1=new ArrayList<Integer>();

                        l1.add(15);
                        l1.add(45);
                        l1.add(68);
                        l1.add(79);
                        l1.add(34);

                        long count = l1.stream().filter(i -> i < 35).count();
                        System.out.println(count);

                    }
                }     
                
                2
                
 ---------------------------------------------------------------------------------------------------------------------------------------------
 
                import java.util.ArrayList;
                import java.util.List;
                import java.util.stream.Collectors;

                public class Main{
                    public static void main(String[] args) {

                        ArrayList<Integer> l1=new ArrayList<Integer>();

                        l1.add(15);
                        l1.add(45);
                        l1.add(68);
                        l1.add(79);
                        l1.add(34);

                        // sorted method sort objects in asc order by default
                        List<Integer> collect = l1.stream().sorted().collect(Collectors.toList());
                        System.out.println(collect);

                        //if we want to sort in desc order then we should go for Comparator
                        List<Integer> collect1 = l1.stream().sorted((i1, i2) -> ((i1 < i2) ? 1 : (i1 > i2) ? -1 : 0)).collect(Collectors.toList());
                        System.out.println(collect1);

                        //using Comparable
                        List<Integer> collect2 = l1.stream().sorted((i1, i2) -> i1.compareTo(i2)).collect(Collectors.toList());
                        System.out.println(collect2);

                        //using Comparable desc
                        List<Integer> collect3 = l1.stream().sorted((i1, i2) -> i2.compareTo(i1)).collect(Collectors.toList());
                        System.out.println(collect3);

                    }
                }
                
                [15, 34, 45, 68, 79]
                [79, 68, 45, 34, 15]
                [15, 34, 45, 68, 79]
                [79, 68, 45, 34, 15]
                
