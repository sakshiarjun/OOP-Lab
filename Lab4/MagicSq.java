import java.util.Scanner;
public class MagicSq
 {
    public static void main(String arg[])
  {
 int a,b,i,j;boolean flag=true;int sum1=0;int sum=0;int sum2=0;
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter rows and columns :");
 a = sc.nextInt();
 b = sc.nextInt();
 if(a!=b)
 {
  System.out.println("Not square");
  return;
 }
 int arr[][]= new int[a][b];
 System.out.println("Enter elements");
 for(i=0;i<a;i++)
  {
     for(j=0;j<b;j++)
     {arr[i][j]=sc.nextInt();}
  }
  for(i=0;i<a;i++)
     {
     for(j=0;j<b;j++)
         {
              if(i==j)
             sum+=arr[i][j];
         }
     }
 for(i=0;i<a;i++)
     {
     for(j=0;j<b;j++)
         {
         if(i+j==a-1)
             sum1+=arr[i][j];
         sum2+=arr[i][j];
         }
     if(sum2!=sum)
     {
         flag=false;
         break;
     }
     sum2=0;
    }
 if(sum1!=sum)
 { 
     flag=false;
 }
 for(j=0;j<b;j++)
   {
     for(i=0;i<a;i++)
     {
       sum2+=arr[i][j];  
     }
     if(sum2!=sum)
     {
         flag=false;
         break;
     }
     sum2=0;
    }
if(flag!=true)
{
  System.out.println("Not magic");
}
else if(flag)
    System.out.println("magic");
    }
}