package com.gl.javafsd.paymoney;

import java.util.Scanner;


class Transaction {
	
	
	public static void main(String args[]) throws Exception  
	
	
	{
		
		try (Scanner sc = new Scanner(System.in)) {
			
			
			System.out.println("Enter the size of transaction Array");
			
			int size = sc.nextInt();
			
			int arr[] = new int[size];
			
			System.out.println("Enter the values of Array");
			
			for (int i = 0; i < size; i++)
				
				arr[i] = sc.nextInt();
			
			System.out.println("Enter the total no. of Targets that needs to be achieved");
			
			int targetNo = sc.nextInt();
			
			while (targetNo-- != 0) 
			
			{
				int flag = 0;
				
				long target;
				
				System.out.println("Enter the value of Target");
				
				target = sc.nextInt();
				
				long sum = 0;
				
				for (int i = 0; i < size; i++) 
				
				{
					
					sum += arr[i];
					
					if (sum >= target) 
					{
						
						System.out.println("Target achieved after "+(i + 1) + "transactions ");
						
						flag = 1;
						
						break;
						
					}
					
				}
				
				if (flag == 0) 
				
				{
					
					System.out.println(" Given Target is not achieved ");
					
				}
				
			}
			
		}
	}
	
}