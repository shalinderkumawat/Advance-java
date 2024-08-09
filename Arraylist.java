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

