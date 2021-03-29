import java.util.*;

public class q1 {

     public static void main(String []args){
        
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        
        String[] st = new String[num+1];
        
        for (int i = 0; i <= num; i++){
            st[i] = s.nextLine();
        }
  
        HashMap<String, Integer> animal = new HashMap<String, Integer>();
        animal.put("Ox", 1);
        animal.put("Tiger", 2);
        animal.put("Rabbit", 3);
        animal.put("Dragon", 4);
        animal.put("Snake", 5);
        animal.put("Horse", 6);
        animal.put("Goat", 7);
        animal.put("Monkey", 8);
        animal.put("Rooster", 9);
        animal.put("Dog", 10);
        animal.put("Pig", 11);
        animal.put("Rat", 12);
        
        String[] cs = new String[100];
        cs[0] = "Bessie";
        int[] c = new int[100];
        c[0] = 0;
        String[] a = new String[100];
        a[0] = "Ox"; 
        
        
        for (int i = 0; i <= num; i++){
        	
        	String[] aos = st[i].split("\\ ", 9);
        	System.out.println(aos.length);
        	cs[i+1] = aos[0];    
        	a[i+1] = aos[4];
        	int temp = 0;
        	for (int t = 0; t < 100; t++) {
        		if (cs[t] == aos[7]) {
        			temp = t;
        		}
        	}
        	
        	int dis = Math.abs(animal.get(aos[4]) - animal.get(a[temp]));
        	
        	if (aos[3] == "previous") {
        		c[i+1] = c[temp] - dis; 
        	}
        	else {
        		c[i+1] = c[temp] + dis;
        	}
        	
        }
        
        for (int i = 0; i < c.length; i++) {
        	System.out.println(c[i]);
        }
     }
     
}
