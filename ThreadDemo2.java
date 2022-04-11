class ThreadDemo2 extends Thread{
public void run(){
for(int i=1;i<4;i++){
System.out.println(i);
try{
sleep((int)(Math.random()*5000));
}
catch(InterruptedException e){
System.out.println("in catch"+i);
}
}
}


public static void main(String [] args){

new ThreadDemo2().start();
new ThreadDemo2().start();
System.out.println("End Pg");
}
}
