import java.util.*;
class Date_Show{

private int year,day,month;

private boolean checkRange(int num,int low,int high){
return (num>=low && num<=high);
}
private boolean checkLeapYear(int year){
if(year % 4 != 0) {
return false;
}

else if(year % 400 == 0) 
{
return true;
}

else if(year % 100 == 0){
return false;
}
else{
return true;
}

}
private int getDayRange(int month,int year){
int range=31;
switch(month){
case 4: 
case 6:
case 9:
case 11: range=30;																																																																																																											
	 break;
case 2: range=checkLeapYear(year)?29:28 ;
	break;
}
return range;
}
public void readDate(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the year");
year=sc.nextInt();
while(!checkRange(year,1900,2022))
{
System.out.print("Plesae enter Year within range 1900 to 2022");
year=sc.nextInt();
}
System.out.println("Enter the Month");
month=sc.nextInt();
while(!checkRange(month,1,12));
{
System.out.println("Please Enter month with range 1 to 12");
month=sc.nextInt();
}
System.out.println("Enter the Date");
day=sc.nextInt();
int range=getDayRange(month,year);
while(!checkRange(day,1,range)){
System.out.println("Please Enter date with in range 1 to"+range);
day=sc.nextInt();
}
}

private String getMonth(){
String value="January";
switch(month){
case 1: value="January"; break;
case 2: value="February"; break;
case 3: value="March"; break;
case 4: value="April"; break;
case 5: value="May"; break;
case 6: value="June"; break;
case 7: value="July"; break;
case 8: value="August"; break;
case 9: value="September"; break;
case 10: value="October"; break;
case 11: value="November"; break;
case 12: value="December"; break;
}
return value;
}

private String getDayName(){
int td=(year-1)*365;
td+=(year-1)/4 -(year-1)/100 + (year-1)/400;
for(int i=month-1 ;i>=1 ;i--)
td+= getDayRange(i,year);

td+=(day-1);
int rem=td%7;
String val=" ";
switch(rem){
case 0: val="Monday"; break;
case 1: val="Tuesday"; break;
case 2: val="Wednesday"; break;
case 3: val="Thrusday"; break;
case 4: val="Friday"; break;
case 5: val="Saturday"; break;
case 6: val="Sunday"; break;
}
return val;
}

public void displayDate(){
System.out.print("The Date:"+getDayName()+day+" "+getMonth()+","+year);
}
}
		
class Date{
public static void main(String [] args){
Date_Show d= new Date_Show();
d.readDate();
d.displayDate();
}

}