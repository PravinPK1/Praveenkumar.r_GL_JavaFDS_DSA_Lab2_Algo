package com.gl.javafsd.traveller;

import java.util.Scanner;

public class DenominationCalculator {
	Scanner sc = new Scanner(System.in);
	private int tempAmount;
	int amountToBePaid;

	public void calculate(int[] denominations, int amountToBePaid) {

		System.out.println("Enter the amount you want to pay ");
		amountToBePaid = sc.nextInt();

		int len = denominations.length;

		tempAmount = amountToBePaid;

		int quotient = tempAmount / denominations[len-1];

		int remainder = tempAmount % denominations[len-1];

		for(int i=(len-1);i>0;i--) {

			do {
				if(quotient > 0) {
					
					System.out.println( "Your payment approach in order to give min no.of notes will be");
					
					System.out.println(denominations[i]+" : "+quotient);
				}
				
			}
			
			while(tempAmount==0);

			tempAmount = tempAmount - (quotient*denominations[i]);
			quotient = tempAmount / denominations[i-1];
			remainder = tempAmount % denominations[i-1];
		}
		
		
		if(remainder >= 0) {
			System.out.println(denominations[0]+ " : "+quotient);	
		}
	}

	public static void main(String[] args) {

		DenominationSorting obj = new DenominationSorting();
		obj.implementation();

		DenominationCalculator obj2 = new DenominationCalculator();
		obj2.calculate(obj.denominations, obj2.amountToBePaid);

	}

}