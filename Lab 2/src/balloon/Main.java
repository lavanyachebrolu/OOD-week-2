package balloon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// declaring BufferedReader
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("---------- Bubbly Ballons ----------");

		BalloonFactory balloonFactory = new BalloonFactory();
		UserOrders orders = new UserOrders();

		while (true) {
			// reading count to order
			int count = 0;
			while (true) {
				System.out.print("\nEnter the number of ballons to order: ");
				count = Integer.parseInt(bufferedReader.readLine());
				if (count > 0) {
					break;
				} else {
					System.out.println("Invalid ballons!");
				}
			}

			// reading the occasion type
			int type = 0;
			while (true) {
				System.out.println("Select the occasion type: \n1. Birthday\n2. Party\n3. Wedding");
				type = Integer.parseInt(bufferedReader.readLine());
				if (type == 1 || type == 2 || type == 3) {
					break;
				} else {
					System.out.println("Invalid type!");
				}
			}

			// switching between the different occasions
			Occasion occasion = null;
			if (type == 1) {
				occasion = balloonFactory.getBalloonByOccasion("birthday");
			} else if (type == 2) {
				occasion = balloonFactory.getBalloonByOccasion("party");
			} else if (type == 3) {
				occasion = balloonFactory.getBalloonByOccasion("wedding");
			}

			// placing order
			System.out.println("Order placed and processing in Balloon Factory!\n");
			String status = orders.placeOrder(occasion, count);
			System.out.println(status);

			System.out.println("\n---------------------------------------");

			System.out.println("\nDo you want to place new order? Y/N");
			String choice = bufferedReader.readLine();

			if (!choice.equalsIgnoreCase("y")) {
				break;
			}

		}

		System.out.println("\nThe total number of balloons ordered in this session: " + orders.getBalloonsOrdered());
	}

}
