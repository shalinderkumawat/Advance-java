switch paractice questions : 
************************************
user input 
constant 
************************************
1)write a program to read a week day number and print weekday name using switch 
eg 1 =>sunday 
1 sunday 

public class I {
    public static void main(String []args)
    {
        int dayname=1;
        
        switch(dayname)
        {
            case 1: {
                System.out.println("sunday");
                break;
            }
            
            case 2: {
                System.out.println("monday");
            }
            break;
            case 3: {
                System.out.println("tuesday");
            }
            break;
            case 4: {
                System.out.println("wednesday");
            }
            break;
            case 5: {
                System.out.println("thursday");
            }
            break;
            case 6: {
                System.out.println("friday");
            }
            break;
            case 7: {
                System.out.println("saturday");
            }
            break;
            default:{
                    System.out.println("day number is not match");
            }
        }
        
    }
}

2) 
write a program to read gender (M/F) and print the corresponding gender using a switch statement 

public class I {
    public static void main(String []args)
    {
        char a='m';
        
        switch(a)
        {
            case 'm': {
                System.out.println("male");
                break;
            }
            
            case 'f': {
                System.out.println("female");
            }
           
           
            default:{
                    System.out.println("not match");
            }
        }
        
    }
}

3)
write a program to check whether the number is even or odd 
type1: 1 even number 
2 :odd number 

type2: e =>even number 
o=>odd number 

import java.util.*;
public class I{
    public static void main(String[] args)
    {
        Scanner input=new Scanner (System.in);
        int a=input.nextInt();
        switch (a) {
            case 1:{
                 for (int b=1;b<=10;b++)
                 {
                    if(b%2==0)
                    {
                        System.out.println("This number is even number :"+b);
                    }
                 }
            }
                break;
            case 2:{
                 for (int b=1;b<=10;b++)
                 {
                    if(b%2==1)
                    {
                        System.out.println("This number is odd number :"+b);
                    }
                 }
            }
                break;
        
            default:
                break;
        }


    }
}

4) 
write a program to create a simple calculator 
a b + 
a+b 

public class I{
    public static void main(String[] args)
    {
        char a='+';
       
        switch (a) {
            case '+':
                 {
                    int s=2;
                    int b=3;
                    System.out.println("+"+(s+b));
                 }
                
                break;
        
            default:
            {
                System.out.println("not match ");
            }
                break;
        }
    }
}


5) 
write a program to check whether a person is eligible or not for vote

import java.util.*;
public class I{
    public static void main(String [] args)
    {
        System.out.println("Enter 1");
        Scanner input=new Scanner (System.in);
        int ag=input.nextInt();
       
        switch (ag) {

            case 1:
            System.out.println("Enter your age");
            int age=input.nextInt();
                 if(age<=18)
        {
            System.out.println("not valide ");
        }
        else{
            System.out.println("valide");
        }
                break;
        
            default:
                break;
        }
    
}
} 



6)
write a program to check month ? 
12 month 

import java.util.*;
public class I{
    public static void main(String[] args)
    {
        Scanner inputdo=new Scanner (System.in);
        System.out.println("Enter the month number : ");
        int month=inputdo.nextInt();
        String name;
        switch(month)
        {
            case 1:
                name="january";
                break;
            case 2: name="february";
            break;
            case 3: name="march";
            break;
            case 4: name="april";
            break;
            case 5: name="may";
            break;
            case 6: name="june";
            break;
            case 7: name="july";
            break;
            case 8: name="august";
            break;
            case 9: name="september";
            break;
            case 10: name="october";
            break;
            case 11: name="november";
            break;
            case 12: name="december";
            break;
            default : name="month number are not match";
            break;
        }
        System.out.print ("MONTH IS ::  " + name);
    }
}





7)
a p e o f r l 
a=armstrong number 
p =prime number 
e =even 
o =odd 
f =factorial 
r =reverse 
l =fibonacci 
t =perfect number 
n =neon number 
w =leap year 
s =swap one way 
v =vowel and consonant 


import java.util.*;

public class I {
    public static void main(String[] args) {
        Scanner inputdo = new Scanner(System.in);
        System.out.println("a p e o f r l  : ");
        char a = inputdo.next().charAt(0);

        switch (a) {
            case 'a': {
                System.out.println("This character is show armstrong number :");

                System.out.print("Enter the number :");
                int num = inputdo.nextInt();
                int rem, sum = 0;
                int temp = num;

                while (num > 0) {
                    rem = num % 10;
                    sum = sum * 10 + rem;
                    num = num / 10;

                }
                if (temp == sum) {
                    System.out.println(sum);
                } else {
                    System.out.println("This number is not armstorng number :");
                }
            }

                break;

            case 'p': {
                int num = inputdo.nextInt();

                int count = 0;
                int temp = num;

                for (int ab = 1; ab <= num; ab++) {
                    if (num % ab == 0) {
                        count++;
                    }
                }
                if (count == temp) {
                    System.out.println("This number is prime number :" + num);
                } else {
                    System.out.println("This number is not prime number :");
                }
            }
                break;

            case 'e': {
                System.out.println("This is show even number :");
                System.out.println("Enter the number ");
                int even = inputdo.nextInt();
                if (even % 2 == 0) {
                    System.out.println("This number is even number :" + even);
                } else {
                    System.out.println("This number is not even number ");
                }
            }
                break;
            case 'o': {
                System.out.println("This number is show odd number :");
                System.out.println("Enter the number :");
                int odd = inputdo.nextInt();
                if (odd % 2 != 0) {
                    System.out.println("This numebr is odd number :" + odd);
                } else {
                    System.out.println("This number is not odd number :");
                }
            }

                break;

            case 'f': {
                System.out.println("This is factorial");
                System.out.println("Enter the number :");
                int factorial = inputdo.nextInt();
                int re, su = 0;

                while (factorial > 0) {
                    re = factorial % 10;
                    su = su + re * re * re;
                    factorial = factorial / 10;
                }
                System.out.println(su);
            }
                break;

            case 'r': {
                System.out.println("revers number ");
                System.out.println("Enter the number :");
                int revers = inputdo.nextInt();
                int rem, sum = 0;

                while (revers > 0) {
                    rem = revers % 10;
                    sum = sum * 10 + rem;
                    revers = revers / 10;
                }
                System.out.println(sum);
            }
                break;

            case 'l': {
                int num = inputdo.nextInt();
                int f = 0;
                int s = 1;
                int sum = 0;

                for (int i = 1; i <= num; i++) {
                    sum = f + s;
                    f = s;
                    s = sum;
                    System.out.print("   " + sum);
                }
            }
            break;

            case 't':
            {
                System.out.println("this is show peerfect number ");
                int perfect=inputdo.nextInt();
                int sum=0;
                int temp=perfect;
                
                for(int i=1;i<perfect;i++)
                {
                    if(perfect%i==0)
                    {
                            sum=sum+i;
                        
                    }
                }
                if(sum==temp)
                {
                    System.out.println("This number is perfect number :");
                }
                else
                {
                    System.out.println("This number is not perfect ");
                }
            }
            break;
            case 'n':
            {
                System.out.println("This is show neon number :");
                System.out.println("Enter the number :");
                int num=inputdo.nextInt();
                

                int value=num*num;
                int rem,sum=0;
                System.out.println(value);
                
                while(value>0)
                {
                    rem=value%10;
                    sum=sum+rem;
                    value=value/10;
                }
                if(sum==num){
                System.out.println("this number is neon number "+sum);
                }
                else
                {
                    System.out.println("This number is not neon number :");
                }
            }
            case 's':
            {
                System.out.println("This is show swap value ");
                System.out.print("Enter the value of a :");
                int ae=inputdo.nextInt();
                System.out.print("Enter the value of b:");
                int b=inputdo.nextInt();
                System.out.println("Real value of a:"+ae);
                System.out.println("Real value of b"+b);
                ae=ae+b;
                b=ae-b;
                ae=ae-b;
                System.out.println("swap value of a"+ae);
                System.out.println("Real value of b:"+b);
            }
            break;
            case 'v':
                {
                    System.out.println("This show vowel and consonant");
                    System.out.println("Enter the any character :");
                    char vowel=inputdo.next().charAt(0);
                    if(vowel=='a'||vowel=='e'||vowel=='i'||vowel=='o'||vowel=='u')
                    {
                        System.out.println("This is vowal ");
                    }
                    else 
                    {
                        System.out.println("This is consonant");
                    }
                }
            

            default:
                break;
        }
    }
}





8)
1 -->10 cases 
as u wish patterns 

public class I {
    public static void main(String[] args) {

        for (int a = 1; a <= 10; a++)

            switch (a) {
                case 1: {
                    for (int i = 1; i <= 4; i++) {
                        for (int j = 1; j <= 4; j++) {
                            if (i == 4 || i == 1 || j == 1 || j == 4) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println("");
                    }
                }

                    break;
                case 2: {
                    for (int i = 1; i <= 4; i++) {
                        for (int s = 3; s >= i; s--) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }
                    break;
                case 3: {

                    for (int i = 4; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }
                    break;
                case 4: {

                    for (int i = 1; i <= 4; i++) {
                        for (int s = 3; s >= i; s--) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }
                    break;
                case 5: {
                    for (int i = 1; i <= 3; i++) {
                        for (int j = 3; j >= i; j--) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }

                }
                    break;
                case 6: {
                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }

                }
                    break;

                case 7: {

                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");

                        }
                        System.out.println();
                    }
                    for (int i = 1; i <= 2; i++) {
                        for (int j = 2; j >= i; j--) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }
                    break;
                case 8: {
                    for (int i = 1; i <= 4; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(i);
                        }
                        System.out.println();
                    }

                }
                    break;
                case 9: {
                    for (int i = 1; i <= 4; i++) {
                        for (int j = 1; j <= i; j++) {
                            if (i % 2 == 0) {
                                System.out.print("0");

                            } else {
                                System.out.print("1");
                            }
                        }
                        System.out.println();
                    }

                }
                    break;
                case 10: {

                    for (int i = 1; i <= 4; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(j);
                        }
                        System.out.println();
                    }
                }
                    break;
                default:
                    break;
            }

    }
}




