while : 
reverse number 
657
756 

public class Main
 {
     public static void main(String[] args){
    System.out.println("this program is show revers number ");
    System.out.print("this numebr is :");
    int num=657;
    int rem,sum;
    sum=0;
    rem=0;
    while(num>=3)
    {
        sum=num%10;
        rem=rem*10+sum;
        num=num/10;
    }
    System.out.println(rem);
    
}
}

Q2. pallindrome number 
12321 


public class Main
 {
    public static void main(String[] args) {
        int number = 12321;
        int reversedNumber = 0;
        int originalNumber = number;

        while (number != 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }

        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome number.");
        } else {
            System.out.println(originalNumber + " is not a palindrome number.");
        }
    }
}

armstrong number 
153 

public class Main
 {
    public static void main(String[] args) {
       int num=123;
       int rem,sum;
       rem=0;sum=0;
       while(num>=3)
       {
           rem=num%10;
           sum=sum+rem*rem*rem;
           num=num/10;
           
       }
       System.out.println(sum);
    }
}

neon number 
9 ka square 
81 => 8+1=(9)


import java.util.*;
public class E{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of prime number ");
        int pri=sc.nextInt();
        int value = pri*pri;
        int ram;
        int sum=0;
        while(value>0)
        {
           ram=value%10;
           sum=sum+ram;
           value=value/10;
        }
        if(sum==pri){
        System.out.println("this number is prime number " + sum +" ");
        }
        else 
        {
            System.out.println("This numbe ris not prime number ");
        }

    }
}





factorial 
5 
1*2*3*4*5


import java.util.Scanner;

public class E{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int i=1;
        int fact = 1;
        while(i<=num){
            fact *= i;
            i++;
        }
        System.out.println("This is the factorial "+fact);
    }
}



fibonacci series 
0 1 1 2 3 5 


import java.util.*;
public class E{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the start number :");
        int a=sc.nextInt();
        System.out.println("Enter the last number :");
        int b=sc.nextInt();
        int f=0;
        int s=1;
        int fe;
        System.out.print(f+" ");
        System.out.print(s+" ");
        while(a<=b)
        {
           fe=f+s;
           System.out.print(fe+" "); 
           f=s;
           s=fe;
           a++;
          
        }
        // System.out.println(fe);
    
    }
}

use input :6743 =>4 digit 

import java.util.*;
public class E{
    public static void main(String[] args)
    {   
        Scanner input=new Scanner (System.in);
        int a=input.nextInt();
        int count=0;
        while(a>0)
        {    
            a=a/10;
            count++;
        }
        
        System.out.println(count);
    }
}

user : 342 => 354 

import java.util.*;
public class E
 {
     public static void main(String[] args){
        Scanner input=new Scanner (System.in);
    System.out.println("this program is show revers number ");
    System.out.print("this numebr is :");
    int num=input.nextInt();
    int sum=0;
    int rem;
    while(num>0)
    {
        rem = num%10;
        sum = sum*10+rem+1;
        num=num/10;
    }
    int sum1=0;
     while(sum>0)
    {
        rem=sum%10;
        sum1=sum1*10+rem;
        sum=sum/10;
    }
    System.out.println(sum1);
}
}

user: 342 =>453 








import java.util.*;
public class E
 {
     public static void main(String[] args){
        Scanner input=new Scanner (System.in);
    System.out.println("this program is show revers number ");
    System.out.print("this numebr is :");
    int num=input.nextInt();
    int sum=0;
    int rem;
    while(num>0)
    {
        rem = num%10;
        sum = sum*10+rem+1;
        num=num/10;
    }
   
    System.out.println(sum);
}
}

even number 
type1 : 1-->100 
type2 : 1--->100 even number ka sum 
type3 : random value 34--->89 =>even number 
type4 : randome value k sabi ka sum aa jaye 

odd number 
type1: 1-->100 odd numbers 
type2: 1--100 odd number ka sum 
type3 : random value 34--->89 =>odd number 
type4 : randome value k sabi ka sum aa jaye 



import java.util.*;
public class E{
public static void main(String[]args)
{
    Scanner input=new Scanner (System.in);
    System.out.println("Enter even or odd :");
    String s=input.nextLine();
    if(s.equals("even"))
    {
        System.out.println("Enter the character :");
        String a=input.nextLine();
        if(a.equals("type1")){
            int b=1;
            while(b<=100)
            {
                System.out.print(b+" ");
                b++;
            }
            
        }
        else if(a.equals("type2")){
            int b=100;
            while(b>=100)
            {
                System.out.print(b+" ");
                b--;
            }

        }
    else if(a.equals("type3")){
            int b=input.nextInt();
            int d=input.nextInt();
            while(b<=d)
            {
                if(b%2==0)
            {
                System.out.print(b+" even number ");
            }
                b++;
            }

        }
        else if(a.equals("type4"))
        {
            // Scanner input=new Scanner (System.in);
            int num=input.nextInt();
        int sum=0;
        int rem;
        while(num>0)
        {
            rem=num%10;
            sum =sum+ rem;
            num=num/10;
        }
        System.out.println(sum);
        }
    }
    if(s.equals("odd"))
    {
        System.out.println("Enter the character :");
        String a=input.nextLine();
        if(a.equals("type1")){
            int b=1;
            while(b<=100)
            {
                if(b%2!=0)
                {
                System.out.print(b+" ");
                }
                b++;
            }
            
        }
        else if(a.equals("type2")){
            int b=100;
            while(b>=100)
            {
                System.out.print(b+" ");
                b--;
            }

        }
    
        else if(a.equals("type4"))
        {
            // Scanner input=new Scanner (System.in);
            int num=input.nextInt();
        int sum=0;
        int rem;
        while(num>0)
        {
            rem=num%10;
            sum =sum+ rem;
            num=num/10;
        }
        if(sum%2!=0){
        System.out.println(sum);
        }
    }

    else if(a.equals("type4"))
    {
        
                
                System.out.println("Enter the number of frist ");
                int q=input.nextInt();
                
                System.out.println("Enter the number of last");
                int b=input.nextInt();
                
                int sum=0;
                int rem;
                
                while(q<b)
                {
                    if(q%2==0){
                        rem=q%10;
                        sum=sum+rem;
                    }
                    q++;
                }
                System.out.println(sum);
            

    }
} 
}
}

perfect number : 
6 
1 2 3 
1 + 2 + 3 => 6 

8 
2 2 2 =>6 not perfect number 

import java.util.*;
public class Main{
    public static void main(String [] args)
    {
             Scanner input=new Scanner (System.in);
             System.out.println("Enter the number :");
             int num=input.nextInt();
             int sum=0;
             int tem=num;
             for(int i=1;i<=10;i++)
             {
                if(num%i==0)
                {
                    if(num!=i)
                    {
                        sum=sum+i;
                    }
                }
             }
             if(tem==sum){
                System.out.println("this number is perfect number :"+num);
             }
             else {
                System.out.println("This number is not perfect number :");
             }
    }
}


neon number : 

9 =>81 
8+1 =>9 

9 is neon number



public class Main{
    public static void main(String[] args)
    {
        int a=9;
        int value=a*a;
        int rem=0;
        int su=0;
       // System.out.println(rem);
        while(value>0)
        {
            rem=value%10;
            su=su+rem;
            value=value/10;
            System.out.print(su+" +"+value+"=");
            
            
        }
        System.out.println(su);
    }
}