package com.lcc.CCC2019;
import java.util.Scanner; 
public class Q3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		int d = Integer.parseInt(in.next());
		for(int i = 0; i < d; i++) {
			String output = ""; 
			String curr = in.next(); 
			int count = 0; 
			String k = curr.substring(0, 1); 
			for(int j = 0; j < curr.length(); j++) {
				if(!curr.substring(j, j + 1).equals(k)) {
					output += count + " " + k + " "; 
					count = 0; 
					k = curr.substring(j, j + 1); 	
				}
				count++; 	
			}
			output += count + " " + k + " ";
			System.out.println(output);
		}

	}

}
