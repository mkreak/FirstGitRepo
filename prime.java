import java.util.*;

class prime{

public static void main(String [] arg){

System.out.print("Enter the number ");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=2;i<n-1;i++)
{
if(n%i==0)
{ 
System.out.print(" Number is not Prime");
return;
}
}
System.out.print("Number is Prime");
}
}
