Question 1: Tax Calculator
Write a Java program that calculates income tax for individuals based on the following criteria:

Income <= $10,000: No tax
$10,001 - $30,000: 10% tax
$30,001 - $50,000: 20% tax
Income > $50,000: 30% tax


import java.util.*;
public class B {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your INCOME");
        int a=sc.nextInt();
        double tax;
        if(a<=10000)
        {
            System.out.println("not tax :"+a);

        }
        else if(a>=10000&&a<=30000)
        {
            tax=a*0.10;
            System.out.println("tax 10%"+   tax);
        }
        else if(a>=30000&&a<=50000)
        {
            tax=a*0.20;
            System.out.println("tax 20% : " + tax);
        }
        else if (a>50000)
        {
            tax=a*0.30;
            System.out.println("tax 30% : " + tax);
        }
        else 
        {
            System.out.println(" ");
        }
    }
}


Question 2: BMI Calculator
Create a program that calculates the Body Mass Index (BMI) based on a person's weight and height. Categorize the BMI using the following ranges:

BMI < 18.5: Underweight
18.5 <= BMI < 24.9: Normal weight
25 <= BMI < 29.9: Overweight
BMI >= 30: Obesity

import java.util.*;
public class B
{
    public static void main(String[] args){
 Scanner input=new Scanner (System.in);

 System.out.println("Enter your weight kg: ");        
 float a=input.nextFloat();
System.out.println("Enter your height ");
int b=input.nextInt();
float BMI=a/(b*b);
if (BMI<=18.5)
{
    System.out.println("Underweight");
}
else if(BMI<=18.5||BMI>24.9)
{
    System.out.println("    Normal weight");
}
else if(BMI<25||BMI>29.9)
{
    System.out.println("Overweight");
}
else if(BMI>=30)
{
    System.out.println("Obesity");
}




    }
}





Question 3: Leap Year Checker
Write a Java program that checks if a given year is a leap year or not. Leap years are divisible by 4, but years divisible by 100 are not leap years unless they are also divisible by 400.


import java.util.*;
public class B{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        if(a%100==0&&a%400==0||a%100!=0&&a%4==0)
        {
           

                System.out.println(a +":this year is leap year ");
           
        }
        else 
        {
            System.out.println("this year is not leap year :" + a);
        }
    }
}

Question 4: Time of Day Greeting
Create a program that asks for the time of day (morning, afternoon, evening) and then greets the user accordingly. For example, "Good morning!" if the time is morning.

import java.util.*;
public class B{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter time ");
        int a=sc.nextInt();
        if(a<=5&&a>=12)
        {
            System.out.println("Good afternoon  Shailendra kumawat ");
        }
        else if(a>12&&a<18)
        {
            System.out.println("good evening Shailendra kumawat ");
        }
        else if(a<=18&&a<24)
        {
            System.out.println("good night Shailendra kumawat");
        }
        else 
        {
            System.out.println(" ");
        }
    }
}

Question 5: Menu Selection
Design a simple restaurant menu system that takes a customer's choice (1-3) and displays the selected food item and
 its price. Use if-else if-else statements.

import java.util.*;
public class B
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner (System.in);
        System.out.println("1 = indian");
        int a=input.nextInt();
        if(a==1)
        {
            System.out.println("1 = daal");
            System.out.println("2 = baati");
            int b=input.nextInt();
            if(b==1)
            {
                System.out.println("daal price = 340");
            }
            else if(b==2)
            {
                System.out.println("baati price = 230");
            }
            else {
                System.out.println(" ");
            }
            
        }
    }
}

Question 6: Temperature Converter
Write a Java program to convert temperatures between Celsius and Fahrenheit. The program should ask the user for the input temperature and the unit (C or F) and provide the converted temperature.

import java.util.*;
public class B{
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


Question 7: Number Comparison
Create a program that takes two numbers as input and uses if-else if-else statements to determine and print which number is greater or if they are equal.

import java.util.*;
public class B
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner (System.in);

        System.out.println("number maix");
        System.out.println("Entre the number a ");
        int a=input.nextInt();
        System.out.println("Enter the number  of b : ");
        int b=input.nextInt();
        if(a>b)
        {
            System.out.println("number a is grater than : " + a);
        }
        else
        {
            System.out.println("b is maix : "+b);
        }
    }
}






Question 8: Ticket Booking System
Design a ticket booking system for a cinema that calculates the ticket price based on the age of the customer. Children (age < 12) get a 50% discount, while seniors (age >= 65) get a 30% discount.

import java.util.*;
public class B{
    public static void main(String[] args)
{
    Scanner input= new Scanner (System.in);
    System.out.println("This program is ticket booking");
    System.out.println("ticket prine = 200");
   
    int a=200;
    System.out.println("Enter the your age : ");
    int age=input.nextInt();
    int dis;
     System.out.println("you are c= children s=senior ");
        if (age<12)
        {
            System.out.println("you are childern ");
            dis=a-(a*50/100);
            System.out.println(" dis :" +dis);
        }
        else if (age>=65)
        {
            System.out.println ("you are seinor ");
            dis=a-(a*30/100);
            System.out.println("dis : " + dis);
        }

}

    


}

Question 9: Letter Grade Calculator
Write a program that accepts a student's score as input and calculates their letter grade using if-else if-else statements. Consider the standard letter grading system (A, B, C, D, F).


import java.util.*;
public class B
{
    public static void main(String[] args)
    {
        Scanner input =new Scanner (System.in);
        System.out.println("Enter your sub number ");
        int math,hindi,english,computer;
        math=input.nextInt();
        hindi=input.nextInt();
        english=input.nextInt();
        computer=input.nextInt();
        int total=(math+hindi+english+computer)/5;
        System.out.println("total number is out of 500 :"+ total);
        if(total >=45)
        {
            System.out.println("sorry you are fail 'f' ");
        }
        else if(total>=46||total<=60)
        {
            System.out.println("you are pass 'A");
        }
        else if(total>60||total<=80)
        {
            System.out.println("you are pass 'B");
        }
        else if(total>80||total<=99)
        {
            System.out.print("you are pass A");
        }
    }
}





Question 10: Vowel or Consonant Checker
Create a program that takes a single alphabet character as input and checks if it is a vowel (A, E, I, O, U) or a consonant

import java.util.*;
public class B{
    public static void main(String[] args){
        Scanner input =new Scanner (System.in);
        System.out.println("Enter any character ");
        char c=input.next().charAt(0);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){

        
        System.out.println("this character is vowel : "+c);
    }

    else {
        System.out.println("This cahracter is consonat");
    }
    }
}



