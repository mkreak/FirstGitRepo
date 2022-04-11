import java.awt.*;
import java.awt.event.*;


public class DemoA extends WindowAdapter{
JFrame f;


DemoA(){
f=new JFrame();
f.setSize(500,500);
f.setLayout(null);
f.setVisible(true);

Button b=new Button("click me");
b.setBounds(200,200,100,100);
TextField t1=new TextField();
t1.setBounds(100,100,100,60);

b.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ae){t1.setText("welcome");}});

f.add(b);
f.add(t1);
f.addWindowListener(this);


}

public void windowClosing(WindowEvent e){
f.dispose();
}

public static void main(String[] args){
	new DemoA();
	}
}


//close 
/*addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent e){
dispose();
}
});
*/