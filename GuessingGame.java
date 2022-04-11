import javax.swing.*;
public class GuessingGame{
public static void main(String [] args){
int compnum=(int)(Math.random()*100+1);
int userans=0;
System.out.println("The correct Guess would be"+compnum);
int count=1;
while(userans!=compnum){
String response=JOptionPane.showInputDialog(null,"Enter guess between 1 and 100","Guessing Game",3);
userans=Integer.parseInt(response);
JOptionPane.showMessageDialog(null,""+determineGuess(userans,compnum,count));
count++;
}
}
public static String determineGuess(int userans, int compnum ,int count){
if(userans <=0 ) {
return "Your guess is invalid";
}

else if(userans >100) {
return "Your guess is invalid";
}
else if(userans== compnum){
return "correct\n Total Guesses:"+count;
}
else if(userans>compnum){
return "Your guess is too high"+count;
}
else if(userans<compnum){
return "Your guess is too low"+count;
}
else{
return "Your Guess is incorrect:"+count;
}
}
}
