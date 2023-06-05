import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;
class JTreeDemo extends JFrame implements TreeSelectionListener{
DefaultMutableTreeNode root,dir1,dir2,file1,file2,file3;
JTree tree;
Container c;
String msg="";
JTextArea ta;
JTreeDemo(){
c = getContentPane();
c.setLayout(new BorderLayout());
root = new DefaultMutableTreeNode("c:\\");
dir1 = new DefaultMutableTreeNode("JavaPrograms");
dir2 = new DefaultMutableTreeNode("other Programs");
file1 = new DefaultMutableTreeNode("JButtonDemo.java");
file2 = new DefaultMutableTreeNode("JCheckBoxDemo.java");
file3 = new DefaultMutableTreeNode("xyz.c");
root.add(dir1);
dir1.add(file1);
dir1.add(file2);
dir1.add(dir2);
dir2.add(file3);
tree = new JTree(root);
c.add("North", tree);
ta = new JTextArea();
c.add("South",ta);
tree.addTreeSelectionListener(this);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void valueChanged(TreeSelectionEvent tse){
TreePath tp = tse.getNewLeadSelectionPath();
msg+="\n Path pf selected Component = "+tp;
Object comp = tp.getLastPathComponent();
int n = tp.getPathCount();
msg+="\n Level of component = "+n;
ta.setText(msg);
msg="";
}
public static void main(String args[]){
JTreeDemo td = new JTreeDemo();
td.setSize(400,300);
td.setTitle("JAVA TREE");
td.setVisible(true);
}
}