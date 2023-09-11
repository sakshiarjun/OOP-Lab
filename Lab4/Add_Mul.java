import java.util.Scanner;
class Add_Mul
{
    public static void main(String args[])
  {
 int a,b,i,j,m,n,k;
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter rows and columns of 1:");
 a = sc.nextInt();
 b = sc.nextInt();
 System.out.println("Enter rows and columns of 2:");
 m = sc.nextInt();
 n = sc.nextInt();
 int arr1[][]= new int[a][b];
 int arr2[][]= new int[m][n];
 int marr[][]= new int[a][n];
 
 System.out.println("Enter elements for 1");
 for(i=0;i<a;i++)
 {
     for(j=0;j<b;j++)
     {arr1[i][j]=sc.nextInt();}
 }
 System.out.println("Enter elements for 2");
for(i=0;i<a;i++)
 {
     for(j=0;j<b;j++)
     {arr2[i][j]=sc.nextInt();}
 }

if(b!=m)
 System.out.println("Can't Multiply");
else
{
  for(i=0;i<a;i++)
 { 
     for(j=0;j<n;j++)
     {
      for(k=0;k<m;k++)
         marr[i][j]=marr[i][j]+arr1[i][k]*arr2[k][j];      
     }
 }
 System.out.println("Multiplication Matrix: ");
  for(i=0;i<a;i++)
 {
     for(j=0;j<n;j++)
     {System.out.print(""+marr[i][j]+" ");}
          System.out.println(" ");
 }
}
if(a!=m||b!=n)
{
   System.out.println("Not possible to add");
}
else
{ 
    System.out.println("Addition Matrix: ");
 for(i=0;i<a;i++)
 {
     for(j=0;j<b;j++)
     {
         arr1[i][j]=arr1[i][j]+arr2[i][j];         
     }
 }
 for(i=0;i<a;i++)
 {
     for(j=0;j<b;j++)
     {System.out.print(""+arr1[i][j]+" ");}
          System.out.println(" ");
 }
}
}
}