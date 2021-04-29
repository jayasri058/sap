package com.interviewtask;

import java.util.Arrays;
import java.util.Scanner;
public class hollowDaimond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter input:");
		int n=s.nextInt();
		for(int i=1; i<=n; i++){
			for(int j=1; j<=(2*n);j++){
				if(i>(n-j+1))
				{
					
					System.out.print(" ");
				}
				else
					System.out.print("*");
				
				if((i+n)>j)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
			
			/*int arr[]=new int[n];
			for(int k=1;k<=n;k++){
				
				
				if(arr[k]==*)
					count++;
			}*/
			
		}
		
		for(int i=1; i<=n; i++){
			for(int j=1; j<=(2*n);j++){
				if(i<j)
				{
					System.out.print(" ");
				}
				else
					System.out.print("*");
				
				if(i<=((2*n))-j)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
			
			

		}
		/*int count=0;
		
		int arr[]=new int[n];
		
		for(int k=0;k<=n;k++)
			
			
			if( arr[k]=='*')
				count++;
		
		
		System.out.println("Total number of stars are:"+count);*/
		
		
	}

}
