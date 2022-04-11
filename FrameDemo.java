import java.awt.*;

class FrameDemo{

public static void main(String[] args){

Frame f=new Frame("My Frame");
f.resize(700,700);
f.setBackground(Color.cyan);
Button b=new Button("Click here");
TextField t=new TextField();
Checkbox c1=new Checkbox("check1");
Checkbox c2=new Checkbox("check2");

TextArea ta=new TextArea();
List l1=new List(3);


Label l=new Label("name:");
Scrollbar sb=new Scrollbar();
b.setBounds(60,100,80,30);
l.setBounds(60,100,60,30);
t.setBounds(120,200,60,30);
c1.setBounds(120,300,60,30);
c2.setBounds(120,400,60,30);
ta.setBounds(300,400,60,60);
l1.setBounds(400,200,60,50);
l1.add("l1");
l1.add("l2");
l1.add("l3");

Choice co=new Choice();
co.setBounds(500,300,60,30);
co.add("Choice 1");
co.add("Choice 2");
co.add("Choice 3");
co.add("Choice 4");
sb.setBounds(600,600,60,50);

f.add(b);
f.add(t);
f.add(l);
f.add(c1);
f.add(c2);
f.add(l1);
f.add(ta);
f.add(co);
f.add(sb);

f.show();


}
}