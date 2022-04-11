import java.util.*;

class Special_Number
{
public static void main(String [] args)
{
System.out.print("Enter the Number ");
Scanner sc=new Scanner(System.in);
int n =sc.nextInt();
int a=0,s=0,temp=n;
while(n%10>0)
{
a=n%10;
n=n/10;
for(int i=a-1;i>0;i--)
a=a*i;

s=s+a;
System.out.println(s);
}
if(s==temp)

System.out.print("Number is Special");

else
System.out.print("Number is not Special");

}
}




