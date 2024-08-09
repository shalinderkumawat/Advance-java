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

public class Main{
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