import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Cal1 extends Applet implements ActionListener{

TextField one=new TextField(5);
TextField two=new TextField(5);
TextField res=new TextField(7);
Button add=new Button("add");
Button sub=new Button("sub");
Label l1=new Label("First Num:");
Label l2=new Label("Second Num:");
Label l3=new Label("Result:");

public void init(){


add(l1); add(one); add(l2); add(two); add(l3); add(res);
add(add); add(sub);
one.addActionListener(this);
two.addActionListener(this);
res.addActionListener(this);
add.addActionListener(this);
sub.addActionListener(this);

}
public void actionPerformed(ActionEvent ae){
String str=ae.getActionCommand();

float b1,b2,b3=0;
String msg;

//b.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ae){t1.setText("welcome");}});

b1=Float.parseFloat(one.getText());
b2=Float.parseFloat(two.getText());

if(str.equals("add"))
b3=b1+b2;

if(str.equals("sub"))
b3=b1-b2;
msg=String.valueOf(b3);
res.setText(msg);
repaint();

}
public void paint(Graphics g){}

}

/*
<applet code="Cal1.class" width="300" height="300">
</applet>
*/





