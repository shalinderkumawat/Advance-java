import java.util.*;
public class B{
    public static void main(String[] args)
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter your choice ");

        System.out.println(" 1 = indian ");
        int a=input.nextInt();
        if(a==1)
        {
            System.out.println("1 = daal");
            System.out.println("2 = baati");
            int b=input.nextInt();
            if(b==1)
            {
                System.out.println("daal  pric = 200 ");
            }

            else if (b==2)
            {
                System.out.println("baati pric = 1500");
            }
        }
        else 
        {
            System.out.println("not available");
        }
        }
    }
