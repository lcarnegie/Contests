package com.lcc.CCC2019;
import java.util.Scanner; 
public class Q4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		String hi = in.nextLine(); 
		int[][] arr = new int[2][2]; 
		arr[0][0] = 1; 
		arr[0][1] = 2; 
		arr[1][0] = 3; 
		arr[1][1] = 4; 
		int noH = 0; 
		int noV = 0; 
		for(int i = 0; i < hi.length(); i++) {
			if(hi.substring(i, i + 1).equals("H"))
				noH++; 
			if(hi.substring(i, i + 1).equals("V"))
				noV++; 
		}
		if(noH % 2 == 0)
			noH = 0; 
		if(noV % 2 == 0)
			noV = 0; 
		if(noH % 2 != 0)
			noH = 1; 
		if(noV % 2 != 0)
			noV = 1; 
		
		if(noV != 0) {
			int temp = arr[0][0]; 
			arr[0][0] = arr[0][1]; 
			arr[0][1] = temp; 
			temp = arr[1][0]; 
			arr[1][0] = arr[1][1]; 
			arr[1][1] = temp;
		}
		if(noH != 0) {
			int temp = arr[0][0]; 
			arr[0][0] = arr[1][0]; 
			arr[1][0] = temp; 
			temp = arr[0][1]; 
			arr[0][1] = arr[1][1]; 
			arr[1][1] = temp;
		}
		System.out.printf("%d %d\n%d %d",arr[0][0], arr[0][1], arr[1][0], arr[1][1]);

	}

}
