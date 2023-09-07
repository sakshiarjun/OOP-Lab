import java.util.Scanner;
class Rectangle
{
  public static void main(String args[])
    {
	int length, breadth,area,circum;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter length: ");
	length = sc.nextInt();
	System.out.println("Enter breadth: ");
	breadth = sc.nextInt();
	area=length*breadth;
	circum=2*(length+breadth);
	System.out.println("Area= "+area);
	System.out.println("Circumference= "+circum);
}
}