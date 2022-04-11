class Commandline{
public static void main(String [] a)
{

if(a.length>0)
{
System.out.print("Command Lines Argument: ");
for(String str:a)
System.out.print(" "+str);
}
else
{System.out.print("No Command Lines");
}

}
}