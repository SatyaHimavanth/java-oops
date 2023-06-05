class Date{
int x;
void date(){
System.out.println("00:00:00");
}
void date(int x){
System.out.println(x+":00:00");
}
public static void main(String args[]){
Date d = new Date();
d.date();
d.date(2);
}
}