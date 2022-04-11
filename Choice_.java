import java.util.*;
import java.lang.*;

class Choice_ {

public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
System.out.println("Press 1 for addition");
System.out.println("Press 2 for Substraction");
System.out.println("Press 3 for Division");
System.out.println("Press 4 for Multiplication");
System.out.println("Press 5 for Exit");
System.out.println("Enter the Choice");

int c=sc.nextInt();
int a,b,s=0;
System.out.print("Enter two Numbers:");
a=sc.nextInt();
b=sc.nextInt();
try{
switch(c){
case 1: s=a+b;
break;
case 2: s=a-b; 
break;
case 3: s=a/b; 
break;
case 4: s=a*b;
break;
	}
}
catch(Exception e){
System.out.print("Enter a non Zero Number");

}
	

System.out.print("Result:"+s);


}
}


