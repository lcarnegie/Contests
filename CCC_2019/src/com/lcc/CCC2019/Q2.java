package com.lcc.CCC2019;
import java.util.Scanner; 
public class Q2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		int d = Integer.parseInt(in.next()); 
		for (int i = 0; i < d; i++) {
			String j = in.next() + " " + in.next(); 
			int space = j.indexOf(" "); 
			int num = Integer.parseInt(j.substring(0, space));
			String symbol = j.substring(space + 1); 
			for(int q = 0; q < num; q++) {
				System.out.print(symbol);
			}
			System.out.println();
		}
		in.close(); 

	}

}
