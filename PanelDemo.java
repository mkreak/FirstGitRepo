import java.awt.*;
import java.awt.event.*;
public class PanelDemo extends WindowAdapter{

PanelDemo(){

	Frame f=new Frame("My frame");
	Panel p=new Panel();
	f.resize(500,500);
	f.setBackground(Color.red);
	p.resize(200,200);
	f.add(p);
	f.show();
f.addWindowListener(this);

f.addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent e){
f.dispose();
}
});

	/*public void windowClosing(WindowEvent e){
		f.dispose();
		} */
}
public static void main(String[] args){


new PanelDemo();


}
}
