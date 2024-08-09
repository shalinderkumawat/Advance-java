import java.util.ArrayList;

public class Arraylist {
    
    public static void main(String [] args)
    {
        
        ArrayList<Integer> sc=new ArrayList<>();
        for(int i=1;i<=5;i++)
        {
            sc.add(i);
        }
        int size=sc.size();
        int fact=1;
        for(int i=1;i<=size-1;i++)
        {
            fact=fact*sc.get(i);
            System.out.println(sc.get(i)+" fact "+"i"+"="+fact);
        }
        
    }
}

//  This is even number in Arraylist

public class Arraylist{
    public static void main(String [] args)
    {
        ArrayList<Integer> sc=new ArrayList<>();
        for(int i=1;i<=5;i++)
        {
            sc.add(i);
        }
        for(int i=0;i<sc.size();i++)
        {
            if(sc.get(i)%2==0)
            {
                System.out.println("This is even number : "+sc.get(i));
            }
        }
    }
}

// This is odd number in Arraylist

public class Arraylist{
    public static void main(String [] args)
    {
        ArrayList<Integer> sc=new ArrayList<>();
        for(int i=1;i<=5;i++)
        {
            sc.add(i);
        }
        for(int i=0;i<sc.size();i++)
        {
            if(sc.get(i)%2!=0)
            {
                System.out.println("This is odd number : "+sc.get(i));
            }
        }
    }
}

// Inside Arraylist armstrong Number

import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static void main(String [] args)
    {
        ArrayList<Integer> sc=new ArrayList<>();
        
        Scanner s=new Scanner(System.in);
        int length=s.nextInt();
        for(int i=0;i<length;i++)
        {
            System.out.println("Enter the value of : "+ i);
            sc.add(s.nextInt());
        }
        int sum=0;
        int rem=0;
       
        for(int i=0;i<sc.size();i++)
        {
            int num=sc.get(i);
            int n=num;
        
        while (num!=0) {
            rem=num%10;
            sum=sum+rem*rem*rem;
            num=num/10;            
        }
        if(sum==n)
        {
            System.out.println("This is armstong number");
            System.out.println(sum);
        }
        else 
        {
            System.out.println("This number is not armstong ");
            System.out.println(sum);

        }
    }
    }
}

// palindrom number in Arraylist 

import java.util.ArrayList;
import java.util.Scanner;
public class Arraylist{
    public static void main(String [] args)
    {
        Scanner input=new Scanner(System.in);
        ArrayList<Integer> sc=new ArrayList<>();
       
        for(int i=0;i<=4;i++)
        {
            sc.add(input.nextInt());
        }
        for(int i=0;i<sc.size();i++)
        {
            int sum=0;
            int rem=0;
            int num=sc.get(i);
            int n=num;
            while (num!=0)
            {
                rem=num%10;
                sum=sum*10+rem;
                num=num/10;
            }
            if(sum==n)
            {
                System.out.println("This number is palindrome number : "+ sum);
            }
            else
            {
                System.out.println("This number is not palindrome number : "+ sum);

            }
        }
    }
}