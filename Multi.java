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