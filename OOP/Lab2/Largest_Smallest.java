import java.util.Scanner;
class Largest_Smallest
{
  public static void main(String args[])
    {
	Scanner sc= new Scanner(System.in);
	int a,b,c,l,s;
	System.out.println("Enter 3 numbers: ");
	a=sc.nextInt(); b=sc.nextInt(); c=sc.nextInt();
	l=(a>b)?(a>c?a:c):(b>c?b:c);
	s=(a<b)?(a<c?a:c):(b<c?b:c);
	System.out.println("Largest= "+l);
	System.out.println("Smallest= "+s);
}}