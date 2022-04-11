import java.io.*;
class FileTest{

public static void main(String[] args){
File check;
if(args.length>0){
for(int i=0;i<args.length;i++)
{
check=new File(args[i]);
getPaths(check);
getInfo(check);
}
}
else{
System.out.println("java file test");
}

public static void getPaths(File f) throws IOException{
System.out.println("Name :"+f.getName());
System.out.println("Path :"+f.getPath());
System.out.println("Parents :"+f.getParent());
}

public static void getInfo(File f) throws IOException{
if(f.exists){
System.out.println("File exists");
}
else{
System.out.println("File does not exists");
}
}
}
}
