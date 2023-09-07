import java.util.Scanner;
class Numbers
{
  public static void main(String args[])
    {
	Scanner sc = new Scanner(System.in);
	int n,i,p=0,neg=0,z=0;
	System.out.println("Enter 10 numbers: ");
	for(i=0;i<10;i++)
	{
	  n=sc.nextInt();
	  if(n>0) p++;
	  else if(n<0) n++;
	  else z++;
	}
	System.out.println("Positive Numbers= "+p);
	System.out.println("Negative Numbers= "+neg);
	System.out.println("Zeroes= "+z);
}
}
	