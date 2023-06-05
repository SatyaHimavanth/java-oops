package p1;
public class protection
{
int n=2;
private int n_pri=1;
protected int n_pro=3;
public int n_pub=4;
public protection()
{
System.out.println("base constructor");
System.out.println("n ="+n);
System.out.println("n_pri="+n_pri);
System.out.println("n_pro="+n_pro);
System.out.println("n_pub="+n_pub);
}
}
package p1;
class derived extends protection
{
derived()
{
System.out.println("derived constructor");
System.out.println("n ="+n);
//System.out.println("n_pri="+n_pri);
System.out.println("n_pro="+n_pro);
System.out.println("n_pub="+n_pub);
}
}
package p1;
class samepackage
{
samepackage()
{
protection p=new protection();
System.out.println("samepackage constructor");
System.out.println("n ="+p.n);
//System.out.println("n_pri="+p.n_pri);
System.out.println("n_pro="+p.n_pro);
System.out.println("n_pub="+p.n_pub);
}
}
package p2;
class protection2 extends p1.protection
{
protection2()
{
System.out.println("derived other package constructor");
//System.out.println("n ="+n);
//System.out.println("n_pri="+n_pri);
System.out.println("n_pro="+n_pro);
System.out.println("n_pub="+n_pub);
}
}
package p2;
class otherpackage
{
otherpackage()
{
p1.protection p=new p1.protection();
System.out.println("other package non sub class constructor");
//System.out.println("n ="+p.n);
//System.out.println("n_pri="+p.n_pri);
System.out.println("n_pro="+p.n_pro);
System.out.println("n_pub="+p.n_pub);
}
}
package p1;
public class Week8
{
public static void main(String args[])
{
protection p=new protection();
derived d=new derived();
samepackage s=new samepackage();
}
}
package p2;
class Week8a
{
public static void main(String args[])
{
protection2 p=new protection2();
otherpackage o=new otherpackage();
}
}