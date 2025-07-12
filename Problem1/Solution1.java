import java.util.*;

public class Solution1 {
	
	public static void main(String args[]) {
		 
		int[] itemId = {5001, 5002, 5003, 5004, 5005};
		double[] prices =  {100, 200, 150, 300, 50};
		int[] quantities = {3, 1, 4, 5, 6};
		double total_price = 0;
		
		for (int i=0; i<itemId.length; i++) {
			
			double price = prices[i] * quantities[i];
			
			if (itemId[i] == 5004 || itemId[i] == 5005) {
				price = prices[i] - prices[i]*0.2; 
			}
			
			total_price += price;
		}
		
		System.out.println(total_price); 
 		
	}
 
}