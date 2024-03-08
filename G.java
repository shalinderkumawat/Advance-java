for loop basic questions : 
1)Write a program to print numbers from 1 to 10.
2)Write a program to calculate the sum of first 10 natural number.
3)Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number. 

1)Write a program to print numbers from 1 to 10.
public class G {
    public static void main(String[]args)
    {
        System.out.println("This prpogramm show for loop 1 to 10 number :");
        for (int a=1;a<=10;a++)
        {
            System.out.println(a);
        }
    }
}

2)Write a program to calculate the sum of first 10 natural number.

public class G {
    public static void main(String[]args)
    {
        System.out.println("This prpogramm show for loop 1 to 10 number :");
        int ab=0;
        for (int a=1;a<=10;a++)
        {
             ab=a+ab;
        }
        System.out.println(ab);
    }
}

3)Write a program that prompts the user to input a positive integer. 
It should then print the multiplication table of that number. 

import java.util.*;
public class G{
    public static void main(String[] args){
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the number of multiplication ");
        int num=input.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(num+"*"+i+"="+(num*i));
        }
    }
}

4)Write a program to find the factorial value of any number entered through the keyboard.


import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the number of multiplication ");
        int num=input.nextInt();
        int fact=0;
        for(int i=1;i<=num;i++)
        {
           fact=num*i;
        }
        System.out.println(fact);
    }
}

5)1--->100 number print 

import java.util.*;
public class G{
    public static void main(String[] args){
        
        
        for(int i=1;i<=100;i++)
        {
           System.out.print(i+" ");
        }
    }
}

6)100--->1 number print

import java.util.*;
public class G{
    public static void main(String[] args){
        
        
        for(int i=100;i>=1;i--)
        {
           System.out.print(i+" ");
        }
    }
} 

7)1--->100 even number print sum

import java.util.*;
public class G{
    public static void main(String[] args){
        
        
        for(int i=1;i<=100;i++)
        {
            if(i%2==0){
           System.out.print(i+" ");
            }
        }
    }
}

8)100---->1odd number print sum

import java.util.*;
public class G{
    public static void main(String[] args){
        
        
        for(int i=100;i>=1;i--)
        {
           if(i%2!=0)
           {
           System.out.print(i+" ");
            }
        }

    }
} 


9)50--->1000 even number sum

import java.util.*;
public class G{
    public static void main(String[] args){
        
        
        for(int i=50;i<=1000;i++)
        {
            if(i%2==0){
           System.out.print(i+" ");
            }
        }
    }
}

10)1000--->500 odd numbers sum


import java.util.*;
public class G{
    public static void main(String[] args){
        
        
        for(int i=1000;i>=50;i--)
        {
           if(i%2!=0)
           {
           System.out.print(i+" ");
            }
        }

    }
} 

-------------------------------------

average level: 
1)table 2 to 10 

import java.util.*;
public class G{
    public static void main(String[] args){
    for(int t=2;t<=10;t++){
        
        for(int i=1;i<=10;i++)
        {
          System.out.println(t+"*"+i+"="+(t*i));  
        }
    }
}
}

2)table print between range from user input 

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the number for start :");
        int t=input.nextInt();
        System.out.println("Enter the last number of table:");
        int l=input.nextInt();
    for(;t<=l;t++){
        
        for(int i=1;i<=10;i++)
        {
          System.out.println(t+"*"+i+"="+(t*i));  
        }
    }
}
}

3)1-->100 those type of numbers print (divisible by the multiple of any two numbers from user input ) 


4)1--->100 print numbers id divisible by 11and 5 both 

public class Main
{
    public static void main(String[]args){
        for(int a=1;a<=100;a++)
        {
            if(a%11==0||a%5==0){
                System.out.println(a);
            }
        }
    }
}


5)print 2 table opposite 

public class Main
{
    public static void main(String[] args)
    {
        for(int a=2;a==2;a++)
        {
            
            for(int t=10;t>=2;t--)
            {
                System.out.println(a+"*"+t+"="+(a*t));
            }
        }
    }
}

6)print 2 table : 
like this format : 
2 X 1 =2 
2 X 2 =4 

public class Main
{
    public static void main(String[] args)
    {
        for(int a=2;a==2;a++)
        {
            
            for(int t=2;t<=10;t++)
            {
                System.out.println(a+"*"+t+"="+(a*t));
            }
        }
    }
}


7)write and make a program user input armstrong = then check number is armstrong and not , 
when user input pallindrome =check number is pallindrome or not , 
when user input reverse then check number is reverse or not (through user input )
 (use if else if else and while loop and for loop only ) 


import java.util.*;
public class G{
    public static void main(String[] args)
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the string ");
        String a=input.nextLine();
        if(a.equals(("armstrong")))
        {
            int num=input.nextInt();
            int rem,sum=0;
            int temp=num;
            while(num>0)
            {
                rem=num%10;
                sum=sum+rem*rem*rem;
                num=num/10;
            }
            if(sum==temp)
            {
                System.out.println("this number is armstrong :" +sum);
            }
            else{
                System.out.println("this number is not armstrong :" +sum);

            }
        }
        else if(a.equals("pallindrom"))
        {
            System.out.println("enter the pallidrom number ");
            int nu=input.nextInt();
            int re,su=0;
            int te=nu;
            while(nu>0)
            {
                re=nu%10;
                su=su*10+re;
                nu=nu/10;
            }
            if(su==te)
            {
                System.out.println(" this numbe is pallindrom number ;"+su);
            }
            else 
            {
                System.out.println("This number is not pallindrom number");
            }
        }
        else if(a.equals("revers"))
        {
           int n=input.nextInt();
           int r,s=0;
           while (n>0)
           {
            r=n%10;
            s=s*10+r;
            n=n/10;
           } 
           System.out.println(s);
        }
    }
}


8) write and make a program user input any number and user input like factorial then calculate a
 factorial of code and user input a string like reverse then calculate a reverse number only.


import java.util.*;
public class G{
    public static void main(String[] args)
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the factorial and string :");
        String a=input.nextLine();
        if(a.equals("factorial"))
        {
            System.out.println("Enter the number :");
            int num=input.nextInt();
            int factorial=1;
            for(int i=1;i<=num;i++)
            {
                factorial=factorial*i;
            }
            System.out.println("the sum is : " + factorial);
        }
        else if(a.equals("revers"))
        {
            System.out.println("Enter the number of revers");
            int nu=input.nextInt();
            int rem,su=0;
                 
            while(nu>0)
            {
                rem=nu%10;
                su=su*10+rem;
                nu=nu/10;
            }
            System.out.println(su);
        }
    }
}

9)write and make a program user give two string like even and odd even 
denoted even number and odd denoted odd number when user input odd then input a 
range and calculate even and odd number in java ?(use if else if and for loop)  

import java.util.*;
public class G{
    public static void main(String [] args)
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the even and odd");
        String a=input.nextLine();
        if(a.equals("odd"))
        {
            System.out.println("Enter the odd number starting number  :");
            int s=input.nextInt();
            System.out.println("Enter the ending number :");
            int end=input.nextInt();
            for(int q=s;q<=end;q++)
            {
                if(q%2==1)
                {
                    System.out.print(" "+q);
                }
            }

        }
        if(a.equals("even"))
        {
            System.out.println("Enter the odd number starting number  :");
            int w=input.nextInt();
            System.out.println("Enter the ending number :");
            int en=input.nextInt();
            for(int r=w;r<=en;r++)
            {
                if(r%2==0)
                {
                    System.out.print(" "+r);
                }
            }

        }
    }
}




import java.util.*;

public class G {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the neon ,perfect, :");
        String na = input.nextLine();
        if (na.equals("neon")) {
            int a = input.nextInt();
            int value = a * a;

            int rem = 0;
            int sum = 0;

            while (value > 0) {
                rem = value % 10;
                sum = sum + rem;
                value = value / 10;
            }
            if (sum == a) {
                System.out.println("This number is neon number :" + sum);
            } else {
                System.out.println("This number is not neon number :");
            }
        } else if (na.equals("perfect")) {
        System.out.println("Enter the number :");
        int num=input.nextInt();
        int sum=0;
        int temp=num;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0 && i!=num)
            {
             
             sum=sum+i;
             
            }
        }
        if(sum==temp)
        {
            System.out.println("This number is perfacet number ");
        }
        else 
        {
            System.out.println("This number is not perfacet number ");
        }
        }

        else if(na.equals("prime"))
        {
            System.out.println("Enter the number ");
            int num=input.nextInt();
        int count=0;
        int temp=num;
            for (int i=1;i<=num;i++)
            {
                if(num%i==0)
                {
                    
                   count++;
                }
                
                
            }
           if(count==temp)
           {
               System.out.println("this number is prime number :");
           }
           else 
           {
               System.out.println("This number is not prime number");
           }
        }
        else if(na.equals("perime "))
        {
            System.out.println("enter the character like string number");
            for(int a=1;a<=100;a++)
            {
              
                if(a%nu==0){
                      System.out.println(a+"=b"+"="this number is System.out.println(ne and num relus);
            }
        }
    }
}



