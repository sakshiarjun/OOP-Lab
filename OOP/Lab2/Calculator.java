import java.util.Scanner;
class Calculator
{
  public static void main(String args[])
    {
	Scanner sc= new Scanner(System.in);
	float n1,ans,n2;
	char op,b; 
	System.out.println("Enter first number: ");
	n1=sc.nextFloat(); 
	do
	{
		System.out.println("Enter Operator: ");
		op=sc.next().charAt(0);
	switch(op)
	{
		case '+':
		{
			System.out.println("Enter second number: ");
			n2=sc.nextFloat();
			System.out.println("Answer= "+(n1+n2));
			ans=n1+n2;
			n1=ans;
			break;
		}
		case '-':
		{
			System.out.println("Enter second number: ");
			n2=sc.nextFloat();
			ans=n1-n2;
			System.out.println("Answer= "+(n1-n2));
			n1=ans;
			break;
		}
		case '/':
		{
			System.out.println("Enter second number: ");
			n2=sc.nextFloat();
			ans=n1/n2;
			System.out.println("Answer= "+(n1/n2));
			n1=ans;
			break;
		}
		case '*':
		{
			System.out.println("Enter second number: ");
			n2=sc.nextFloat();
			ans=n1*n2;
			System.out.println("Answer= "+(n1*n2));
			n1=ans;
			break;
		}
		default:
		{System.out.println("Enter valid operator");}
	}
		System.out.println("Do another calculation(y/n)?");
		b=sc.next().charAt(0);
	} while(b=='y');
	
    }
}