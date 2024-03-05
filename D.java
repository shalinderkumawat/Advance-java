while loop: 
1)1---->100 

public class D {
    public static void main(String[] args)
    {
        int a=1;
        while(a<=100)
        {
            System.out.print(a +" ");
            a++;
        }
    }
    
}

2)100--->1 

public class D {
    public static void main(String[] args)
    {
        int a=100;
        while(a>=1)
        {
            System.out.print(a +" ");
            a--;
        }
    }
    
}


3)1---->100 even numbers print 
-----------------------------------------
public class D {
    public static void main(String[] args)
    {
        int a=1;
        while(a<=100)
        {
            if(a%2==0){
            System.out.print(a +" ");
            
            }a++;
        }
    }
    
}

4) 100--->1 even number

public class D {
    public static void main(String[] args)
    {
        int a=100;
        while(a>=1)
        {
            if(a%2==0){
            System.out.print(a +" ");
            
            }a--;
        }
    }
    
}

5)1---->100 odd numbers 

public class D {
    public static void main(String[] args)
    {
        int a=100;
        while(a>=1)
        {
            if(a%2==1){
            System.out.print(a +" is odd number ");
            
            }a--;
        }
    }
    
}

6)50---->500 number print 

import java.util.*;

import javax.sound.midi.Soundbank;

public class D {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter start point ");
        int a=input.nextInt();
        System.out.println("Enter end point ");
        int b=input.nextInt();
    
        while(a<=b)
        {
            
            System.out.print(a+" ");
            
            a++;
        }
    }
    
}

7)500--->50 number print 

import java.util.*;

import javax.sound.midi.Soundbank;

public class D {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter start point ");
        int a=input.nextInt();
        System.out.println("Enter end point ");
        int b=input.nextInt();
    
        while(a>=b)
        {
            
            System.out.print(a+" ");
            
            a--;
        }
    }
    
}

8)50--->1000 even number
import java.util.*;

import javax.sound.midi.Soundbank;

public class D {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter start point ");
        int a=input.nextInt();
        System.out.println("Enter end point ");
        int b=input.nextInt();
    
        while(a<=b)
        {
            if(a%2==0)
            {
            System.out.print(a+" ");
            
            
            }a++;
        }
    }
    
}

9)user input 
34-----67

import java.util.*;

import javax.sound.midi.Soundbank;

public class D {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter start point ");
        int a=input.nextInt();
        System.out.println("Enter end point ");
        int b=input.nextInt();
    
        while(a<=b)
        {
            
            System.out.print(a+" ");
            
            
            }a++;
        
    }
    
}

10) random two 34-->67
even number 

import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter frist number :");
        int a=input.nextInt();
        System.out.println("Enter end point :");
        int b=input.nextInt();
        while(a>=b)
        {
            if(a%2==0){
            System.out.println(a);
            
            }a--;
        }
    }
}


11) random two 34-->67
oddd number 

import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter frist number :");
        int a=input.nextInt();
        System.out.println("Enter end point :");
        int b=input.nextInt();
        while(a>=b)
        {
            if(a%2==1){
            System.out.println(a);
            
            }a--;
        }
    }
}

12)1--->10 sum (addition)

public class Main {

        public static void main(String[] args)
        {
            int a=1;
            int sum=0;
            while(a<=10)
            {
                sum=sum+a;
                a++;
                 
            }
           System.out.println(sum);
        }
    }
    

13)2 table print 

public class Main{
    public static void main(String[] args)
    {
        int a=1;
        while(a<=10)
        {
            System.out.println((a*2));
            a++;
        }
    }
}

14)user input table 

import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the table number :");
        int ta=input.nextInt();
        int a=1;
        while(a<=10)
        {
            System.out.println((a*ta));
            a++;
        }
    }
}


15)2 3 4 5 6 7 8 9 10 table print (nested for)
type2: 
5 ----9 table 

public class Main
{
    public static void main(String[] args)
    {
        int a=2;
        while(a<=10)
        {
            for(int table=1;table<=10;table++)
            {
                System.out.print(" "+ (a*table));
            }
            a++;
            System.out.println("");
        }
    }
}

16)1-->100 (7 and 3 k multiple se divisible ho)

public class Main {

        public static void main(String[] args)
        {
            int a=1;
            int sum=0;
            while(a<=100)
            {
                if(a%7==0||a%3==0)
                
                {
                System.out.println(a);
                }
                a++;
            }
           
        }
    }
    

17) divide number both 5 and 11 (1---->100)

public class Main {

        public static void main(String[] args)
        {
            int a=1;
            int sum=0;
            while(a<=100)
            {
                if(a%5==0||a%11==0)
                
                {
                System.out.println(a);
                }
                a++;
            }
           
        }
    }
    


--------------------------------------------------------
18)100----1 (5 or 11) 

public class Main {

        public static void main(String[] args)
        {
            int a=100;
    
            while(a>=1)
            {
                if(a%5==0||a%11==0)
                
                {
                System.out.println(a);
                }
                a--;
            }
           
        }
    }
    



19)2 table oppsite print 

 public class Main {

        public static void main(String[] args)
        {
            int a=10;
    
            while(a>=1)
            {
                
                
                
                System.out.println(a+"*" +a+"="+(a*2));
                
                a--;
            }
           
        }
    }
    

    

20)100--->1 (n or m k multiple se divisible ho) 


 	import java.util.*;
public class Main {

        public static void main(String[] args)
        {
            Scanner input=new Scanner(System.in);
            int a=100;
            System.out.println("Enter the n number");
            int n=input.nextInt();
            System.out.println("Enter the m number ");
            int m=input.nextInt();
            
    
            while(a>=1)
            {
                
                if(a%n==0||a%m==0)
                {
                    System.out.println(a);
                }
                a--;
            }
           
        }
    }
    

    
21) 
constant : 
2 X 1 =2 

user input : 
9 X 1 = 9 


import java.util.*;
public class Main
{
    public static void main(String[]args)
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the table number :");
       // int a=input.nextInt();
        int a=2;
        while(a<=10)
        {
            System.out.println(a+"*"+a+"="+(a*2));
            a++;
        }
    }
}

import java.util.*;
public class Main
{
    public static void main(String[]args)
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the table number :");
       int a=input.nextInt();
       int f=2;

        while(f<=10)
        {
            for(int n=1;n<=10;n++)
            {
            System.out.println(a+"*"+a+"="+(a*n));
            }
            f++;
        }
    }
}

23)
1---->100 even number ka sum

public class Main
{
    public static void main(String [] args)
    {
        int a=1;
        int sum=0;
        while(a<=100)
        {
            if(a%2==0)
            {
            
            sum=sum+a;
           // System.out.println(a);
            }
            a++;
            System.out.println(sum);
        }
    }
}

23)
1---->100 odd number ka sum

public class Main
{
    public static void main(String [] args)
    {
        int a=1;
        int sum=0;
        while(a<=100)
        {
            if(a%2!=0)
            {
            
            sum=sum+a;
           // System.out.println(a);
            }
            a++;
            System.out.println(sum);
        }
    }
}