import java.util.Scanner;
class employee
{
String name;
double salary;
String id;
void reademp()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter employee name:");
name=sc.nextLine();
System.out.println("Enter employee id:");
id=sc.nextLine();
System.out.println("Enter employee salary:");
salary=sc.nextInt();
}
}

class temporary_employee extends employee
{
double net_salary;
void print_emp()
{
net_salary = salary + salary*0.035;
System.out.println("Employee name is :" + name);
System.out.println("Employee id is :" + id);
System.out.println("Net salary of employee is : "+net_salary);
}
}

class permanent_employee extends employee
{
double net_salary;
void print_emp()
{
net_salary=salary+salary*0.05;
System.out.println("Employee name is:"+name);
System.out.println("Employee id is :"+id);
System.out.println("Net salary of employee is : "+net_salary);
}
}

class Employee3
{
public static void main(String args[])
{
int i,a=0,b=0;
Scanner s = new Scanner(System.in);
System.out.println("Enter no of temporary employees :");
a = s.nextInt();
System.out.println("Enter no of permanent employees :");
b = s.nextInt();
temporary_employee[] t = new temporary_employee[a];
permanent_employee[] p = new permanent_employee[b];
if(a>0)
{
System.out.println("Enter temporary employee details :");
for(i=0;i<a;i++)
{
t[i] = new temporary_employee();
t[i].reademp();
}
}
if(b>0)
{
System.out.println("Enter permanent employee details :");
for(i=0;i<b;i++)
{
p[i] = new permanent_employee();
p[i].reademp();
}
}
if(a>0)
{
System.out.println("Final details of Temporary employees are :");
System.out.println("Since employee/s is/are temporary, his/her salary is incremented 3.5%");
for(i=0;i<a;i++)
t[i].print_emp();
}
if(b>0)
{
System.out.println("Final details of Permanent employees are :");
System.out.println("Since employee/s is/are permanent, his/her salary is incremented by 5%");
for(i=0;i<b;i++)
p[i].print_emp();
}
}
}