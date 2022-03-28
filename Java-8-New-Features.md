# Java 8 New Features:

1. The main objective of java 8 is to enable functional programming in java so that just like another languages we can able to write very less code to do more things.

2. So whatever functional programming benifits are there now we can enjoy those benifits in java also because of lambda expression concepts.

3. There are several feature of java 8 but the biggest advantage is we can write concise code we are not required to write big big code.  

## Calculate sqrt using normal java programming:

    class Test
    {
        public static int squreIt(int n)
        {
                return n*n
        }
    
        public static void mian(String args[])
        {
       
                System.out.println("The squre of 4 is"+squreIt(4));
                System.out.println("The squre of 8 is"+squreIt(8));
       
        }
    }

## Calculate sqr using java 8 features:

    import java.util.function.*;
    class Test
    {
        
        public static void mian(String args[])
        {
                Predicate<Integer,Integer>f=i->i*i;
                System.out.println("The squre of 4 is"+f.applay(40));
                System.out.println("The squre of 8 is"+f.applay(30));
       
        }
    }   
    
## Calculate even number using java 8 features:

      import java.util.function.*;
        class Test
        {

            public static void mian(String args[])
            {
                    Function<Integer>p=i->i%2==0;
                    System.out.println("The squre of 4 is"+p.test(4));
                    System.out.println("The squre of 8 is"+p.test(3));

            }
        }     

* Lambda Expression
* Functional Interface
* Default method and Static method
* Predefine Functional Interface
    
      * Predicate
      * Function
      * Consumer
      * Supplier
      * etc
* Double Colon Operator(::)
* Method Reference
* Constructor Reference
* Streams
* Date and Time Api
* Optional class
* Nashron Javascript Engin
* etc

#  Lambda Expression:

1. The main objective of lambda expression is to bring functional progarmming in java.  
2. It is an anonymous function, means it dont have any name,it dont have any return type ,and it dont have modifires.

##  write a function which print hello world using both ways:

    //Normal java function 
    
    public void m1()
    {
        System.out.println("Hello world");
    }
    
    // Lambda Function
    
    () -> System.out.println("Hello world");
    
    
## Write a function which take 2 arguments and print sum:

    //Normal java function 
    public void sum(int a,int b)
    {
         System.out.println(a+b);
    }
     // Lambda Function
     // some time compiler uess the varibale type automatically we are not required to write explicitly.
     
    (a,b)->System.out.println(a+b);
    
## Write a function which calculate squr:

    //Normal java function 
    
    public int squareIt(int a)
    {
    
        return a*a;
    }

    // Lambda Function
    
    1. (int a) -> {return a*a;}
    2. (int a) -> a*a;
    3. (a) -> a*a;
    4. a -> a*a;
    
