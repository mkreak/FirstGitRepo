import javax.swing.*;
import java.awt.event.*;

public class EventDemo extends JFrame implements ActionListener{
JTextField j1,j2,j3;
JButton b1,b2;
JFrame f;
JMenu m,m1,sm;
JMenuItem i1,i2,i3,i4,i5;
JProgressBar jb; int i=0,num=0;
EventDemo(){
jb=new JProgressBar(0,2000);
jb.setBounds(40,40,700,30);
jb.setValue(0);
jb.setStringPainted(true);
f.add(jb);

f=new JFrame();
f.setSize(700,700);
j1= new JTextField();
j1.setBounds(100,70,80,50);
j2=new JTextField();
j2.setBounds(200,70,80,50);
j3=new JTextField();
j3.setBounds(300,70,80,50);
b1=new JButton("+");
b1.setBounds(100,150,80,50);
b2=new JButton("-");
b2.setBounds(200,150,80,50);
JPasswordField value= new JPasswordField();
JLabel l1=new JLabel("Password");
l1.setBounds(100,300,100,50);
value.setBounds(200,300,100,50);
JCheckBox c1=new JCheckBox("c++");
c1.setBounds(50,400,100,50);
JCheckBox c2= new JCheckBox("java");
c2.setBounds(150,400,100,50);
JRadioButton r=new JRadioButton("a");
r.setBounds(100,500,100,50);
JOptionPane.showMessageDialog(f,"hello");
JMenuBar mb=new JMenuBar();
m=new JMenu("Menu");
m1=new JMenu("Menu 2");
sm=new JMenu("Submenu");
i1=new JMenuItem("i1");
i2=new JMenuItem("i2");
i3=new JMenuItem("i3");
i4=new JMenuItem("i4");
i5=new JMenuItem("i5");
m.add(i1);
m.add(i2);
m.add(i3);
sm.add(i4);
sm.add(i5);
m.add(sm);
m1.add(sm);
mb.add(m); 
mb.add(m1);
m.addSeparator();
f.setJMenuBar(mb);
f.add(value);
f.add(l1);
f.add(b1);
f.add(b2);
f.add(j1);
f.add(j2);
f.add(j3);
f.add(c1);
f.add(c2);
f.add(r);

f.show();
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//f.addWindowListener(this);
b1.addActionListener(this);

	
}
public void actionPerformed(ActionEvent ae){
String s1=j1.getText();
String s2=j2.getText();
int a=Integer.parseInt(s1);
int b=Integer.parseInt(s2);
int c=0;
if(ae.getSource()==b1)
c=a+b;
else if(ae.getSource()==b2)
c=a-b;
String msg=String.valueOf(c);
j3.setText(msg);
} 

public void iterate(){
	while(i<=2000){
System.out.println("in fun");
	jb.setValue(i);
	i=i+20;
	try{
System.out.println("in try");		
Thread.sleep(150);
	}
	catch(Exception e){System.out.println("in catch");}
	}
}
/*public void windowClosing(WindowEvent e){
f.dispose();
}
*/


public static void main(String[] args){
EventDemo ev =new EventDemo();
System.out.println("in main");
ev.setVisible(true);
ev.iterate();
}
}



