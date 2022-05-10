# Functional Interface:

An interface which contains only One Abstract Method is called functional interface like.  

1. Runnable=>   run()
2. Comparable=> compareTo()
3. Comparator=> compare()
4. ActionListener=> actionPerformed()
5. Callable=> call()

Q) In java 8 we can use default method and static method in interface,so can we use it in functional interface also ?  

ans: Restriction is aplicable only for abstract method,but not for default method and static method you can take any numbers of default method and static method in functional interface .

@FunctionalInterface annotation is used to make functional interface, But it is not compulsory.

### Labmda Functoin with Functional Interface:
        
            //Example 1
            
            package com.shaukat;

            @FunctionalInterface
            interface inter {
                public void m1();

            }

            /*class Demo implements inter
            {
                @Override
                public void m1() {
                    System.out.println("hello.......");
                }
            }*/

            public class Main {

                public static void main(String[] args) {

                    /*Demo d1=new Demo();
                    d1.m1();

                    inter d2=new Demo();
                    d2.m1();*/

                    // we are replacing above by lambda function

                    inter i1 = () -> System.out.println("Hello world.........");
                    i1.m1();

                }
            }
            // Hello world.........        
            
            
            
            //Example 2
           
            package com.shaukat;

            @FunctionalInterface
            interface inter {
                public void m1(int a, int b);

            }

            public class Main {

                public static void main(String[] args) {
                    inter i1 = (a, b) -> System.out.println("The sum :" + (a + b));
                    i1.m1(10, 20);
                    i1.m1(100,200);
                    i1.m1(1000,2000);

                }
            }
            //The sum :30
            //The sum :300
            //The sum :3000
            
## Runnable Example with lambda expression:

                import java.util.*;

                /*class MyThread implements Runnable
                {
                    @Override
                    public void run() {
                        for(int i=0;i<10;i++)
                        {
                            System.out.println("Child"+i);
                        }
                    }
                }*/
                public class Main {
                    public static void main(String[] args) {
                //        MyThread m=new MyThread();
                //        Thread t1=new Thread(m);
                //        t1.start();

                        Runnable r=()->{
                            for(int i=0;i<10;i++)
                            {
                                System.out.println("Child"+i);
                            }
                        };
                        Thread t1=new Thread(r);
                        t1.start();
                        for(int i=0;i<10;i++)
                        {
                            System.out.println("Main"+i);
                        }
                    }
                }        