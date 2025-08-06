package myproject;

public class stringExample 
{
	public static void main(String args[])
	{
		String str="hello this is java class";
		String str1="hello";
		String str2="HELLO";
		String str3="hi how are you";
		String str4="hello";
		String str5="1234";
		String str6="Java234";
		String str7="";
		String str8=" hello java ";
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.charAt(7));
		System.out.println(str1.compareTo(str4));
		System.out.println(str.compareToIgnoreCase(str2));
		System.out.println(str1.concat(str3));
		System.out.println(str1.contains("hel"));
		System.out.println(str.contentEquals(str4));
		System.out.println(str1.endsWith("lo"));
		System.out.println(str1.equals(str3));
		System.out.println(str1.indexOf('l'));
		System.out.println(str1.matches("[a-zA-Z]+"));
		System.out.println(str5.matches("[0-9]+"));
		System.out.println(str6.matches("[a-zA-Z]+\\d+"));
		System.out.println(str7.isEmpty());
		System.out.println(String.join("|", str2,str3,str4));
		System.out.println(str1.lastIndexOf('l'));
		System.out.println(str.replace('l','p'));
		System.out.println(str1.replaceFirst("hel","tro"));
		String str10="hi;how;are;you";
		String str11[]=str10.split(";");
		for (String i:str11)
		{
			System.out.println(i);
		}
		
		System.out.println(str6.startsWith("j"));
		System.out.println(str.subSequence(5,12));
		char arr[]=str4.toCharArray();  
	}
}
