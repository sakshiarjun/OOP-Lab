import java.util.Scanner;
public class PrimeNum {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,m,i,j,flag=0;
        System.out.println("Enter limits m and n: ");
        m=sc.nextInt(); n=sc.nextInt();
       for(i=m;i<=n;i++)
       {
           for(j=2;j<=(i/2);j++)
           {
               flag=0;
               if(i%j==0)
               {
                   flag=1;
                   break;

               }
               
               
           }
           if(flag==0)
               System.out.println(i);
           
       }
        
    }
    
}
