import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingDemo extends WindowAdapter{

Frame f;
SwingDemo(){
f=new Frame();
JButton b=new JButton("click");
JLabel l= new JLabel("my label");

JTextField t=new JTextField();
t.setBounds(200,200,100,60);
b.setBounds(100,100,100,100);
l.setBounds(200,300,100,100);
b.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
t.setText("welcom");
}
});
f.add(b);
f.add(t);

f.add(l);
f.setSize(500,500);
f.setVisible(true);
f.addWindowListener(this);
}
public void windowClosing(WindowEvent e){
f.dispose();
}

public static void main(String[] args){
new SwingDemo();

}
}


