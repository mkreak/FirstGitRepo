import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Calculator extends WindowAdapter implements ActionListener{

String msg="";
	int v1,v2,result;
	Frame f;
	TextField t1;
	Button b[]=new Button[10];
	Button add,sub,mul,div,clear,mod,eq;
	char op;
		Calculator(){	

		f=new Frame("Calculator");
		f.resize(500,500);
		Color k=new Color(120,89,90);
		f.setBackground(k);
		t1=new TextField(10);
		GridLayout g1=new GridLayout(2,0);
		f.setLayout(g1);
		f.add(t1);
		for(int i=0;i<10;i++)
			b[i]=new Button(" "+i);
		add=new Button("+");
		sub=new Button("-");
		mul=new Button("x");
		div=new Button("/");
		clear=new Button("Clear");
		mod=new Button("%");
		eq=new Button("=");
		t1.addActionListener(this);
		
		for(int i=0;i<10;i++)
			f.add(b[i]);
		f.add(add);
		f.add(sub);
		f.add(mul);
		f.add(mod);
		f.add(clear);
		f.add(eq);
		for(int i=0;i<10;i++)
			b[i].addActionListener(this);
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		mod.addActionListener(this);
		eq.addActionListener(this);
		clear.addActionListener(this);
		f.show();
		f.addWindowListener(this);
	}	
	
public void windowClosing(WindowEvent e){
f.dispose();
}
						//cons ends
public void actionPerformed(ActionEvent ae){			//override action performed

	String str=ae.getActionCommand();
	System.out.println(str);
	char ch=str.charAt(1);

	if(Character.isDigit(ch)){
		t1.setText(str);}
	else{
		if(str.equals("+"))
			{
			System.out.println("in +");
			v1=Integer.parseInt(t1.getText());
			op='+';
			t1.setText(" ");
			}

		else if(str.equals("-"))
		{
		v1=Integer.parseInt(t1.getText());
		op='-';
		t1.setText(" ");
		}

		else if(str.equals("x"))
		{
		v1=Integer.parseInt(t1.getText());
		op='x';
		t1.setText(" ");
		}

		else if(str.equals("/"))
		{
		v1=Integer.parseInt(t1.getText());
		op='/';
		t1.setText(" ");
		}

		else if(str.equals("%"))
		{
			v1=Integer.parseInt(t1.getText());
			op='%';
			t1.setText(" ");
		}
}

if(str.equals("="))
{
System.out.println("in=");
v2=Integer.parseInt(t1.getText());
System.out.println("in="+v2);
if(op=='+')
	result=v1+v2;
else if(op=='-')
	result=v1-v2;
else if(op=='x')
	result=v1*v2;
else if(op=='/')
	result=v1/v2;
else if(op=='%')
	result=v1%v2;

t1.setText(""+result);
}

if(str.equals("clear")){
	t1.setText("");}

}


	public static void main(String[] arg){
	new Calculator();

	}
}

/*
<html>
<body>
<applet code="Calculator.class" width="300" height="300">
</applet>
</body>
</html>

*/

		
		