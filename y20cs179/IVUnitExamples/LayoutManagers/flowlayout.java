import java.awt.*;
import java.applet.*;
/* <applet code=flowlayout width=500 height=500>
</applet>*/
public class flowlayout extends Applet 
{
public void init () {
    setLayout (new FlowLayout ()); // default
   add (new Button ("One"));
    add (new Button ("Two"));
   add (new Button ("Three"));
   add (new Button ("Four"));   
add (new Button ("Five"));
   add (new Button ("Six"));  }} 

