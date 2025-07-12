import java.util.*;

public class Solution2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] itemId = {5001, 5002, 5003, 5004};
		double[] prices = {100, 200, 150, 300, 50};
		int[] returnedQuantities = new int[itemId.length];
		
		System.out.println("Enter the quantity of the returned item based on the itemId starts from 5001 to 5004");
		
		for (int i=0; i<itemId.length; i++) {
			returnedQuantities[i] = scan.nextInt();
		}
		
		double totalRefund = 0;
		
		for (int i=0; i<itemId.length; i++) {
			double price = prices[i];
			
			if (itemId[i] == 5004 || itemId[i] == 5005) {
				price *= 0.8;
			}
			 
			double refund = price * returnedQuantities[i];
			
			totalRefund += refund;
		}
		
		
		System.out.println(totalRefund);
	}

}