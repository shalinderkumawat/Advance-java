File A

import java.util.*;
class A{
     Aggr ab;
     A(Aggr ab)
     {
        this.ab=ab;

     }

    
     void show()
     {
        System.out.println(ab);
     }

}
public class All{
    
    public static void main(String [] args)
    {
        Scanner input=new Scanner (System.in);
        System.out.print("Enternter your id ");
        int i=input.nextInt();
        System.out.print("Enter your name ");
        String na=input.nextLine();
        System.out.println("Enter your company name");
        String co=input.nextLine();
        System.out.println("Enter your deparment");
        String de=input.nextLine();
        System.out.println("Enter your contact number ");
        int cto=input.nextInt();
        System.out.println("Enter your address");
        String ad=input.nextLine();
        System.out.println("Enter your email");
        String emai=input.nextLine();
        System.out.println("Enter your password");
        int pas=input.nextInt();
        System.out.println("Entre your salary");
        int salar=input.nextInt();

Aggr sc=new Aggr(i, na, co, de, cto, ad, emai, pas, salar) ;
       A l=new A(sc);
       l.show();


    }
}


File B

public class Aggr {
    int id;
    String name;
    String com;
    String dep;
    int con;
    String add;
    String email;
    int pass;
    int salary;
    Aggr(int i, String nam, String co, String de, int ct,String ad,String emai,int pas,int salar)
    { this.con=ct;
   this.id=i;
    this.name=nam;
    this.com=co;
    this.dep=de;
       this.salary=salar;
   this.pass=pas; 
   this.email=emai;
   this.add=ad;
  

    }

    
}


 	