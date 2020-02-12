import java.util.Scanner; 

public class JQ1 {
	
	public static void Main(String[] args) {
		Scanner in = new Scanner(System.in); 
		
		int S = Integer.parseInt(in.nextLine()); 
		int M = Integer.parseInt(in.nextLine()); 
		int L = Integer.parseInt(in.nextLine()); 
		
		int total = 1*S + 2*M + 3*L; 
		
		if(total >= 10)
			System.out.println("happy");
		else
			System.out.println("sad");
		
	}

}
