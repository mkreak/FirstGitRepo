import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class ButtonDemo {
public static void main(String [] args){
Frame f=new Frame("Button EX:");

final TextField t=new TextField();
t.setBounds(50,50,150,20);
Button b1,b2;
b1=new Button("Press me");
b1.setBounds(50,100,80,30);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
t.setText("Welcome");
}
});

f.add(b1);
f.add(t);
f.setSize(500,500);
f.setLayout(null);
f.setVisible(true);

}}


/*
<html>
<body>
<applet code="ButtonDemo" width="100" height="200">
</applet>
</body>
</html>
*/