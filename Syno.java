class account{
public int bal;
public int accno;
void displaybal(){
System.out.println("Acc No: "+accno+"Bal: "+bal);
}
synchronized  void deposit(int am){
bal+=am;
System.out.println(am+"Amount deposits ");
displaybal();
}
synchronized  void withdraw(int am){
bal-=am;
System.out.println(am+"Amount withdraw");
displaybal();
}

}

class dep implements Runnable{
int am;
account a;
dep(account x, int am){
a=x;
this.am=am;
new Thread(this).start();
}
public void run(){
a.deposit(am);
}
}

class draw implements Runnable{
int am;
account b;
draw(account y,int am){
b=y;
this.am=am;
new Thread(this).start();
}
public void run(){
b.withdraw(am);
}
}

class Syno{
public static void main(String[] args){
account abc=new account();
abc.bal=1000;
abc.accno=123456;
dep t1;
draw t2;
t1=new dep(abc,500);
t2=new draw(abc,700);
t2=new draw(abc,100);
t2=new draw(abc,200);
t1=new dep(abc,100);
}
}


