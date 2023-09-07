import java.util.Scanner;
class Time
{
    int hours;
    int minutes;
    int seconds;
    Time()
    {
        hours=0;
        minutes=0;
        seconds=0;
    }
    Time(int h, int m, int s)
    {
        hours=h;
        minutes=m;
        seconds=s;
    }
    void display()
    {
        System.out.println("Time Now "+hours+":"+minutes+":"+seconds);
    }
    void add(Time obj1, Time obj2)
    {
        System.out.println("Time after Add "+(obj1.hours+obj2.hours)+":"+(obj1.minutes+obj2.minutes)+":"+(obj1.seconds+obj2.seconds));
    }
}
class TimeDemo
{
    public static void main(String args[])
    {
        
        int h, m, s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter hours: ");
        h=sc.nextInt();
        System.out.println("Enter minutes: ");
        m=sc.nextInt();
        System.out.println("Enter seconds:; ");
        s=sc.nextInt();
        Time obj1= new Time(h,m,s);
        obj1.display();

        
        System.out.println("Enter hours: ");
        h=sc.nextInt();
        System.out.println("Enter minutes: ");
        m=sc.nextInt();
        System.out.println("Enter seconds:; ");
        s=sc.nextInt();
        Time obj2= new Time(h,m,s);
        obj2.display();

        Time obj3= new Time();
        obj3.add(obj1,obj2);
    }
}