import java.io.*;

class InputTest{

public static void main(String[] args){

int size;
try{
FileInputStream fin;
fin=new FileInputStream("C:/Users/Acer/Documents/Demo/abc.txt");
size=fin.available();
System.out.println("Total Bytes:"+ size);
System.out.println("using read");
for(int i=0;i<size/4;i++){
System.out.println((char)fin.read());
}

System.out.println("Remaining Bytes"+fin.available());

byte b[]=new byte[size/4];
if(fin.read(b)!=b.length){
System.out.println("File reading error");
}
else{
String temp=new String(b,0,0,b.length);
System.out.println(temp);
System.out.println("still available"+fin.available());
}
fin.close();
}
catch(Exception e){
System.out.println("THE EXCEPTION"+e);
}

}
}
