import java.util.Scanner; 

public class SQ1 {

		Scanner in = new Scanner(System.in); 

		public static void main(String[] args) {
			Scanner in = new Scanner(System.in); 
			int numObservations = Integer.parseInt(in.next()); 
			
			int[][] observations = new int[numObservations][]; 
			
			
			for (int i = 0; i < numObservations; i++) { 
				int[] curr = new int[2]; 
				curr[0] = Integer.parseInt(in.next()); 
				curr[1] = Integer.parseInt(in.next()); 
				observations[i] = curr; 
			}
			
			observations = sort(observations); 
			
			double max = Math.abs(observations[1][1] - observations[0][1])/
						Math.abs(observations[1][0] - observations[0][0]); 
			
			for(int i = 1; i < observations.length - 1; i++) {
				double speed = Math.abs((double)(observations[i+1][1] - observations[i][1]))/
								Math.abs((double)(observations[i+1][0] - observations[i][0])); 
				if(speed > max)
					max = speed; 
			}
			
			System.out.println(max);

		}

		public static int[][] sort(int[][] observations) {
			int n = observations.length; 
	        for (int i = 1; i < n; ++i) { 
	            int[] key = observations[i]; 
	            int j = i - 1; 
	  
	            /* Move elements of observations[0..i-1], that are 
	               greater than key, to one position ahead 
	               of their current position */
	            while (j >= 0 && observations[j][0] > key[0]) { 
	                observations[j + 1] = observations[j]; 
	                j = j - 1; 
	            } 
	            observations[j + 1] = key; 
	        }
			return observations; 
	    } 
	}