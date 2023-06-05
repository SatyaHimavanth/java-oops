import java.awt.*;
import javax.swing.*;
class JTabbedPaneDemo extends JFrame{
JTabbedPaneDemo(){
Container c = getContentPane();
JTabbedPane jtb = new JTabbedPane();
jtb.addTab("Captials", new CaptialPanel());
jtb.addTab("Countries", new CountriesPanel());
c.add(jtb);
}
public static void main(String args[]){
JTabbedPaneDemo demo = new JTabbedPaneDemo();
demo.setTitle("JTabbedPanel");
demo.setSize(300,400);
demo.setVisible(true);
demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
class CaptialPanel extends JPanel{
CaptialPanel(){
JButton b1 = new JButton("Washington");
JButton b2 = new JButton("London");
JButton b3 = new JButton("Tokyo");
add(b1);
add(b2);
add(b3);
}
}
class CountriesPanel extends JPanel{
CountriesPanel(){
JCheckBox c1 = new JCheckBox("United States");
JCheckBox c2 = new JCheckBox("Britain");
JCheckBox c3 = new JCheckBox("Japan");
add(c1);
add(c2);
add(c3);
}
}