import java.io.*;
import java.awt.*;
import java.awt.event.*;
public class StudentFile extends Frame implements ActionListener{

TextField number,name,marks;
Label numberl,namel,marksl;
Button enter,done;
DataOutputStream dos;
public StudentFile(){
	super("Create Student File");

addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent e){
dispose();
}
});

}

public void setup(){
	resize(400,200);
	setLayout(new GridLayout(4,2));
	number=new TextField(25);
	numberl=new Label("Roll Number");
	name=new TextField(25);
	namel=new Label("Name");

	marks=new TextField(25);
	marksl=new Label("Marks");
	enter=new Button("Enter");
	done=new Button("Done");
	add(number);
	add(numberl);
	add(name);
	add(namel);
	add(marks);
	add(marksl);
	add(enter);
	add(done);
	show();
	try{
		FileOutputStream os=new FileOutputStream("student.data");
		DataOutputStream dos= new DataOutputStream(os);
	}
	catch(IOException e){
		System.out.println(e.toString());
		System.exit(1);
	}
}

public void addRecord(){
	int num;
	Double d;
	num=(new Integer(number.getText())).intValue();
	try{
		dos.writeInt(num);
		dos.writeUTF(name.getText());
		d=new Double(marks.getText());
		dos.writeDouble(d.doubleValue());
	}
	catch(IOException ioe){
	number.setText(" ");
	name.setText(" ");
	marks.setText(" ");
	}
}

public void cleanup(){
	if(!number.getText().equals(" ")){
	addRecord();
	}
	try{
	dos.flush();
	dos.close();
	}
	catch(IOException e){
	}
}

public boolean action(Event event,Object o){
	try{
		if(event.target instanceof Button){
		if(event.arg.equals("Enter")){
		addRecord();
		return true;
		}
}
		
	}
	catch(Exception e){
	System.out.println("there is error1"+e);
	}
return super.action(event,o);
}

public boolean handleEvent(Event event){
		
		if(event.target instanceof Button)
			if(event.arg.equals("Done")){
				cleanup();
				System.exit(0);
				return true;
			

		}
		
	return super.handleEvent(event);
}
	public static void main(String[] args){
	StudentFile student=new StudentFile();
	student.setup();
	}
}





