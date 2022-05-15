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
            }
        }

        [0,6,8]
