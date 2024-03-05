1)C program to find out whether a given year is a leap year or not:
import java.util.*;
public class C {
    public static void main(String[] args)
    {
        System.out.println("This program show leap year ");
        Scanner input =new Scanner (System.in);
        System.out.println("Enter year :");
        int year=input.nextInt();
        if(year%4==0)
        {
            // System.out.println("This year is leap year ");
            if(year%100!=0){
                System.out.println("This is not leap yaer");
            }
            if(year%400==0){
                System.out.println("This year is leap year ");
            }
        }
        else
        {
            System.out.println("This year is not leap year");
        }
    }
    
}

2)C program to convert temperature from Fahrenheit to Celsius and Celsius to Fahrenheit
celsius 
f 
c---f 
ceclius 
f---->c 

import java.util.*;
public class C{
    public static void main(String[] args)
    {
        Scanner input =new Scanner (System.in);
        
        System.out.println(" c= celsius  f= fahrenheit ");
        char a=input.next().charAt(0);
        if(a=='c'){
        System.out.println("Enter tempratur in Fahrenheit (°F)");
        float fahrenheit =input.nextFloat();
        System.out.println("Enter tempratur celsius :");
        int celsius=input.nextInt();
        float f=(9/5*celsius)+32;
        System.out.println(" = "+ f);
        }
        else if(a=='f')
        {
            System.out.println("Enter tempratur in Fahrenheit (°F)");
            float fahrenheit =input.nextFloat();
        System.out.println("Enter tempratur celsius :");
        int celsius=input.nextInt();
        float r=(fahrenheit-32)*(5/9);
        System.out.println(" = "+ r);
        }
    }
}

3)Check whether the trainge , square , reactanlge (area & volume)
->input area /volume 
area 
traingle square rectangle 
square 

import java.util.*;
public class C{
    public static void main(String[] args)
    {
        Scanner input=new Scanner (System.in);
        System.out.println("traingle , square , reactanlge");
        String what=input.nextLine();
        if(what=="traingle")
        {
            System.out.println("area , volum");
            String av=input.nextLine();
            if(av=="area")
            {
                System.out.println("Enter the base value");
                int base=input.nextInt();
                System.out.println("Enter height value");
                int height=input.nextInt();
                int area=(base*height)/2;
                System.out.println(area);

            }
            else if(av=="volume")
            {
                System.out.println("Enter the base value");
                int bas=input.nextInt();
                System.out.println("Enter the height value");
                int hei=input.nextInt();
                int volume=bas*hei;
                System.out.println(volume);

            }
        }
        else if(what=="square")
        {
            System.out.println("area volume");
            String w=input.nextLine();
            if(w=="area")
            {
                System.out.println("Enter the side value");
               int A=input.nextInt();
               int q=A*A;
               System.out.println(q); 
            }
            else if(w=="volume")
            {
                System.out.println("Enter side value");
                int d=input.nextInt();
                int e=d*d*d;
                System.out.println(e);
            }

        }
        else if(what=="reactanlge")
        {
            System.out.println(" area  volume");
            String j=input.nextLine();
            if(j=="area")
            {
                System.out.println("Enter the length");
                int o=input.nextInt();
                System.out.println("Enter the width value");
                int e=input.nextInt();
                int g=o*e;
                System.out.println(g);
            }
            else if(j=="volume")
            {
                System.out.println("Enter the length :");
                int t=input.nextInt();
                System.out.println("Enter the width");
                int o=input.nextInt();
                System.out.println("Eneter the height");
                int l=input.nextInt();
                int reactanlge=t*o*l;
                System.out.println(reactanlge);
            }

        }
        else 
        {
            System.out.println("this string is not match");
        }
    }
}
}

4)java program to check whether a character is an alphabet or not
input =a =alpha 
3 =this is a digit 

import java.util.*;
public class C{
    public static void main(String[] args){
        Scanner input=new Scanner (System.in);
        System.out.println("Enter your choice anyone in your keyboard ");
        int a=input.nextInt();
        String s=input.nextLine();
        if(a>=1||a<=100)
        {
            System.out.println("this character is number : "+ a);
        }
    }   
    
      else if(s>="a"||s<="z")
    {
        System.out.println("sorry tihs character is not valide");
    }s

}

5) C program to enter student marks and find percentage and grade
A college has the following rules for the grading system:
5 marks (grade + %)
1. Below 25 – F
2. 25 to 45 – E
3. 45 to 50 – D
4. 50 to 60 – C
5. 60 to 80 – B 
6. Above 80 – A


import java.util.*;
public class C{
    public static void main(String [] args){
    System.out.println("this program is show your collage cgp etc. ");
    System.out.println("Enter your subject number ");
    Scanner input =new Scanner (System.in);
    int dbms=input.nextInt();
    int foc=input.nextInt();
    int os=input.nextInt();
    int web=input.nextInt();
    int ml=input.nextInt();
    float total=(dbms+foc+os+web+ml)/5;

    System.out.println(total);
   System.out.println(total);
     if(total>=25)
     {
      System.out.println("f");
     }
     else if(total>=25&&total<=45)
     {
      System.out.println("e");

     }
     else if(total>45&&total<=50)
     {
      System.out.println("d");
     }
     else if(total>=50&&total<=60)
     {
      System.out.println("c");
     }
     else if(total>60&&total<=80)
     {
      System.out.println("b");
     }
     else if(total>80)
     {
      System.out.println("A");
     }
    }
}

6)Write a java program to accept the height of a person in centimeters and categorize the person according to their height.
->meter ===>cm 
mid 
low 
high 

import java.util.*;
public class C{
  public static void main(String[] args)
  {
    Scanner input=new Scanner (System.in);
    System.out.println("Enter your hight in cm");
    int cm=input.nextInt();
    if(cm<=150)
    {
      System.out.println("lower ");
    }
    else if(cm>=150&&cm<=200)
    {
      System.out.println("mid");
    }
    else if(cm>=200&&cm<=250)
    {
      System.out.println("high");
    }
  }
}


7)Write a java program to read the roll no, name,fnname and marks of three subjects and calculate the total, percentage and division.
Test Data :
Input the Roll Number of the student :784
student name : 
fname:
mname:
address:
contact:
Input the marks of Physics, Chemistry and Computer Application : 70 80 90
total: 
precentage : % 
division:

import java.util.*;
public class C{
  public static void  main(String[] args)
  {
    Scanner input=new Scanner(System.in);
    System.out.println("Test data : ");
    int date=input.nextInt();
    
    System.out.println("Input the Roll number of the student : ");
    int rollno=input.nextInt();
    System.out.println("Student Name :");
    String name=input.nextLine();
    input.nextLine();
    System.out.println("Enter your father name :");

    String fname=input.nextLine();
    input.nextLine();
    System.out.println("Enter your mother name :");
    String mname=input.nextLine();
    input.nextLine();
    System.out.println("Enter your address");
    System.out.println("Contact ");
    int con=input.nextInt();
    

    System.out.println("Input the marks of Physics, Chemistry and Computer Application :");
    int p,c,ca;
    p=input.nextInt();
    c=input.nextInt();
    ca=input.nextInt();
    int total=p+c+ca;
    System.out.println("Total : " + total);
    int precentage=p+c+ca/5;
    System.out.println("precentage :" +precentage);
    if(precentage>=45)
    {
      System.out.println("f");
    }
    else if (precentage>=45&&precentage<=60)
    {
      System.out.println("frist");
    }
    else if(precentage>=60&&precentage<=80)
    {
      System.out.println("A+");
    }
    else if(precentage>=80&&precentage<=99)
    {
      System.out.println("A++");
      
    }




  }
    
}

8) 5 number input 
>40 
average 
3. 45 to 50 – D
4. 50 to 60 – C
5. 60 to 80 – B
6. Above 80 – A 
otherwise fail 

import java.util.*;
public class C{
  public static void  main(String[] args)
  {
    Scanner input=new Scanner (System.in);
     System.out.println("Input the marks of Physics, Chemistry and Computer Application :");
    int p,c,ca;
    p=input.nextInt();
    c=input.nextInt();
    ca=input.nextInt();
    int total=p+c+ca;
    System.out.println("Total : " + total);
    int precentage=(p+c+ca)/3;
    System.out.println("precentage :" +precentage);
    if(precentage>=45)
    {
      System.out.println("fail");
    }
    else if (precentage>=45&&precentage<=50)
    {
      System.out.println("D");
    }
    else if(precentage>=50&&precentage<=60)
    {
      System.out.println("c");
    }
    else if(precentage>=60&&precentage<=80)
    {
      System.out.println("B");
      
    }
    else if(precentage>80)
    {
      System.out.println("A");
    }




  }
    
}

9)three number max used only if else 

import java.util.*;
public class C{
  public static void main(String[] args)
  {
    Scanner input=new Scanner (System.in);
    System.out.println("Enter the value of a :");
    int a=input.nextInt();
    System.out.println("Enter the value of b :");
    int b=input.nextInt();
    System.out.println("Enter the value of c :");
    int c=input.nextInt();
    if(a>b&&a>c)
    {
      System.out.println(a + " a value is max");

    }
    else if(b>a&&b>c)
    {
      System.out.println(b+" b value is max");
    }
    else if(c>a&&c>b) 
    {
      System.out.println(c+"c value is max");
    }
  }
}

10) 
salalry :
holidays (1) =full salary 
2-5 =5% 
5-14 =10% 
15 =50% 
else =not salary 

output : 
name:
address: 
bank details: 
salary : 
alot :
 holidays 

import java.util.*;
public class C{
public static  void  main(String[] args)
{
  Scanner input=new Scanner (System.in);
  System.out.print("Enter your name : ");
  System.out.println();
  String name=input.nextLine();
  System.out.print("Enter your address :");
  String add=input.nextLine();
  System.out.print("Enter your bank details :");
  String bank=input.nextLine();
  System.out.print("Enter your salary : ");
  int sala=input.nextInt();
  int sub;
  System.out.print("Enter your holiday in number :");
  int holiday=input.nextInt();
  int alot;
  if(holiday>=2&&holiday<=5)
  {
     sub = 5/holiday*100;
     alot = sala-sub;
     System.out.println("Your salary is:"+alot);
  }
  else if(holiday>5&&holiday<=14)
  {
    sub = 10/holiday*100;
     alot = sala-sub;
     System.out.println("Your salary is:"+alot);
  }
   else if( holiday>15)
   {
    sub = 50/holiday*100;
     alot = sala-sub;
     System.out.println("Your salary is:"+alot);
   }

  
}
}

12)
electric city bill : 
4 unit 
40 
1- 10 = 10% 
11-20 =15% 
21-40 =30% 
50 =50% 

output : 
name:
unit :3 
amout 30 
discout : 10% 
total pay amount : 

import java.util.*;
public class C{
public static  void  main(String[] args)
{
  Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name ");
        String sname = sc.nextLine();
        System.out.println("Enter the unit ");
        int unit = sc.nextInt();
        int amount = unit*10;
        System.out.println("Amount "+amount);
        if(unit<=10){
            float dis = ((amount*10)/100);
            System.out.println("The discount amount is "+dis);
            System.out.println("Total payable amount is "+ (amount-dis));
        }
        else if(unit>=11 && unit<=20){
            float dis = ((amount*10)/100);;
            System.out.println("The discount amount is "+dis);
            System.out.println("Total payable amount is "+ (amount-dis));
        }
        else if(unit>=21 && unit<=40){
            float dis = ((amount*10)/100);;
            System.out.println("The discount amount is "+dis);
            System.out.println("Total payable amount is "+ (amount-dis));
        }
        else if(unit==50){
            float dis = ((amount*10)/100);
            System.out.println("The discount amount is "+dis);
            System.out.println("Total payable amount is "+ (amount-dis));
        }
}
}

13) 
retailer 
customer 
retailer : 
1-15 peices =15% 
16-30 =30% 
31-50 =50% 

output : 
reailer name :asish kumar 
peicies : 30 
discount : 

customer  : 
1000 to 2000 -10% 
100-1000 -5% 
2000--3000 =15% 
3000< 30% 
sout("---------------------");
output : 
customer name : 
contact number : 
payment : 
discout : 
total payment 


import java.util.*;
public class C{
  public static void main(String[] args)
  {
    Scanner input=new Scanner (System.in);
    System.out.print("Enter retailer name : ");
    String name=input.nextLine();
    System.out.println("Enter peicies");
    int peicies=input.nextInt();
    
    if(peicies>=1&&peicies<=15)
    {
      float dis=(peicies*15)/100;
      System.out.println(dis);

    }
    else if(peicies>=16&&peicies<=30)
    {
      float dis=(peicies*30)/100;
      System.out.println(dis);
    }
    else if(peicies>=31&&peicies<=50)
    {
      float dis =(peicies*50)/100;
      System.out.println(dis);
    }

    System.out.println("_____________________________");
    input.nextLine();

    System.out.print("Enter customer  :");
    String customer=input.nextLine();
    System.out.println("Enter payment : ");
    int pay=input.nextInt();
    int payment;
    if(pay>=1000&&pay<=2000)
    {
       payment=(pay*10)/100;
       System.out.println("total discount :"+ payment);
       System.out.println("Total payment : "  +(pay-payment));

    }
    else if(pay>=100&&pay<1000)
    {
      payment=(pay*5)/100;
       System.out.println("total discount :"+ payment);
       System.out.println("Total payment : "  +(pay-payment));

    }
    else if(pay>=2000&&pay<=3000)
    {
      payment=(pay*15)/100;
       System.out.println("total discount :"+ payment);
       System.out.println("Total payment : "  +(pay-payment));

    }
    else if(pay<1000)
    {
      payment=(pay*30)/100;
       System.out.println("total discount :"+ payment);
       System.out.println("Total payment : "  +(pay-payment));

    }
    
  }
}


 


