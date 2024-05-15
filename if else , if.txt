Q1. voter id ;

import java.util.*;
public class A{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your age");
        int a=sc.nextInt();
        if(a<=18)
        {
            System.out.println("you are not abled");
        }
        else if(a>=18)
        {
            System.out.println("you are able for voting");
        }
        else 
        {
            System.out.println("Sorry");
        }
    }
}

Q2. one number maix a<10;

import java.util.*;
public class A{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the one number maix value a ");
        int a=sc.nextInt();
        if(a<10)
        {
            System.out.println("a is maix of 10");
        }
        else 
        {
            System.out.println("a value is not maix ");
        }
    }
}


Q3. two number maix ;

import java.util.*;
public class A{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the one number maix value a ");
        int a=sc.nextInt();
        System.out.println("Enter the secoind number of value :");
        int b=sc.nextInt();

        if(a<b)
        {
            System.out.println("a is maix of "+ a +"<"+b);
        }
        else 
        {
            System.out.println("a value is not maix ");
        }
    }
}


Q4.  three number max a b c 

import java.util.*;
public class A{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the one number maix value a ");
        int a=sc.nextInt();
        System.out.println("Enter the secoind number of value :");
        int b=sc.nextInt();
        System.out.println("Enter the threed number of vlaue : ");
        int c=sc.nextInt();

        if(a>b&&a>c)
        {
            System.out.println("a is maix of "+ a +"<"+b);
        }
        else if(b>a&&b>c)
        {
            System.out.println("b value is maix ");
        }
        else 
        {
            System.out.println("c is maix");
        }
    }
}

Q5 five number maix;

import java.util.*;
public class A{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the frist value of a :");

        int a=sc.nextInt();
        System.out.println("enter the secoinf number of value :");
        int b=sc.nextInt();
        System.out.println("Enter the threed number of value :");
        int c=sc.nextInt();
        System.out.println("Enter the forth number of value :");
        int d=sc.nextInt();
        System.out.println("Enter the fiveth nunmber of value :");
        int e=sc.nextInt();
        
        if(a>b&&a>c&&a>d&&a>e)
        {
            System.out.println("a is value of maix :" + a);
        }
        else if(b>a&&b>c&&b>d&&b>e)
        {
            System.out.println("b is maix all of number : "+b);
        }
        else if(c>a&&c>b&&c>d&&c>e)
        {
            System.out.println("c is maix :" +c);
        }
        else if(d>a&&d>b&&d>c&&d>e)
        {
            System.out.println("d is maix :" +d);
        }
        else 
        {
            System.out.println("e is maix all of number " +e);
        }
    }
}

Q6.
   6) user 
-9 negative integer 
5 positive integer 
0 =zero 

import java.util.*;
public class A{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the interger typer value :");
        int a=sc.nextInt();
        int neg=sc.nextInt();
    
        if(a<=-0)
        {
            System.out.println("negtive number :"+a);
        }
        else if(a>=0)
        {
            System.out.println("positive number :" +a );
        }
        else if(a==0)
        {
            System.out.println("zero bro :"+a);
        }
        else
        {
            System.out.println("number :");
        }
    }
}

Q7.
 vowel and consonat 
->a e i o u vowel 
consonant 

import java.util.*;
public class A{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the vowal and consonant ");
        char a=sc.next().charAt(0);
        if(a=='a'||a=='A'||a=='e'||a=='i'||a=='o'||a=='u')
        {
            System.out.println("this character is vowal = "+a);
        }
        else 
        {
            System.out.println("this is consonant = "+a);
        }
    }
}


Q8 divisible 5 and 11 
	a)num dono se divide ho jb process ho 
	b)num kisi se bhi divide ho jb process ho 


import java.util.*;
public class A{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the number of divide 5 or 11");
        int a=sc.nextInt();
        if(a%5==0||a%11==0)
        {
            System.out.println("this number is divide of 5 or 11 = " + a);
        }
        else 
        {
            System.out.println("this number is not divide for 5 or 11 = "+a);
        }
    }
}

Q9. uper case and lower case input by user 
A k

import java.util.*;
public class A{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the any character :");
        char a=sc.next().charAt(0);
        char b;
        if(a>='A'&&a<='z')
        {
            b=Character.toLowerCase(a);
            System.out.println("lower Case " +b);
        }
        else 
        {
            b=Character.toUpperCase(a);
            System.out.println(b);
        }
    }
}

Q10 if the inpute is the integer then check ,check number 7 or 3 k multiple se divisible hey kya 

import java.util.*;
public class A{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the any int type value ");
        int value=sc.nextInt();
        if (value%7==0||value%3==0)
        {
            System.out.println(value + ":Your input value is divisibal for 7 and 3 number" );
        }
        else 
        {
            System.out.println("not divisibal ");
        }
    }
}

Q11. number swap 

import java.util.*;
public class A{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the value of a");
        int a=sc.nextInt();
        System.out.println("Enter the value of b");
        int b=sc.nextInt();

        System.out.println("The swap number ");
        System.out.println("real value of a:"+a);
        System.out.println("real value of b"+b);
        a=(a+b);
        b=(a-b);
        a=(a-b);
        System.out.println("swap value is a :" + a);
        System.out.println("swap value b is :"+b);
    }
}

with varibale ;

import java.util.*;
public class A{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the value of a");
        int a=sc.nextInt();
        System.out.println("Enter the value of b");
        int b=sc.nextInt();
        int c;

        System.out.println("The swap number ");
        System.out.println("real value of a:"+a);
        System.out.println("real value of b"+b);
        c=a;
        a=b;
        b=c;
        System.out.println("swap value is a :" + a);
        System.out.println("swap value b is :"+b);
    }
}

Q.12 m =you are 
f = female 
other 

import java.util.*;
public class A{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your gender frist latter :");
        char a=sc.next().charAt(0);
        if(a=='m')
        {
            System.out.println("your are male");
        }
        else if(a=='f')
        {
            System.out.println("your are female");
        }
        else {
            System.out.println("You are other gernation");
        }
    }
}

13) 
number 
1 =>sunday 
2 =>monday 
3 =>tuesday 


import java.util.*;
public class A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the week number :");
        int a=sc.nextInt();
        if(a==1)
        {
            
            System.out.println("sunday");
        }
        else if (a==2)
        {
            
            System.out.println("monday");
        }
        else if (a==3)
        {
            
            System.out.println("tuesday");
        }
        else if (a==4)
        {
            
            System.out.println("wednesday");
        }
        else if(a==5)
        {
            
            System.out.println("thrusday");
        }
        else if(a==6)
        {
            
            System.out.println("friday");
        }
        else if (a==7)
        {
            
            System.out.println("saturday");
        }
        else {
        
        System.out.println    ("not match");
        }
    }
}

Q.14 user number 
check number :even odd 

import java.util.*;
public class A{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number for check odd of even number :");
        int a=sc.nextInt();
        if(a%2==0)
        {
            System.out.println("this number is odd :"+a);
        } 
        else if(a%2!=0){
            System.out.println("this number is even :"+a);
        }
        else
        {
            System.out.println("sorry not match");
        }
    }
}

Q.15
char match 
a =>apple 
b :ball 
c :cat 
not match


import java.util.*;
public class A{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the character for :");
        char a=sc.next().charAt(0);
        if(a=='a')
        {
            System.out.println("apple");
        }
        else if(a=='b')
        {
            System.out.println("boy");
        }
        else if(a=='c')
        {
            System.out.println("cat");
        }
        else 
        {
            System.out.println("not match");
        }
    }

}


Q16. month number name if else conditions;


import java.util.*;
public class A{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the month number :");
        int a=sc.nextInt();
        if(a==1)
        {
            System.out.println("january");
        }
        else if (a==2)
        {
            System.out.println("february");
        }
        else if (a==3)
        {
            System.out.println("march");
        }
        else if (a==4)
        {
            System.out.println("april");
        }
        else if (a==5)
        {
            System.out.println("may");
        }
        else if (a==6)
        {
            System.out.println("jun");
        }
        else if (a==7)
        {
            System.out.println("july");
        }
        else if (a==8)
        {
            System.out.println("august");
        }
        else if (a==9)
        {
            System.out.println("september");
        }
        else if (a==10)
        {
            System.out.println("october");
        }
        else if (a==11)
        {
            System.out.println("november");
        }
        else if (a==12)
         {
             System.out.println("december");
         }
         else
         {
          System.out.println("not match");
          }

    }
}
