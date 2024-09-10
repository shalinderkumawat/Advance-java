// Q1.
//    a-b;

// import java.util.*;
// public class F
// {
//     public static void main(String[] args)
// {
//     Scanner sc=new Scanner (System.in);
//     System.out.println("enter the value of number 1 :");
//     int a=sc.nextInt();

//     System.out.println("enter the value of b number :");
//     int b=sc.nextInt();
//     System.out.println("a-b ="+(a-b) );
   
// }

// Q2.
// a*b;
// import java.util.*;
// public class F
// {
//     public static void main(String[] args)
// {
//     Scanner sc=new Scanner (System.in);
//     System.out.println("enter the value of number 1 :");
//     int a=sc.nextInt();

//     System.out.println("enter the value of b number :");
//     int b=sc.nextInt();
//     System.out.println("a-b ="+(a*b) );
   
// }

// Q3. 
//    a/b;

// import java.util.*;
// public class F
// {
//     public static void main(String[] args)
// {
//     Scanner sc=new Scanner (System.in);
//     System.out.println("enter the value of number 1 :");
//     int a=sc.nextInt();

//     System.out.println("enter the value of b number :");
//     int b=sc.nextInt();
//     System.out.println("a-b ="+(a/b) );
   
// }

// Q4.  a+b+c+d


// import java.util.*;
// public class F{
//     public static void main(String[] args)
//     {
     
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the frist number :");
//         int a=sc.nextInt();
//         System.out.println("ente the secoind number :");
//         int b=sc.nextInt();
//         System.out.println("enter the threed number of value :");
//         int c=sc.nextInt();
//         System.out.println("enter the forth number");
//         int d=sc.nextInt();
//         System.out.println(a+"+"+b+"+"+c+"+"+d+"="+ (a+b+c+d) );
//     }
// }

// Q5.a+b-c*d


//    import java.util.*;
// public class F{
//     public static void main(String[] args)
//     {
     
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the frist number :");
//         int a=sc.nextInt();
//         System.out.println("ente the secoind number :");
//         int b=sc.nextInt();
//         System.out.println("enter the threed number of value :");
//         int c=sc.nextInt();
//         System.out.println("enter the forth number");
//         int d=sc.nextInt();
//         System.out.println(a+"+"+b+"-"+c+"*"+d+"="+ (a+b-c*d) );
//     }
// }

// Q6.
//     import java.util.*;
// public class F{
//     public static void main(String[] args)
//     {
     
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the frist number :");
//         int a=sc.nextInt();
//         System.out.println("ente the secoind number :");
//         int b=sc.nextInt();
//         System.out.println("enter the threed number of value :");
//         int c=sc.nextInt();
//         System.out.println("enter the forth number");
//         int d=sc.nextInt();
//         System.out.println(a+"+"+b+"-"+c+"*"+d+"="+ (a+(b*c)-d) );
//     }
// }

// Q7.

// (a+(b*c)-d);


// import java.util.*;
// public class F{
//     public static void main(String[] args)
//     {
//         Scanner sc=new Scanner (System.in);
//         System.out.println("enter the value of float value of one :");
//         float a=sc.nextFloat();
//         System.out.println("enter the secoind value float value of :");
//         float b=sc.nextFloat();
//         System.out.println("enter the threed float value of :");
//         float c=sc.nextFloat();
//         System.out.println("enter the value of forth number of :");
//         int d=sc.nextInt();
//         System.out.println(a+"+"+b+"*"+c+"+"+d+"="+ (a+(b*c)-d));
//     }
// }
 
// Q8.
   

/**
 * F
 */
/**
 * InnerF
 */

        interface A {
                class B{
                    interface C {
                        public class  D{
                        
                            void show(){
                                System.out.println("this is D");

                            }
                        }
                }
            }    
        }
       

public class F extends InnerF {
    public static void main(String[] args) {
       
        InnerF sc=new InnerF();
        sc.show1();
    }
}