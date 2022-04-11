import java.awt.*;
import java.applet.*;
import java.awt.event.*;
class SampleFrame extends Frame{
SampleFrame(String title){
super(title);
MyWindowAdapter ad=new MyWindowAdapter(this);
addWindowListener(ad);
}
public void paint(Graphics g){
g.drawString("This is frame",10,40);
}
}

class MyWindowAdapter extends WindowAdapter{
	SampleFrame sample;
	public MyWindowAdapter(SampleFrame sample){
		this.sample.setVisible(false);
	}
public void wondowClosing (WindowEvent we){
	sample.setVisible(false);
}
}


public class AppletFrame extends Applet{
	Frame f;
	public void init(){
		f=new SampleFrame("Frame Window");
		f.setSize(250,250);
		f.setVisible(true);
	}
	public void start(){f.setVisible(true);}
	public void stop(){f.setVisible(false);}
	public void paint(Graphics g){
		g.drawString("This is applet View",10,20);
	}

}

