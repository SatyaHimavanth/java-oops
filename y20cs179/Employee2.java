import java.util.*;
class employee
{
String name;
String id;
String des;
void reademp()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the name of employee:");
name=s.nextLine();
System.out.println("Enter id of the employee:");
id =s.nextLine();
System.out.println("Enter the designation of employee:");
des=s.nextLine();
}
} 
class salary extends employee
{
int bp,hra,da,pf,np=0;
void readsalary()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter employee basic pay:");
bp = sc.nextInt();
System.out.println("Enter employee house rent allowance :");
hra = sc.nextInt();
System.out.println("Enter employee dearness allowance:");
da = sc.nextInt();
System.out.println("Enter employee provident fund:");
pf = sc.nextInt();
}
void calculatesalary()
{
np=((bp+hra+da)-pf);
}
void displayemp()
{
System.out.println("Employee name is :" + super.name);
System.out.println("Employee id is :" + super.id);
System.out.println("Employee designation is :" + super.des);
System.out.println("Employee net pay :" + np);
}
}
class Employee2
{
public static void main(String args[])
{
int i;
Scanner s1=new Scanner(System.in);
System.out.println("Enter no.of employees:"); 
int k=s1.nextInt();
salary[] e=new salary[k];
for(i=0;i<k;i++)
{
System.out.println("enter" +( i +1)+" employee details :");
e[i]=new salary();
e[i].reademp();
e[i].readsalary();
e[i].calculatesalary();
}
for(i=0;i<k;i++)
{
System.out.println("Employee "+(i+1)+" details :");
e[i].displayemp();
}
}
}