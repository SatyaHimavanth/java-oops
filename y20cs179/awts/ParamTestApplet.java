import java.awt.*;
import java.applet.*;
public class ParamTestApplet extends java.applet.Applet{
Font f = new Font("Time New Roman ",Font.BOLD,40);
String name;
public void init(){
name = getParameter("name");
if(name==null)
name="hai";
name="Have a nice day "+name;
}
public void paint(Graphics g){
g.setFont(f);
g.setColor(Color.gray);
g.drawString(name,50,50);
}
}
/*
<applet code = "ParamTestApplet.class" width = 400 height = 400>
<ALIGN = RIGHT>
<PARAM Name = name VALUE = "Satya">
</applet>
*/