advance :
1)

XYZ Technologies is in the process of increment the salary of the employees. This
increment is done based on their salary and their performance appraisal rating.
If the appraisal rating is between 1 and 3, the increment is 10% of the salary.
If the appraisal rating is between 3.1 and 4, the increment is 25% of the salary.
If the appraisal rating is between 4.1 and 5, the increment is 30% of the salary.
Help them to do this, by writing a program that displays the incremented salary. Write a
class “IncrementCalculation.java” and write the main method in it.
Note : If either the salary is 0 or negative (or) if the appraisal rating is not in the range 1 to
5 (inclusive), then the output should be “Invalid Input”.
Sample Input 1 :
Enter the salary
8000
Enter the Performance appraisal rating
3
Sample Output 1 :
8800
Sample Input 2 :
Enter the salary
7500
Enter the Performance appraisal rating
4.3
Sample Output 2 :
9750
Sample Input 3 :
Enter the salary
-5000
Enter the Performance appraisal rating
6
Sample Output 3 :
Invalid Input

import java.util.*;
public class H {
    public static void main(String [] args){
        Scanner input=new Scanner (System.in);
        System.out.println("Enter your salary: ");
        int salary=input.nextInt();
        System.out.println("Enter the performanc appraisal rating :");
        float appraisal =input.nextFloat();

        int incer=0;
        int value=0;

        if(appraisal<=3)
        {
            incer=(salary*10/100);
            
          value=  salary+(salary*10/100);
                        System.out.println(salary+"%10 + "+ incer+"="+(value));
        }
        else if(appraisal>=3.1||appraisal<=4)
        {
            incer=(salary*25/100);
            
          value=  salary+(salary*25/100);
                        System.out.println(salary+" +%25 + "+ incer+"="+(value));
        }
        else if(appraisal>=4.1||appraisal<=5)
        {
            incer=(salary*30/100);
            
          value=  salary+(salary*30/100);
                        System.out.println(salary+" + %30 + "+ incer+"="+(value));
        }
        else {
            System.out.println("sorry not match :");
        }

    }
    
}

2)Problem Statement – Goutam and Tanul plays by telling numbers. Goutam says a number
to Tanul. Tanul should first reverse the number and check if it is same as the original. If yes,
Tanul should say “Palindrome”. If not, he should say “Not a Palindrome”. If the number is
negative, print “Invalid Input”. Help Tanul by writing a program.
Sample Input 1 :
21212
Sample Output 1 :
Palindrome
Sample Input 2 :
6186
Sample Output 2 :
Not a Palindrome

import java.util.*;
public class H{
    public static void main(String [] args)
    {
      Scanner input=new Scanner (System.in);
      System.out.print("Goutam tell number :");
         int number =input.nextInt();


         int rem;
         int tanul=0;
         int temp=number;

         while(number>0)
         {
            rem=number%10;
            tanul=tanul*10+rem;
            number=number/10;

         }
         if(tanul==temp){
         System.out.println("This number is palindrom number :"+tanul);
         }
         else 
         {
            System.out.println("This numbe ris not palindrom number  :");
         }
    }
}


3)
In a theater, there is a discount scheme announced where one gets a 10% discount
on the total cost of tickets when there is a bulk booking of more than 20 tickets, and
a discount of 2% on the total cost of tickets if a special coupon card is submitted.
Develop a program to find the total cost as per the scheme. The cost of the k class
ticket is Rs.75 and q class is Rs.150. Refreshments can also be opted by paying an
additional of Rs. 50 per member.
Hint: k and q and You have to book minimum of 5 tickets and maximum of 40 at a
time. If fails display “Minimum of 5 and Maximum of 40 Tickets”. If circle is given a
value other than ‘k’ or ‘q’ the output should be “Invalid Input”.
The ticket cost should be printed exactly to two decimal places.
Sample Input 1:
Enter the no of ticket:35
Do you want refreshment:y  
Do you have coupon code:y
Enter the circle:k
Sample Output 1:
Ticket cost:4065.25
Sample Input 2:
Enter the no of ticket:1
Sample Output 2:
Minimum of 5 and Maximum of 40 Tickets


import java.util.*;

public class H {
    public static void main(String [] args)
    {
        Scanner input=new Scanner (System.in);
        System.out.print("Enter the number of tickets :");
        int ticket=input.nextInt();
        int discount=0;
       



        System.out.print("Do you want refreshment :");
        char refreshment=input.next().charAt(0);

        System.out.print("Do you have coupon code like k  , q :");
        char coupon=input.next().charAt(0);

        if(coupon=='k'){
                int ticketprie=75*ticket;
          if(ticket>=20||ticket<=40)
           {
              discount=ticketprie-(ticketprie*10/100);
           
               System.out.println("Ticket price"+discount);
 
            }
           if(refreshment=='y')
            {
               discount=ticketprie-(ticketprie*2/100);
           
               System.out.println("Ticket price"+discount);

            }
        if(coupon=='q'){
            int ticketpri=150*ticket;
        if(ticket>=20||ticket<=40)
        {
            discount=ticketpri-(ticketpri*10/100);
           
            System.out.println("Ticket price"+discount);

        }
        if(refreshment=='y')
        {
            discount=ticketpri-(ticketpri*2/100);
           
            System.out.println("Ticket price"+discount);

        }
    }
    else 
    (
        System.out.println("Minium of 5 and maxiam 40")
    )
    }
}
}

