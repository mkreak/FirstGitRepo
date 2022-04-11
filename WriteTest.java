import java.io.*;
class WriteTest{

public static void main(String [] args){
try{
String hello="hello! Welcome to new program";
FileOutputStream out=new FileOutputStream("C:/Users/Acer/Documents/Demo/hello.txt");
byte b[]=hello.getBytes();

out.write(b);
out.close();
System.out.println("writing is over");
}
catch(IOException ioe){
System.out.println(ioe);
System.out.println(-1);
}
}}
