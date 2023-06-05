import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class KeyTest extends Applet implements KeyListener{
public void init(){
Label l = new Label("Enter characters");
add(l);
TextField tf = new TextField(20);
tf.addKeyListener(this);
add(tf);
}
public void keyPressed(KeyEvent e){
//showStatus("KEY_PRESSED");
}
public void keyReleased(KeyEvent e){
//showStatus("KEY_RELEASED");
}
public void keyTyped(KeyEvent e){
showStatus("Recently typed character in the text field is :"+e.getKeyChar());
}
}
/*
<applet code="KeyTest.class" width=300 height=300>
</applet>
*/