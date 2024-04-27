public class Main{
    
    
    
    static void swap(int a[],int i,int j)
    {
        int temp=i;
        i=j;
        j=temp;
    }
    
    static void print(int a[])
    {
        int b[]=new int[a.length];
        int c[]=new int[a.length];
        
       for(int i=0;i<=a.length-1;i++)
        {
            if(i%2==0)
            {
                b[i]=a[i];
            }
           
        }
        
        for(int i=0;i<=a.length-1;i++)
        {
          if(i%2!=0)
          {
              c[i]=i;
          }
           
        } 
        
        for(int i=0;i<=a.length-1;i++)
        {
            for(int j=0;j<=a.length-1;i++)
            {
                if(b[i]>c[j])
                {
                   swap(a, i, j);
                }
            }
        }
        for(int i=0;i<=a.length-1;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String [] args)
    {
        int a[]={1,2,4,5,6};
        print(a);
       
       
    }
}