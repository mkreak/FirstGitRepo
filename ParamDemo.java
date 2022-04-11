import java.awt.*;
import java.applet.*;

public class ParamDemo extends Applet{
String fname;
int fsize;
float leading;
boolean active;

public void start(){
	String param;
	fname=getParameter("fname");
	if(fname==null)
		fname="notfound";
	param=getParameter("fsize");
	try{
		if(param!=null)
		fsize=Integer.parseInt(param);
		else
		fsize=0;
	}
	catch(NumberFormatException e){ fsize=-1;}

	param=getParameter("leading");
	try{
		if(param!=null)
		leading=Float.valueOf(param).floatValue();
		else
		leading=0;
	}
	catch(NumberFormatException e){ leading=-1;}

	param=getParameter("activeenable");
	if(param!=null)
	active=Boolean.valueOf(param).booleanValue();
}


public void paint(Graphics g){
	g.drawString("Font name"+fname,0,10);
	g.drawString("Font Size"+fsize,0,20);
	g.drawString("Leading"+leading,0,42);
	g.drawString("Account Active"+active,0,50);
	}
}

/*
<html>
<body>
<applet code="ParamDemo.class" width="500" height="400">
<param name=fname value=courier>
<param name=fsize value=15>
<param name=leading value=2>
<param name=activeenable value=true>
</applet>
</body>
</html>
*/

