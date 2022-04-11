import java.awt.*;
import java.applet.*;

public class StatusWindow extends Applet{

public void init(){
setBackground(Color.yellow);
}

public void paint(Graphics g){
g.drawString("This is Applet Window",10,20);
showStatus("This is status Window");
}
}

/*
<html>
<body>
<applet code="StatusWindow" width="200" height="200">
</applet>
</body>
</html>
*/

