import java.util.Scanner;
class Employee
{
    String name, city;
    int salary, DA, HRA;
    Scanner sc= new Scanner(System.in);
    void getdata()
    {
        System.out.println("Enter Name of Employee: ");
        name=sc.nextLine();
        System.out.println("Enter City: ");
        city=sc.nextLine();
        System.out.println("Enter salary, DA and HRA: ");
        salary=sc.nextInt(); DA=sc.nextInt(); HRA=sc.nextInt();
    }
    double calculate()
    {
        return salary+salary*DA/100+salary*HRA/100;
    }
    void display()
    {
        System.out.println("Total Salary= "+calculate());
    }
}
class EmployeeDemo
{
    public static void main(String args[])
    {
        Employee obj= new Employee();
        obj.getdata();
        obj.calculate();
        obj.display();
    }
}