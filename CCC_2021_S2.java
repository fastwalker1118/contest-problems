import java.util.*;

public class main {
	
public static void main (String args[]) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); // 4
		int m = s.nextInt(); // 5
		int k = s.nextInt(); // 7
		
		ArrayList<Integer> arrR = new ArrayList();
		ArrayList<Integer> arrC = new ArrayList();
		
 		for (int i = 0; i < k; i++) {
 			if (s.next().charAt(0) == 'R') {
 				arrR.add(s.nextInt());
 			}
 			else {
 				arrC.add(s.nextInt());
 			}
 		}
 		
 		ArrayList<Integer> copy = arrR; // 2 2 3 4
		Collections.sort(copy);
		ArrayList<Integer> copy2 = arrC; // 1 1 2
		Collections.sort(copy2);
		
		int[] r = new int[n]; // 0 2 1 1
		int[] c = new int[m]; // 2 1 0 0 0

		
		for (int i = 0; i < arrR.size(); i++) {
			r[arrR.get(i)-1] += 1;
		}
		
		for (int i = 0; i < arrC.size(); i++) {
			c[arrC.get(i) - 1] += 1;
		}
		
		
		for (int i = 0; i < r.length; i++) {
			if (r[i] != 1  && r[i] != 0) {
				if (r[i] % 2 == 0) {
					r[i] = 0;
				}
				if (r[i] % 2 == 1) {
					r[i] = 1;
				}
			}
		}
		for (int i = 0; i < c.length; i++) {
			if (c[i] != 1  && c[i] != 0) {
				if (c[i] % 2 == 0) {
					c[i] = 0;
				}
				if (c[i] % 2 == 1) {
					c[i] = 1;
				}
			}
		}
		
		int[][] grid = new int[n][m]; 

		int count = 0;
		
		for (int i = 0; i < r.length; i++) {
			if (r[i] == 1) {
				for (int j = 0; j < m; j++) {
					if (grid[i][j] == 0) {
						grid[i][j] = 1; 
						count += 1;
					}
					else {
						grid[i][j] = 0;
						count -= 1;
					}			
				}
			}
		}
		for (int i = 0; i < c.length; i++) {
			if (c[i] == 1) {
				for (int j = 0; j < n; j++) {
					if (grid[j][i] == 0) {
						grid[j][i] = 1;
						count += 1;
					}
					else {
						grid[j][i] = 0;
						count -= 1;
					}			
				}
			}
		}
		System.out.println(count);
	}
}
