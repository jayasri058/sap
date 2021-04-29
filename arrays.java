package com.interviewtask;
import java.util.Arrays;
import java.util.Scanner;
public class arrays {
	public static void main(String[] args){
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no.of elements in array:");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter all the elements:");
		for(int i=0; i<n; i++){
			a[i]=s.nextInt();
		}
		int b[]=new int[n-1];
		//int x=0;
		for(int j=0;j<b.length-1;j++)
		{
			b[j]=a[j]-a[j+1];
		}
		Arrays.sort(b);
		System.out.println(b[b.length-1]);
		
		
	}
	
	
	

}
