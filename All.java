class A extends Thread{
    public void run(){
        for(int i=1;i<=5;i++)
        {
            try{
                Thread.sleep(900);
            }
            catch(Exception ex)
            {

            }
            System.out.print(i+" ");
        }
    }
}
public class All{
    public static void main(String [] args)
    {
        A sc=new A();
        A cs=new A();

        sc.start();
        try{
            sc.join();
        }
        catch(Exception k)
        {

        }
        cs.start();
    }
}