import java.util.Scanner;
class Palindrome
{
  public static void main(String args[])
    {
	int n,num=0,rem,temp;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a number to check if it is Palindrome or not");
	n=sc.nextInt();
	temp=n;
	while(n>0)
	{
	  rem=n%10;
	  num=(num*10)+rem;
	  n=n/10;
	}
	if(temp==num)
	System.out.println("Number is Palindrome");
	else
	System.out.println("Number is not Palindrome");
}
}