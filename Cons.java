Main class :constructor :default : two number addition 
user input 

public class Cons {
    Cons(){
        int a=2;
        int b=2;
        System.out.println("The sum two number is "+(a+b));

    }

    public static void main(String [] args)
    {
        Cons in=new Cons();
        
    }
                                                           
}

Main class :constructor :default : two number sub 
user input

public class Cons {
    Cons(){
        int a=2;
        int b=2;
        System.out.println("The subtraction two number is "+(a-b));

    }

    public static void main(String [] args)
    {
        Cons in=new Cons();
        
    }
    
}


 Main class :constructor :default : two number multi
show() :divide 
show1() :modular  
user input


import java.util.Scanner;

public class  Cons{
Cons(){
    System.out.println("This number is multiply is :");
    int num=2; int numb1=4;
    System.out.println("The output is a :"+(num*numb1));
        
}
void show()
{   Scanner input=new Scanner (System.in);
    System.out.println("Enter the your number for divide ");
    int shoe=input.nextInt();
    int show1=input.nextInt();
    System.out.println("The number is divide is show; "+(show1/show());
    );
}
 void show1s()
 {  
    Scanner input=new Scanner(System.in);
    System.out.println("Entre the modluer number :");
    int modluer=input.nextInt();
 } 
 public static void main(String [] args);
 Cons sc=new Cons();
 sc.show();
 sc.show1();

}
}

class A 
A class :constructor :default : two number addition 
show() :divide 
user input 

Main class :constructor :default : two number sub 
user input


import java.util.*;
class A{
    void show()
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the value of divide of a:");
        int a=input.nextInt();
        System.out.println("Enter the value of b divide");
        int b=input.nextInt();
        System.out.println("The divide value of a and b:"+(a/b));
    }
    A()
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the value of a");
        int a=input.nextInt();
        System.out.println("Enter the value of b");
        int b=input.nextInt();
        System.out.println("The sum is a + b is :"+(a+b));

    }
}																
public class Cons{
    Cons()
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the number of subtraction :");
        int a=input.nextInt();
        System.out.println("Enter the number of b :");
        int b=input.nextInt();
        System.out.println("The sub is a and b is :"+(a-b));

    }
    public static void main(String [] args)
    {
        new Cons();
        A sc=new A();
        sc.show();
    }
}


class A 
A class :constructor :default : two number addition 
show() :divide 
user input 

class B
B class :constructor :default : two number addition 
show1() :mul 
user input 


Main class :constructor :default : two number sub 
show2() :add  

user input
main()
A 
B
Main access

import java.util.*;
class A{
    void show()
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the value of divide of a:");
        int a=input.nextInt();
        System.out.println("Enter the value of b divide");
        int b=input.nextInt();
        System.out.println("The divide value of a and b:"+(a/b));
    }
    A()
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the value of a");
        int a=input.nextInt();
        System.out.println("Enter the value of b");
        int b=input.nextInt();
        System.out.println("The sum is a + b is :"+(a+b));

    }
}
class B{
    B()
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the value of a");
        int a=input.nextInt();
        System.out.println("Enter the value of b");
        int b=input.nextInt();
        System.out.println("The sum is a + b is :"+(a+b));  
    }
    void show1()
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the number of a:");
        int a=input.nextInt();
        System.out.println("Enter the number of b :");
        int b=input.nextInt();
        System.out.println("The multiply");
    }
}
public class Cons{
    Cons()
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the number of subtraction :");
        int a=input.nextInt();
        System.out.println("Enter the number of b :");
        int b=input.nextInt();
        System.out.println("The sub is a and b is :"+(a-b));

    }
    void show2(){
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the number of subtraction :");
        int a=input.nextInt();
        System.out.println("Enter the number of b :");
        int b=input.nextInt();
        System.out.println("The sub is a and b is :"+(a+b));
    }
    public static void main(String [] args)
    {
       // new Cons();
        Cons sce=new Cons();
        sce.show2();
        A sc=new A();
        sc.show();

        B sb=new B();
        sb.show1();
    }
}


###########################################################
Main class :parameterised :default : two number addition 
user input


import java.util.*;
public class Cons{
    Cons(int a,int b){
        
    }
    public static void main(String [] args)
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the value of a for add two number :");
       int  a=input.nextInt();
        System.out.println("Enter the number of b for two number add:");
       int  b=input.nextInt();
        System.out.println("The two number is add is :"+(a+b));
        Cons sc=new Cons(a,b);
    }
}


Main class :parameterised :default : two number sub 
user input

import java.util.*;
public class Cons{
    Cons(int a,int b){
        
        System.out.println("The two number is sub is :"+(a-b));
    }
    public static void main(String [] args)
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the value of a for sub two number :");
       int a=input.nextInt();
        System.out.println("Enter the number of b for two number sub:");
       int  b=input.nextInt();
        Cons sc=new Cons(a,b);
    }
}

 Main class :parameterised :default : two number multi
show() :divide 
show1() :modular  
user input


import java.util.*;
public class Cons{
    Cons(int a,int b){
        
        System.out.println("The two number is multiply is :"+(a*b));
    }

   void show()
   {
    Scanner input=new Scanner (System.in);
    System.out.println("Enter the value of a ");
    int a=input.nextInt();
    System.out.println("Entre the value of b");
    int b=input.nextInt();
    System.out.println("The two number divide value is :"+(a/b));
   }
   void show1()
   {
    Scanner input=new Scanner (System.in);
    System.out.println("Enter the value of a:");
    int a=input.nextInt();
    System.out.println("Enter the value of b :");
    int b=input.nextInt();
    System.out.println("The two number modular is :"+(a%b));

   }
    public static void main(String [] args)
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the value of a for multiply two number :");
       int  a=input.nextInt();
        System.out.println("Enter the number of b for two number multiply:");
       int b=input.nextInt();

        Cons sc=new Cons(a,b);
        sc.show();
        sc.show1();
    }
}


class A 
A class :parameterised :default : two number addition 
show() :divide 
user input 

Main class :parameterised :default : two number sub 
user input


 import java.util.*;
class A{
    A(int a,int b)
    {
        System.out.println("The two number addition :"+(a+b));

    }
    void show()
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the value of a for divide :");
        int c=input.nextInt();
        System.out.println("Enter the value of b for divide :");
        int d=input.nextInt();
        System.out.println("The divide is two number is :"+(c/d));

    }
}
public class Cons{
    Cons(int w,int e)
    {
        System.out.println("The two number sum is :"+(w+e));
    }
    public static void main(String[]args)
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the value for addition a:");
        int a=input.nextInt();
        System.out.println("Enter the value for addition b");
        int b=input.nextInt();
        A sc=new A(a,b);
        sc.show();

        System.out.println("Enter the value for main con a");
        int w=input.nextInt();
        System.out.println("Enter the value for main con b");
        int e=input.nextInt();
        Cons s=new Cons(w,e);
    }
}


class A 
A class :parameterised :default : two number addition 
show() :divide 
user input 

class B
B class :parameterised :default : two number addition 
show1() :mul 
user input 


Main class :parameterised :default : two number sub 
show2() :add  

user input
main()
A 
B
Main access 

import java.util.*;
class A{
    A(int a,int b)
    {
        System.out.println("The two number add value is :"+(a+b));

    }
    void show (){
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the value of a :");
        int a=input.nextInt();
        System.out.println("Enter the value of b");
        int b=input.nextInt();
        System.out.println("The divide value is :"+(a/b));
    }
}
class B{
    B(int s,int w)
    {
        System.out.println("The add value is :"+(s+w));
    }
    void show1()
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the value of show1:");
        int a=input.nextInt();
        System.out.println("Enter the value of show1 2");
        int b=input.nextInt();
        System.out.println("The show1 and show2 multiply is :"+(a*b));
    }
}
public class Cons{
    Cons(int a,int b){
        System.out.println("The main class add value is :"+(a+b));
    }
    public static void main(String [] args){
    Scanner input=new Scanner (System.in);
    System.out.println("Enter The number of class A :");
    int a=input.nextInt();
    System.out.println("Enter the value of class A b:");
    int b=input.nextInt();
    A sc=new A(a, b);
    sc.show();

    B c=new B(a, b);
    c.show1();

    Cons scn=new Cons(a, b);
    
    
}
}