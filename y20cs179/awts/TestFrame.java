import java.awt.Frame;
class TestFrame{
public static void main(String args[]){
System.out.println("Creating a 250 x 100 pixel Frame "+" with title "+" welcome to AWT");
Frame frame = new Frame("Welcome");
frame.setSize(250,100);
frame.setVisible(true);
System.out.println("To quit, click on this window "+" and then press ctrl+c");
}
}