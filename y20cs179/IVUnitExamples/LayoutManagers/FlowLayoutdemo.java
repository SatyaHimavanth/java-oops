import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="FlowLayoutDemo" width = 250 height = 200>
</applet>
*/
public class FlowLayoutDemo extends Applet implements ItemListener{
String msg = " ";
Checkbox Win98, WinNT, Solaris, Mac;
public void init() {
//Set left-aligned flow layout
setLayout(new FlowLayout(FlowLayout.LEFT));
Win98 = new Checkbox("Windows98", null, true);
WinNT = new Checkbox("Windows NT/2000");
Solaris = new Checkbox("Solaris");
Mac = new Checkbox("MacOS");
add(Win98);
add(WinNT);
add(Solaris);
add(Mac);
Win98.addItemListener(this);
WinNT.addItemListener(this);
Solaris.addItemListener(this);
Mac.addItemListener(this);
}
public void itemStateChanged(ItemEvent ie) {
repaint();
}
//Display current state of the check boxes.
public void paint(Graphics g) {
msg = "Current State";
g.drawString(msg, 6, 80);
msg = "Windows 98: " + Win98.getState();
g.drawString(msg, 6, 100);
msg = "Windows NT/2000: " + WinNT.getState();
g.drawString(msg, 6, 120);
msg = "Solaris: " + Solaris.getState();
g.drawString(msg, 6, 140);
msg = "Mac: " + Mac.getState();
g.drawString(msg, 6, 160);
}
}
