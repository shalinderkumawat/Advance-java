1)
class A 
only show() name method 
method overload 
addition
sub
div 
multi

overload +remove
---------------------------
overload

package oops;

class A{
    void show(int a,int b)
    {
        int c=a+b;
        System.out.println(c);
    }
    void show(int a,int b)
    {
        int c=a*b;
        System.out.println(c);
    }
    void show(int a,int b)
    {
        int c=a/b;
        System.out.println(c);
    }
    void show(int a,int b)

    {
        int c=a-b;
        
    }
}
public class Overload {
    public static void main(String [] args)
    {
        A sc=new A();
        sc.show(0, 0);
    }

    
}
-----------------------------
remove

package oops;

class A{
    void show(int a,int b,int c)
    {
        c=a+b;
        System.out.println(c);
    }
    void show(int a,int b,int s,int w)
    {
        int c=a*b;
        System.out.println(c);
    }
    void show(char a,int b,float s)
    {
        int c=a/b;
        System.out.println(c);
    }
    void show(int a,int b)

    {
        int c=a-b;
        
    }
}
public class Overload {
    public static void main(String [] args)
    {
        A sc=new A();
        sc.show(0, 0);
    }

    
}



2)
class Main
only show() name method 
method overload 
addition
sub
div 
multi

overload->


package oops;

public class Overload {
    
    void show(int a,int b)
    {
        System.out.println("add"+(a+b));
    }
    
    void show(int a,int b)
    {
        System.out.println("add"+(a-b));
    }
    void show(int a,int b)
    {
        System.out.println("add"+(a*b));
    }
    void show(int a,int b)
    {
        System.out.println("add"+(a/b));
    }
    public static void main(String [] args)
    {
        Overload sc=new A();
        sc.show(0, 0);
    }

    
}
--------------------------------------------------
remove

package oops;

public class Overload {
    
    void show(int a,int b,int c)
    {
        System.out.println("add"+(a+b));
    }
    
    void show(int a,int b,float s)
    {
        System.out.println("add"+(a-b));
    }
    void show(int a,int b,float w,int d)
    {
        System.out.println("add"+(a*b));
    }
    void show(int a,int b)
    {
        System.out.println("add"+(a/b));
    }
    public static void main(String [] args)
    {
        Overload sc=new Overload();
        sc.show(0, 0);
    }

    
}


3)
single level 

overload +remove 
-------------------------
overload

package oops;
class A{
 void show(int a,int b)
    {
        System.out.println("add"+(a+b));
    }
    
    void show(int a,int b)
    {
        System.out.println("add"+(a-b));
    }
    void show(int a,int b)
    {
        System.out.println("add"+(a*b));
    }
    void show(int a,int b)
    {
        System.out.println("add"+(a/b));
    }
}
public class Overload extends A {
    
   
    public static void main(String [] args)
    {
        Overload sc=new Overload();
        sc.show(0, 0);
    }

    
}

remove

package oops;
class A{
 void show(int a,int b,int s)
    {
        System.out.println("add"+(a+b));
    }
    
    void show(int a,int b,float e)
    {
        System.out.println("add"+(a-b));
    }
    void show(int a,int b,boolean e)
    {
        System.out.println("add"+(a*b));
    }
    void show(int a,int b)
    {
        System.out.println("add"+(a/b));
    }
}
public class Overload extends A {
    
   
    public static void main(String [] args)
    {
        Overload sc=new Overload();
        sc.show(0, 0);
    }

    
}


4)
multilevel 
overload +remove 

package oops;
class A{
 void show(int a)
 {
    System.out.println("A class "+a);
 }
 void show(int a)
{
    System.out.println("The class A ||"+a);
}
}
class B extends A{
    void show(int a)
    {
        System.out.println("Class B"+a);
    }
    void show(int a)
    {
        System.out.println("The Class B ||"+a);
    }
}
public class Overload extends B {
    
   
    public static void main(String [] args)
    {
        Overload sc=new Overload();
        sc.show(34);
    }

    
}

remove

package oops;
class A{
 void show(int a,int c)
 {
    System.out.println("A class "+a);
 }
 void show(int a,float w)
{
    System.out.println("The class A ||"+a);
}
}
class B extends A{
    void show(int a,boolean e)
    {
        System.out.println("Class B"+a);
    }
    void show(int a)
    {
        System.out.println("The Class B ||"+a);
    }
}
public class Overload extends B {
    
   
    public static void main(String [] args)
    {
        Overload sc=new Overload();
        sc.show(34);
    }

    
}

----------
5)heirarichal 

overload +remove

package oops;
class A{
 void show(int a)
 {
    System.out.println("A class "+a);
 }
 void show(int a)
{
    System.out.println("The class A ||"+a);
}
}
class B extends A{
    void show(int a)
    {
        System.out.println("Class B"+a);
    }
    void show(int a)
    {
        System.out.println("The Class B ||"+a);
    }
}
public class Overload extends A {
    
   
    public static void main(String [] args)
    {
        Overload sc=new Overload();
        sc.show(32);
    }

    
}
 
----------
remove
package oops;
class A{
 void show(int a,int c)
 {
    System.out.println("A class "+a);
 }
 void show(int a,float w)
{
    System.out.println("The class A ||"+a);
}
}
class B extends A{
    void show(int a,boolean e)
    {
        System.out.println("Class B"+a);
    }
    void show(int a)
    {
        System.out.println("The Class B ||"+a);
    }
}
public class Overload extends A {
    
   
    public static void main(String [] args)
    {
        Overload sc=new Overload();
        sc.show(34);
    }

    
}


6)
class Main
only main() name method 
method overload 
addition
sub
div 
multi


error

package oops;

public class Overload extends A {
    
     void show(int a )
        {
          System.out.println("A class "+(a+a) );
         }
         void show(int a)
        {
         System.out.println("The class A ||"+(a-a));
          }
         void show(int a)
        {
         System.out.println("The class A ||"+(a*a));
          }
         void show(int a)
        {
         System.out.println("The class A ||"+(a/a));
          }
    public static void main(String [] args)
    {
        
        Overload sc=new Overload();
        sc.show(0);
    }

    
}


ramove

package oops;

public class Overload  {
    
     void show(int a ,int r)
        {
          System.out.println("A class "+(a+a) );
         }
         void show(int a,int s,int f)
        {
         System.out.println("The class A ||"+(a-a));
          }
         void show(int a,boolean w)
        {
         System.out.println("The class A ||"+(a*a));
          }
         void show(int a)
        {
         System.out.println("The class A ||"+(a/a));
          }
    public static void main(String [] args)
    {
        
        Overload sc=new Overload();
        sc.show(0);
    }

    
}


7)
class Main
constructor 
method overload 
addition
sub
div 
multi

overload +remove 

package oops;

public class Overload  {
    
    Overload()
                {
                    int a=23;
                    int b=2;
                    int c=a+b;
                    System.out.println(c);
                }
    Overload()
                {
                    int a=23;
                    int b=2;
                    int c=a-b;
                    System.out.println(c);
                }
    Overload()
                {
                    int a=23;
                    int b=2;
                    int c=a/b;
                    System.out.println(c);
                }
    Overload()
                {
                    int a=23;
                    int b=2;
                    int c=a*b;
                    System.out.println(c);
                }
    public static void main(String [] args)
    {
        
        Overload sc=new Overload();
        
    }

    
}

remove

package oops;

public class Overload  {
    
    Overload(int a,int b)
                {
                    
                    int c=a+b;
                    System.out.println(c);
                }
    Overload()
                {
                    int a=23;
                    int b=2;
                    int c=a-b;
                    System.out.println(c);
                }
    Overload(String [] argd)
                {
                    int a=23;
                    int b=2;
                    int c=a/b;
                    System.out.println(c);
                }
    Overload(int a,int b,int f)
                {
                    
                    int c=a*b;
                    System.out.println(c);
                }
    public static void main(String [] args)
    {
        int a=2;
        int b=34;
        
        Overload sc=new Overload();
        new Overload(a, b);
        new Overload(a,b);
        new Overload();
        
    }

    
}


8)
constructor chaining :
class Main
constructor  
addition
sub
div 
multi

package oops;

public class Overload  {
    
    Overload()
                {
                    
                    int c=a+b;
                    System.out.println(c);
                }
    Overload()
                {
                    int a=23;
                    int b=2;
                    int c=a-b;
                    System.out.println(c);
                }
    Overload()
                {
                    int a=23;
                    int b=2;
                    int c=a/b;
                    System.out.println(c);
                }
    Overload()
                {
                    
                    int c=a*b;
                    System.out.println(c);
                }
    public static void main(String [] args)
    {
        int a=2;
        int b=34;
        
        Overload sc=new Overload();
        new Overload(a, b);
        new Overload(a,b);
        new Overload();
        
    }

    
}

--------------------------------
remove

package oops;

public class Overload  {
    
    Overload(int a,int b)
                {
                    
                    int c=a+b;
                    System.out.println(c);
                }
    Overload()
                {
                    int a=23;
                    int b=2;
                    int c=a-b;
                    System.out.println(c);
                }
    Overload(String [] argd)
                {
                    int a=23;
                    int b=2;
                    int c=a/b;
                    System.out.println(c);
                }
    Overload(int a,int b,int f)
                {
                    
                    int c=a*b;
                    System.out.println(c);
                }
    public static void main(String [] args)
    {
        int a=2;
        int b=34;
        
        Overload sc=new Overload();
        new Overload(a, b);
        new Overload(a,b);
        new Overload();
        
    }

    
}


9)
class A :abstract
show1 :abs : return and  argument 
show2 :abs: return and no argument 


abstract class A{
   abstract int show(int a,int b);
   abstract void show1();   
   
}
class  B {
    int show(int a,int b)
    {
        return a+b;
    }
    void show1()
    {
        int s=23;
        int e=32;
        System.out.println(s+e);
    }
    void show2()
    {
        int a=34;
        int l=34;
        System.out.println(a+l);
    }
    void show3()
    {
        int a=32;
        int s=2;
        System.out.println(a+s);
    }
}
public class Other{
    public static void main(String [] args)
    {
        B sc=new B();
        sc.show(23, 23);
        sc.show1();
        sc.show2();
        sc.show3();
    }
}


10)
class A :abstract
show1 :abs : return and  argument 
show2 :abs: return and no argument 


class B ex A 
show3 ::no return and no argument 

show4 ::no return and  argument 

class Main ex A 
access

abstract class A{
   abstract int show(int a,int b);
   abstract void show1();   
   
}
class  B extends A{
    int show(int a,int b)
    {
        return a+b;
    }
    void show1()
    {
        int s=23;
        int e=32;
        System.out.println(s+e);
    }
    void show2()
    {
        int a=34;
        int l=34;
        System.out.println(a+l);
    }
    void show3()
    {
        int a=32;
        int s=2;
        System.out.println(a+s);
    }
}
public class Other extends A{
    public static void main(String [] args)
    {
        B sc=new B();
        sc.show(23, 23);
        sc.show1();
        sc.show2();
        sc.show3();

        Other s=new Other();
        s.show(3, 23);
        s.show1();
    }
}

11)
class A :abstract
show1 :abs : return and  argument 
show2 :abs: return and no argument 


class B 
show3 ::no return and no argument 

class Main ex A  
show3 ::no return and no argument 

show4 ::no return and  argument 

access

abstract class A{
   abstract int show(int a,int b);
   abstract void show1();   
   
}
class  B{
    int show(int a,int b)
    {
        return a+b;
    }
    void show1()
    {
        int s=23;
        int e=32;
        System.out.println(s+e);
    }
    void show2()
    {
        int a=34;
        int l=34;
        System.out.println(a+l);
    }
    void show3()
    {
        int a=32;
        int s=2;
        System.out.println(a+s);
    }
}
public class Other extends A{
    public static void main(String [] args)
    {
        B sc=new B();
        sc.show(23, 23);
        sc.show1();
        sc.show2();
        sc.show3();

        Other s=new Other();
        s.show(3, 23);
        s.show1();
    }
}

12)
class A :abstract
show1 :abs : return and  argument 
show2 :abs: return and no argument 


class B ex A 
show3 ::no return and no argument 

show4 ::no return and  argument 

class Main ex B 
access

abstract class A{
   abstract int show(int a,int b);
   abstract void show1();   
   
}
class  B extends A{
    int show(int a,int b)
    {
        return a+b;
    }
    void show1()
    {
        int s=23;
        int e=32;
        System.out.println(s+e);
    }
    void show2()
    {
        int a=34;
        int l=34;
        System.out.println(a+l);
    }
    void show3()
    {
        int a=32;
        int s=2;
        System.out.println(a+s);
    }
}
public class Other extends A{
    public static void main(String [] args)
    {
        B sc=new B();
        sc.show(23, 23);
        sc.show1();
        sc.show2();
        sc.show3();

        Other s=new Other();
        s.show(3, 23);
        s.show1();
    }
}

13)
class A :abstract
show1 :abs : return and  argument 

class C :ex D

class D :abstract
show2 :abs: return and no argument 


class B  ex A 
show3 ::no return and no argument 

class Main ex A  
show3 ::no return and no argument 

show4 ::no return and  argument 

access


abstract class A{
    abstract int show(int a,int b);
}

class C extends D{
    int show1()
    {
        int a=23;
        return a;
    }

}

abstract class D{
   abstract int show1();
   
}

class B extends A{

    int show(int a,int b){
        return b;
    }
    void show2()
    {
        int a=2;
        int b=2;
        System.out.println(a+b);
    }
}

public class Other extends A{
   
        int show(int a,int b)
        {
            return a;
        }

        void show3()
        {
            int a=23;
            int b=32;
            System.out.println(a+b);
        }

        void show4(int a,int b)
        {
            System.out.println(a+b);
        }
    public static void main(String [] args)
    {
        Other sc=new Other();
        sc.show(32, 012);
        sc.show3();
        sc.show4(3, 340);

        C s=new C();

        s.show1();

        B f=new B();
        f.show(23, 032);


    }
}


