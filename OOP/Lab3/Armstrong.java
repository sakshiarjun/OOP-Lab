import java.util.Scanner;

public class Armstrong {

	public static void main(String args[])
	{
		Scanner in= new Scanner(System.in);
		int num,rem,ans=0,temp,temp1,dig=0;
		System.out.println("Enter a number: ");
		num=in.nextInt();
		temp=num;
		temp1=num;
		while(num!=0)
		{
			num=num/10;
			dig++;
		}
		System.out.println("Digits= "+dig);
		while(temp!=0)
		{
			rem=temp%10;
			ans=ans+((int)Math.pow(rem, dig));
			temp=temp/10;
		}
		if(ans==temp1)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not an Armstrong Number");
	}

}
