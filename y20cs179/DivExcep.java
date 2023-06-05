import java.util.*;
class DivExcep{
public static void main(String args[]){
int i,j;
try{
Scanner sc = new Scanner(System.in);
System.out.println("Enter i value :");
i = sc.nextInt();
System.out.println("Enter j value :");
j = sc.nextInt();
System.out.println(i/j);
}catch(Exception e){
System.out.println(e);
}
}
}