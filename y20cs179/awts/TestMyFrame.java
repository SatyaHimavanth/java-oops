//Java program to display colour using applet
import java.awt.Color;
import java.awt.Frame;
class MyFrame extends Frame{
MyFrame(String s){
super(s);
setBackground(Color.blue);
setSize(250,100);
setVisible(true);
}
}
class TestMyFrame{
public static void main(String args[]){
System.out.println("Creating a 250 x 100 pixel frame "+" with title\"MyFrame\".");
new MyFrame("myFrame");
System.out.println("to quit, click on this window "+" and then press ctrl+c");
}
}