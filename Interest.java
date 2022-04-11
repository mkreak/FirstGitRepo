import java.io.*;
class Interest{
public static void main(String[] args){

double p=0;
double i=0;
int year=0;
try{
DataInputStream in =new DataInputStream(System.in);
String tempstring;
System.out.println("Enter the Principal amount");
System.out.flush();
tempstring=in.readLine();
p=Float.valueOf(tempstring);
System.out.println("Enter the rate of Interest");
System.out.flush();
tempstring=in.readLine();
i=Float.valueOf(tempstring);
System.out.println("Enter the Years");
tempstring=in.readLine();
year=Integer.parseInt(tempstring);
}
catch(Exception e){
System.out.println("exception"+e.getMessage());
}
double total=(p*i*year);
System.out.println("Interest amout is :"+total);
}
}

