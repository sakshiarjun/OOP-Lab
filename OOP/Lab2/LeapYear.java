import java.util.Scanner;
class LeapYear
{
  public static void main(String args[])
    {
	Scanner sc= new Scanner(System.in);
	int n; boolean b;
	System.out.println("Enter year");
	n=sc.nextInt();
	if(n%4!=0) b=false; 
	else if(n%100!=0) b=true;
	else if(n%400!=0) b=false;
	else b=true;
	if(b==true) System.out.println("It is a leap year");
	else System.out.println("It is not a leap year");
}}
	