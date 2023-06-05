import java.applet.*;
import java.awt.*;
import java.awt.Color.*;
public class GraphicsDemo extends Applet{
Font f = new Font("Courier", Font.PLAIN, 20);
public void paint(Graphics g){
setForeground(Color.blue);
setBackground(Color.red);
g.setFont(f);
g.drawString("Welcome",100, 100);
}
}
/*
<applet code="GraphicsDemo.class" width="300" height="300">
</applet>
*/