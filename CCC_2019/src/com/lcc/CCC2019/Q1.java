package com.lcc.CCC2019;

import java.util.Scanner; 

public class Q1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		int aScore = 0; 
		int bScore = 0; 
		
		aScore += (3 * (Integer.parseInt(in.next()))); 
		aScore += (2 * (Integer.parseInt(in.next())));
		aScore += (1 * (Integer.parseInt(in.next())));
		
		bScore += (3 * (Integer.parseInt(in.next())));
		bScore += (2 * (Integer.parseInt(in.next())));
		bScore += (1 * (Integer.parseInt(in.next())));
		
		if (aScore > bScore)
			System.out.println("A");
		else if (aScore < bScore)
			System.out.println("B");
		else
			System.out.println("T");
		

	}

}
