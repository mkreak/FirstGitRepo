
import java.util.*;
class Largest{

public static void main(String [] arg){
int a,b,c,l=0;

System.out.print("Enter three Numbers:");
Scanner s= new Scanner(System.in);
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
l=(a>b)?((a>c)?a:c):((b>c)?b:c);


System.out.print("Largest Number is :  "+l); 

}
}
