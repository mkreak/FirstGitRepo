class T1 extends Thread{
public void run(){
	for(int i=1;i<=3;i++)
	System.out.println("Thread 1 "+i);
	System.out.println("Exit 1");
}
}

class T2 extends Thread{
public void run(){
	for(int j=4;j<=6;j++)
	System.out.println("Thread 2 "+j);
	System.out.println("Exit 2");
}
}

class T3 extends Thread{
public void run(){
	for(int k=7;k<=9;k++)
	System.out.println("Thread 3 "+k);
	System.out.println("Exit 3");
}
}
class MultithreadDemo {
public static void main( String [] args){
T1 a=new T1();
T2 b=new T2();
T3 c=new T3();
a.start();
b.start();
c.start();
System.out.println("End Multithreading");
}
}


