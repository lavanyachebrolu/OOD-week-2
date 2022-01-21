package balloon;

import java.util.ArrayList;
import java.util.List;

// UserOrders class follows singleton design pattern
public class UserOrders {

	// list to maintain orders
	List<Order> ordersList = new ArrayList<Order>();

	// method to get the list of orders
	public List<Order> getOrders() {
		return this.ordersList;
	}

	// method to place and process the order
	public String placeOrder(Occasion occasion, int balloonsCount) {
		ordersList.add(new Order(occasion, balloonsCount));

		return occasion.designBalloons();
	}

	// method to get the total number of balloons ordered
	public int getBalloonsOrdered() {
		int total = 0;
		if (ordersList.size() > 0) {
			for (int i = 0; i < ordersList.size(); i++) {
				total += ordersList.get(i).getBalloonsCount();
			}
		}
		return total;
	}

}
