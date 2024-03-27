abstract class A{
    A(){};
   
    abstract int show1(int a);
    int show2()
    {
        System.out.println("Hello");
        return 0;
    }
    
}

class B extends A{
    B(){};
    int show1(int a)
    {
        a=34;
        return a;
    }
    String show3(String a)
    {
        a="hi my name is shailendra kumawat";
        return a;
    }
    void show4()
    {
        System.out.println("Class B");
    }
    

}
abstract class C
{
    C(){};
    abstract void show5();
    void show6()
    {
        System.out.println("C class ");
    }
}

class D extends C{
    void show5()
    {
        System.out.println("C class to D class");
    }
    void show7()
    {
        System.out.println("1");
    }
    void show8()
    {
        System.out.println("w");
    }

}


public class Abs{
    public static void main(String [] args)
    {

        System.out.println("child k through object");
     
        A ab=new B();
          ab.show1(2);
          ab.show2();
        
        B b=new B();
          b.show3("hi class B");
          b.show4();
        
        C cd=new D();
          cd.show5();
          cd.show6();
          
        D d=new D();
          d.show7();
          d.show8();
          
    System.out.println("anonymous");
    
        A s=new A(){
            int show2(int a)
            {
                return a;
            }
        };
          
    }
}


