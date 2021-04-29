package com.interviewtask;

import java.util.Scanner;
public class task
{
 public static void main(String args[])
 {
 Scanner s=new Scanner(System.in);
 System.out.println("Enter a string:");
 String str=s.nextLine();
 int len=str.length();
 String rev="";
 
 
 for(int i=len-1;i>=0;i--)
 {
	 rev=rev+str.charAt(i);
 }
 System.out.println("Reverse of "+str+"is:" +rev);
 
 String rev1="";
 rev1=rev;
 String rev1Incremented=new String();
 for(int j=0; j<rev1.length(); j++)
 {
	 rev1Incremented+=(char)(rev1.charAt(j)+1);
 }
 System.out.println("Reverse of "+rev1+"is:" +rev1Incremented);
 
 
 }
}

