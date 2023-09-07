import java.util.Scanner;
class Bitwise_MulDiv
{
  public static void main(String args[])
     {
	Scanner sc= new Scanner(System.in);
	int num;
	System.out.println("Enter a number: ");
	num=sc.nextInt();
	System.out.println("Multiply by 2= "+(num<<1));
	System.out.println("Divide by 2= "+(num>>1));
}
}
	