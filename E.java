import java.util.*;
public class E{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int a=sc.nextInt();
        int sum;
        while(a>0)
        {
            sum=a%10;
            a++;
             System.out.println(sum);
        }
       
    }
}