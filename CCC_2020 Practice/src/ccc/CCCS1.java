package ccc; 
import java.util.Scanner; 
public class CCCS1 {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        String input = hi.next(); 
        int[][] grid2 = flipflop(input);
        for(int i = 0; i < grid2.length; i++){
            for (int j = 0 ; j < grid2[0].length; j++){
                System.out.print(grid2[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] flipflop(String input) {
        int[][] grid = {{1,2}, {3,4}};
        int verticals = 0; 
        int horizontals = 0; 
        for(int i = 0; i < input.length(); i++){
            if(input.substring(i, i+1).equals("V")){
                verticals++; 
            }else{
                horizontals++; 
            }
        }
        if(horizontals % 2 != 0){
            int temp1 = grid[0][1]; 
            int temp2 = grid[1][1]; 
            grid[0][1] = grid[0][0]; 
            grid[1][1] = grid[1][0]; 
            grid[0][0] = temp1;    
            grid[1][0] = temp2;    
        }
        if(verticals % 2 != 0){
            int[] temp = grid[0]; 
            grid[0] = grid[1]; 
            grid[1] = temp; 
        }

        return grid; 
       
    }
}