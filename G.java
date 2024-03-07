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