import java.util.Scanner;
public class Matrix_Symm 
{
     public static void main(String args[])
  {
 int a,b,i,j;boolean flag=true;
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

 for(i=0;i<a;i++)
 {
     for(j=0;j<b;j++)
     {
         if(arr[i][j]!=arr[j][i])
             flag=false;
     }
 }
 if(flag)
   System.out.println("Symmetric");
 else
     System.out.println("Not Symmetric");
  }  
    
}