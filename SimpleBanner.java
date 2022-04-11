import java.awt.*;
import java.applet.*;

public class SimpleBanner extends Applet implements Runnable{
String msg="A Simple Moving Banner";
Thread t=null;
int state;
boolean stop;

public void init(){
	setBackground(Color.cyan);
	setForeground(Color.red);
}

public void start(){
	t=new Thread(this);
	stop=false;
	t.start();
}

public void run(){
	char ch;
	for(;;){
		try{
		repaint();
		Thread.sleep(250);
		ch=msg.charAt(0);
		msg=msg.substring(1,msg.length());
		msg=msg+ch;
		if(stop)
		break;
		}
		catch(InterruptedException e){ }
	}
}
public void stop(){
	stop=true;
	t=null;
}

public void paint(Graphics g){
g.drawString(msg,50,30);
}
}

/*
<html>
<body>
<applet code="SimpleBanner.class" width="300" height="400">
</applet>
</body>
</html>
*/
