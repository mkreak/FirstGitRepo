import java.awt.*;
import java.awt.event.*;

class DemoA {



public static void main(String [] args){

Frame f=new Frame();
Button b1=new Button("1");
TextField t1,t1,t3;

f.add(b,BorderLayout.CENTER);
f.add(t1);
f.add(t2);
t1.setText("0"); t2.setText("1"); t3.setText("Sum");

f.setSize(500,500);
f.setVisible(true);

int x=0,y=0,z=0;
String s;
x=t1.getText();x=Integer.parseInt(x);
y=t2.getText(); y=Integer.parseInt(y);
z=x+y; 
s=String.valueOf(z);
t3.setText(s);


/* addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent we)
{
System.exit(0);
}
 }); */




}
}
