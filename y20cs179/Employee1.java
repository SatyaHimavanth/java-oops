import java.util.*; 
class Employee
{ 
String st;
String id;
float salary;
int work_time;
void getInfo()
{    
Scanner so=new Scanner(System.in);
System.out.println("Enter name for employee :");
st=so.nextLine();
System.out.println("Enter id:");
id=so.nextLine();
System.out.println("Enter the salary:");
salary=so.nextFloat();
System.out.println("Enter no.of working hours:");
work_time=so.nextInt();
}
void AddSal()
{
if(this.salary<500)
{
this.salary=this.salary+10;
}
}
void AddWork()
{
int  ex=work_time-6;if(this.work_time>6)
{
this.salary=this.salary+(ex*5);
}
}
void display()
{
System.out.println("Employee name is :"+this.st);
System.out.println("id number is : "+this.id);
System.out.println("no of working hours is :"+this.work_time);
System.out.println("the final salary is :"+this.salary);
}
}
public class Employee1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the no of employees :");
int n=sc.nextInt();
Employee [] emp;
emp=new Employee[n];
System.out.println("  ");
for(int i=0;i<n;i++)
{ 
System.out.println("for employee :"+(i+1)); 
emp[i]=new Employee();
emp[i].getInfo();
}
for(int i=0;i<n;i++)
{  
System.out.println("the details for employee "+(i+1));
emp[i].AddSal();  
emp[i].AddWork();
emp[i].display();
System.out.println("  ");
}
}
}