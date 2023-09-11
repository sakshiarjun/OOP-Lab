import java.util.Scanner;
class PrincDiag
 {
     public static void main(String arg[])
  {
 int a,b,i,j; int sum=0;
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter rows and columns :");
 a = sc.nextInt();
 b = sc.nextInt();
 int arr[][]= new int[a][b];
 System.out.println("Enter elements");
 for(i=0;i<a;i++)
 {
     for(j=0;j<b;j++)
     {arr[i][j]=sc.nextInt();}
 }
 System.out.println("Principal diagonal elements: \n");
 for(i=0;i<a;i++)
 {
     for(j=0;j<b;j++)
     {
         if(i==j)
         {
            System.out.print(arr[i][j]+" ");
            sum=sum+arr[i][j];
         }
             
     }
 }
 
   System.out.println("\nSum of principle diagonal elements is :"+sum);
  }
    
}
