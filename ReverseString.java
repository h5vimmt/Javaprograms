
public class ReverseString{

public static void main(String s[]){

System.out.println("Program to reverse String:");
String str ="Welcome to Java";
System.out.println("Input string :"+str);
String obj=getReverseString(str);
System.out.println("Reverse of string is :"+obj);
}

public static String getReverseString(String str){

if(str ==null)
	throw new IllegalArgumentException("Null is not valid input");
StringBuilder sb = new StringBuilder();
char strarray[] =str.toCharArray();

for(int i=strarray.length-1;i>=0;i--)
	sb.append(strarray[i]);
return sb.toString();
}	
}