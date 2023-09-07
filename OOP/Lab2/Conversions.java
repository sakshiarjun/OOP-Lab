import java.util.Scanner;
class Conversions
{
  public static void main(String args[])
    {
	Scanner sc= new Scanner(System.in);
	int n,n1,n2;
	double d;
	char c;
	System.out.println("Enter a number");
	n=sc.nextInt();
	System.out.println("Enter a double number");
	d=sc.nextDouble();
	System.out.println("Enter a character");
	c=sc.next().charAt(0);
	byte b=(byte) n;
	n1=(int) c;
	byte b1=(byte) d;
	n2= (int) d;
	System.out.println("int to byte : "+b);
	System.out.println("char to int : "+n1);
	System.out.println("double to byte : "+b1);
	System.out.println("double to int : "+n2);
}
}