import java.util.Scanner;
class Week9{
public static void main(String args[]){
int a;
try{
Scanner sc = new Scanner(System.in);
System.out.println("Enter array size : ");
a = sc.nextInt();
int arr[] = new int [a];
if(a>0)
System.out.println("Array size : "+a);
}catch(NegativeArraySizeException n){
System.out.println("Generated exception : "+n);
}
}
}