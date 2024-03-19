user input :
------------------------------------------------------------
class A

show1() :no return and no argument :addition  
show2() :no return and argument :multiplication 

class B 
show3() : return and no argument :division

show4() : return and argument :modular 


class Main 


single level child k through access:main()

import java.util.*;
class A{
    void show()
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the value of a");

        int a=input.nextInt();
        System.out.println("enter the value of b");
        int b=input.nextInt();

        System.out.println("addition :"+(a+b));
    }
    void show1(int a,int b)
    {
        System.out.println("multiplication :"+(a*b));
    }

}
class B extends A{
void show2(){
Scanner input=new Scanner (System.in);
System.out.println("Enter the value of a");

int a=input.nextInt();
System.out.println("enter the value of b");
int b=input.nextInt()
;
}

  int show3(int a,int b)
  {
    int c=a%b;
    return c;    

}

}
public class Multi{
    public static void main(String [] args)
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the value of a");
        int a=input.nextInt();
        System.out.println("Enter the value of b");
        int b=input.nextInt();
        B sc=new B();
        sc.show();
        sc.show1(a, b);
        sc.show2();
        System.out.println("modluer"+(sc.show3(a, b)));
    }

}

class A
show1() :no return and no argument :addition  
show2() :no return and argument :multiplication 

class B ex A
show3() : return and no argument :division

show4() : return and argument :modular 


class Main 
show5() : return and no argument :four number add

show6() : return and argument :four number multiplication 



single level child k through access:main()


import java.util.*;
class A{
    void show()
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the value of a");

        int a=input.nextInt();
        System.out.println("enter the value of b");
        int b=input.nextInt();

        System.out.println("addition :"+(a+b));
    }
    void show1(int a,int b)
    {
        System.out.println("multiplication :"+(a*b));
    }

}
class B extends A{
void show2(){
Scanner input=new Scanner (System.in);
System.out.println("Enter the value of a");

int a=input.nextInt();
System.out.println("enter the value of b");
int b=input.nextInt();
}

  int show3(int a,int b)
  {
    int c=a%b;
    return c;    

}

}
public class Multi{
    int show6()
     {
        Scanner input=new Scanner (System.in);

        int a=input.nextInt();
        int b=input.nextInt();
        int c=a+b;
        return c;

        
       
    }
    int show5(int a,int b)
        {
            int c=a*b;
         return    c;

        }

    public static void main(String [] args)
    {
        

        Scanner input=new Scanner (System.in);
        System.out.println("Enter the value of a");
        int a=input.nextInt();
        System.out.println("Enter the value of b");
        int b=input.nextInt();
        B sc=new B();
        sc.show();
        sc.show1(a, b);
        sc.show2();
        System.out.println("modluer"+(sc.show3(a, b)));
        Multi obj=new Multi();
        System.out.println(obj.show5(a, b));
        System.out.println(obj.show6());
    }

}

class A
show1() :no return and no argument :   division
show2() :no return and argument :multiplication 
covairant return type method 	

class B ex A
show3() : return and no argument :addition

show4() : return and argument :modular 
covairant return type method 

class Main 
show5() : return and no argument :four number add

show6() : return and argument :four number multiplication 
covairant return type method 


single level child k through access:main()


class A{
    void show()
    {
        System.out.println("a value if a=2");
        int a=2;
        System.out.println("b value is b=4");
        int b=4;
        System.out.println("The divide value is "+(a/b));

    }
    void show1(int a,int b)
    {
        System.out.println("The multiply value is "+(a*b));
    }
    A shpwA()
    {
        return this;
    }
}

class B extends A{
    int show3()
    {
       System.out.println("a vlaue is a:34");
       int a=34;
       System.out.println("b value is b:34");
       int b=34;
       int c=a+b;
       return c;
    }
    

    int show4(int a,int b)
    {
        
        int c=a%b;
        return c;
    }
}
public class Multi{
    int show5()
    {
        int a=1;
        int b=2;
        int c=3;
        int d=4;
        int e=a+b+c+b;
        System.out.println(e);
        return e;
    }

    int show6(int a,int b,int c,int d)
    {
        int e=a*b*c*b;
        return e;
    }

    Multi show()
    {
        return this;
    }
    public static void main(String [] args)
    {
        int a=34;
        int b=35;

        int c=3;
        int d=34;

        B sc=new B();
        sc.show();
        sc.show1(3, 4);
        System.out.println(sc.show3());
        System.out.println("The moduler is value :"+sc.show4(a, b));

        Multi s=new Multi();
        System.out.println(s.show5());
        s.show6(a, b, c, d);
    }
}


class A
A() :default :
show1() :no return and no argument :division  
show2() :no return and argument :modular
covairant return type method 

class B ex A
B() :default 
show3() : return and no argument :addition

show4() : return and argument : multiplication 
covairant return type method 

class Main 
Main() :default 

show5() : return and no argument :four number add

show6() : return and argument :four number multiplication 
covairant return type method 


single level child k through access:main()


class A{
    A()
    {
        //A() :default :
    }
    void show()
    {
        System.out.println("a value if a=2");
        int a=2;
        System.out.println("b value is b=4");
        int b=4;
        System.out.println("The divide value is "+(a/b));

    }
    void show1(int a,int b)
    {
        System.out.println("The multiply value is "+(a*b));
    }
    A shpwA()
    {
        return this;
    }
}

class B extends A{
    B()
    {
        // B ; default;
    }
    int show3()
    {
       System.out.println("a vlaue is a:34");
       int a=34;
       System.out.println("b value is b:34");
       int b=34;
       int c=a+b;
       return c;
    }
    

    int show4(int a,int b)
    {
        
        int c=a%b;
        return c;
    }
}
public class Multi{
    Multi()
    {
        //Multi default;
    }
    int show5()
    {
        int a=1;
        int b=2;
        int c=3;
        int d=4;
        int e=a+b+c+b;
        System.out.println(e);
        return e;
    }

    int show6(int a,int b,int c,int d)
    {
        int e=a*b*c*b;
        return e;
    }

    Multi show()
    {
        return this;
    }
    public static void main(String [] args)
    {
        int a=34;
        int b=35;

        int c=3;
        int d=34;

        B sc=new B();
        sc.show();
        sc.show1(3, 4);
        System.out.println(sc.show3());
        System.out.println("The moduler is value :"+sc.show4(a, b));

        Multi s=new Multi();
        System.out.println(s.show5());
        s.show6(a, b, c, d);
    }
}


class A
instance variable :normal 
getter setter method :two number addition 

class B 
instance variable :normal 
getter setter method :two number addition 


class Main 
instance variable :normal 
getter setter method :two number addition 

single level child k through access:main()


import java.util.*;
class A
{
        int a;
        int b;
        void seta(int a,int b)
        {
            this.a=a;
            this.b=b;
        }
        int gata()
        {
            return a;
        }
        int gatb()
        {
            return b;
        }
        void add1(int a,int b)
        {
            this.a=a;
            this.b=b;
            System.out.println("add"+(a+b));
        }
}

class B extends A{
    int s;
    int d;

    void set(int s,int d)
    {
        this.s=s;
        this.d=d;
    }
    int geta()
    {
        return s;
    }
    int gatb()
    {
        return d;
    }
    void add(int a,int b )
    {
        s=a;
        d=b;
        System.out.println("The add :"+(a+b));
    }
}


public class Multi
{
    int a;
    int b;
    void sat(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    int gata()
    {
        return a;
    }
    int gatb()
    {
        return b;
    }
    void add(int a,int b)
    {
         a=this.a;
         b=this.b;
        System.out.println("Main add"+(a+b));
    }
    public static void main(String [] args)
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the value of a ");
        int a=input.nextInt();
        System.out.println("Enter the value of b");
        int b=input.nextInt();


        B sc=new B();
        sc.add1(a,b);
        sc.add(a, b);

        Multi sho=new Multi();
        sho.add(a , b);
    }
}


class A
instance variable :private 
getter setter method :two number addition 

class B 
instance variable :private 
getter setter method :two number addition 


class Main 
instance variable :private 
getter setter method :two number addition 

single level child k through access:main()


class A{
    private int a;
    private int b;
    void set(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    int gata()
    {
        return a;

    }
    int gatb()
    {
        return b;
    }
    void add(int a,int b)
    {
        System.out.println("add the A class "+(a+b));
    
    }

}
class B extends A{

    private int a;
    private int b;
    void set(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    int gata()
    {
        return a;

    }
    int gatb()
    {
        return b;
    }
    void add(int a,int b)
    {
        super.add(a, b);

        System.out.println("add the B class "+(a+b));
    
    }
    
}

public class Multi{

    private int a;
    private int b;
    void set(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    int gata()
    {
        return a;

    }
    int gatb()
    {
        return b;
    }
    void add(int a,int b)
    {
        System.out.println("add the Main class "+(a+b));
    
    }
    public static void main(String[] args)
    {
        B sc=new B();
        sc.add(34, 344);

        Multi s=new Multi();
        s.add(3, 34);
    }
}

class A
instance variable :value deni hey through this 
:two number addition 

class B 
instance variable : 
 :two number addition 


class Main 
instance variable : 
 :two number addition 

single level child k through access:main()


class A{
     int a;
     int b;
    void set(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    int gata()
    {
        return a;

    }
    int gatb()
    {
        return b;
    }
    void add(int a,int b)
    {
        System.out.println("add the A class "+(a+b));
    
    }

}
class B extends A{

     int a;
     int b;
    void set(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    int gata()
    {
        return a;

    }
    int gatb()
    {
        return b;
    }
    void add(int a,int b)
    {
        super.add(a, b);

        System.out.println("add the B class "+(a+b));
    
    }
    
}

public class Multi{

     int a;
     int b;
    void set(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    int gata()
    {
        return a;

    }
    int gatb()
    {
        return b;
    }
    void add(int a,int b)
    {
        System.out.println("add the Main class "+(a+b));
    
    }
    public static void main(String[] args)
    {
        B sc=new B();
        sc.add(34, 344);

        Multi s=new Multi();
        s.add(3, 34);
    }
}

class A{
     int a;
     int b;
  public void set(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    int gata()
    {
        return a;

    }
    int gatb()
    {
        return b;
    }
    void add(int a,int b)
    {
        System.out.println("add the A class "+(a+b));
    
    }

}
class B extends A{

     int a;
     int b;
    void set()
    {
        this.a=a;
        this.b=b;
    }
    int gata()
    {
        return a;

    }
    int gatb()
    {
        return b;
    }
    void add(int a,int b)
    {
        super.add(a, b);

        System.out.println("add the B class "+(a+b));
    
    }
    
}

public class Multi{

     int a;
     int b;
    void set(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    int gata()
    {
        return a;

    }
    int gatb()
    {
        return b;
    }
    void add(int a,int b)
    {
        System.out.println("add the Main class "+(a+b));
    
    }
    public static void main(String[] args)
    {
        B sc=new B();
        sc.add(34, 344);

        Multi s=new Multi();
        s.add(3, 34);
    }
}

class A
instance variable :value deni hey through this 
default:two number addition 

class B 
instance variable : 
 :two number addition 


class Main 
instance variable : 
 :two number addition 

single level child k through access:main()


class A{
     int a;
     int b;
   void set(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    int gata()
    {
        return a;

    }
    int gatb()
    {
        return b;
    }
   default void add(int a,int b)
    {
        System.out.println("add the A class "+(a+b));
    
    }

}
class B extends A{

     int a;
     int b;
    void set()
    {
        this.a=a;
        this.b=b;
    }
    int gata()
    {
        return a;

    }
    int gatb()
    {
        return b;
    }
    void add(int a,int b)
    {
        super.add(a, b);

        System.out.println("add the B class "+(a+b));
    
    }
    
}

public class Multi{

     int a;
     int b;
    void set(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    int gata()
    {
        return a;

    }
    int gatb()
    {
        return b;
    }
    void add(int a,int b)
    {
        System.out.println("add the Main class "+(a+b));
    
    }
    public static void main(String[] args)
    {
        B sc=new B();
        sc.add(34, 344);

        Multi s=new Multi();
        s.add(3, 34);
    }
}


class A
show1() :public method 

class B 
show2()

class Main 

single level child k through access:main()

B k through kya show1 access ho jaega kya 



class A{
    public void show()
    {
        System.out.println("A class ");
    }
}
class B extends A{

}
public class Multi{
    public static void main(String [] args)

    {
        B sc=new B();
        sc.show();
    }
}


class A
show1() :private method 

class B 
show2()

class Main 

single level child k through access:main()

B k through kya show1 access ho jaega kya 


class A{
    private void show()
    {
        System.out.println("A class ");
    }
}
class B extends A{

}
public class Multi{
    public static void main(String [] args)

    {
        B sc=new B();
        sc.show();
    }
}
//error



class A
show1() :protected method 

class B 
show2()

class Main 

single level child k through access:main()

B k through kya show1 access ho jaega kya 

class A{
    protected void show()
    {
        System.out.println("A class ");
    }
}
class B extends A{

}
public class Multi{
    public static void main(String [] args)

    {
        B sc=new B();
        sc.show();
    }
}


class A
show1() :default method 

class B 
show2()

class Main 

single level child k through access:main()

B k through kya show1 access ho jaega kya 
------------------------------------------

class A{
    default void show()
    {
        System.out.println("A class ");
    }
}
class B extends A{

}
public class Multi{
    public static void main(String [] args)

    {
        B sc=new B();
        sc.show();
    }
}
//error


class A
A() :default :addition two number user input 

show1() :no return and no argument :division  
show2() :no return and argument :modular
covairant return type method 

class B ex A
B() :default :substraction two number user input 

show3() : return and no argument :addition

show4() : return and argument : multiplication 
covairant return type method 

class Main 
Main() :default 

show5() : return and no argument :four number add

show6() : return and argument :four number multiplication 
covairant return type method 


single level child k through access:main()

import java.util.*;
class A{
    default A() 
    {
        
            Scanner input=new Scanner (System.in);
            System.out.println("Enter the value of a");
            int a=input.nextInt();
            System.out.println("Enter the value of b");
            int b=input.nextInt();
            System.out.println("divide"+(a+b));
        
    }   
        void show()
        {
            Scanner input=new Scanner (System.in);
            System.out.println("Enter the value of a");
            int a=input.nextInt();
            System.out.println("Enter the value of b");
            int b=input.nextInt();
            System.out.println("divide"+(a/b));
        }
        
        void show1(int a,int b)
        {
                System.out.println("The value of moduler :"+(a%b));
        }

    
}

class B extends A {
        default B()
        {
                Scanner input=new Scanner (System.in);
                System.out.println("Enter the value of a");
                int a=input.nextInt();
                System.out.println("Enter the value of b");
                int b=input.nextInt();
                System.out.println("divide"+(a+b));    
        }
        int show1()
        {
                int a=34;
                int b=23;
                int c=a+b;
                return c;
        }
        int show2(int a,int b)
        {
                int c=a*b;
                return c;
        }
        B()
        {
                return B;
        }

}

public class Multi{

        default Multi()
        {

        }
        int a()
        {
                int a=1;
                int b=2;
                int c=3;
                int d=4;
                System.out.println(a+b+c+d);

        }
        int show5(int a,int b,int c,int d)
        {
                int w=a*b*c*d;
        }
        public static void main(String [] args)
{
        
        A s=new A();
        s.show();

        System.out.println("The value of a:");
        int a=23;
        int b=21;
        int c=3;
        int d=34;
        B sc=new B();
        sc.show();sc.show1();
        sc.show1(a, b);
        sc.show2(a, b);

        Multi sh=new Mulit();
        sh.a();
        sh.show5(a, b, c, d);
}
}



----------------------------------------------------------------------
		MULTILEVEL INHERITANCE 
class A
show1() :no return and no argument :division  

class B
show2() :no return and argument :modular


class C
show6() : return and argument :four number multiplication 


Main class 

multilevel  level child k through access:main()
--------------------------



import java.util.*;
class A{
    
        void show()
        {
            Scanner input=new Scanner (System.in);
            System.out.println("Enter the value of a");
            int a=input.nextInt();
            System.out.println("Enter the value of b");
            int b=input.nextInt();
            System.out.println("divide"+(a/b));
        }
           
}

class B {
        
        int show1()
        {
                int a=34;
                int b=23;
                int c=a+b;
                return c;
        }
        
       
}

class C extends A,B
{
        int show1(int a,int b,int c,int d)
        {
             int e=a*b*c*d;
             return e;   
        }
}

public class Multi{

        
        public static void main(String [] args)
{
        
        A s=new A();
        s.show();

        System.out.println("The value of a:");
        int a=23;
        int b=21;
        int c=3;
        int d=34;
        B sc=new B();
        sc.show();sc.show1();
        sc.show1(a, b);
        sc.show2(a, b);

        Multi sh=new Mulit();
        sh.a();
        sh.show5(a, b, c, d);
}
}


class A
addition :getter setter

class B
sub :getter setter


class C
div :getter setter


Main class 

multilevel  level child k through access:main()

 
class A{
        int a;
        int b;
        void sat(int a,int b)
        {
                this.a=a;
                this.b=b;
        }
        int gata()
        {
                return a;

        }
        int gat()
        {
                return b;
        }
        void add()
        {
                int c=a+b;
                System.out.println("add "+a+b);
        }
}

        

public class Multi
{
        public static void main(String [] args)
        {
                A sc=new A(3.2,4343)
                sc.a();

        }
}




