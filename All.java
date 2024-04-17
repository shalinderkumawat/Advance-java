public class All{
    public static void main(String [] args)
    {
        int a[]={1,2,1,3,4,5,3,2,1};
        for(int i=0;i<a.length;i++)
        {
           for(int j=1;j<a.length;j++)
           {
            if(a[i]==a[j])
            {
               a[i]=0;
                // System.out.print(a[j]+" ");
               
            }
        //    System.out.print(a[i]+" ");
           }  
          
        }
        // System.out.println(c+":a peak element ");
   
    for(int i=0;i<a.length;i++)
    {
        System.out.print(a[i]+" ");
    } }
}