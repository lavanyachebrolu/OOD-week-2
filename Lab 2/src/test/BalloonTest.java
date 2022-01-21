package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import balloon.BalloonFactory;
import balloon.Birthday;
import balloon.Party;
import balloon.UserOrders;
import balloon.Wedding;

public class BalloonTest {

	@Test
	public void testPlaceOrder() {
		BalloonFactory balloonFactory = new BalloonFactory();
		UserOrders userOrders = new UserOrders();
		assertEquals("Status: Balloons ready for Birthday",
				userOrders.placeOrder(balloonFactory.getBalloonByOccasion("birthday"), 5));
		assertEquals("Status: Balloons ready for Wedding",
				userOrders.placeOrder(balloonFactory.getBalloonByOccasion("wedding"), 10));
	}

	@Test
	public void testGetOrders() {
		BalloonFactory balloonFactory = new BalloonFactory();
		UserOrders userOrders = new UserOrders();
		assertEquals("Status: Balloons ready for Party",
				userOrders.placeOrder(balloonFactory.getBalloonByOccasion("party"), 8));
		assertEquals("Status: Balloons ready for Birthday",
				userOrders.placeOrder(balloonFactory.getBalloonByOccasion("birthday"), 5));
		assertEquals("Status: Balloons ready for Wedding",
				userOrders.placeOrder(balloonFactory.getBalloonByOccasion("wedding"), 10));
		assertEquals(3, userOrders.getOrders().size());
	}

	@Test
	public void testGetBalloonsOrdered() {
		BalloonFactory balloonFactory = new BalloonFactory();
		UserOrders userOrders = new UserOrders();
		assertEquals("Status: Balloons ready for Birthday",
				userOrders.placeOrder(balloonFactory.getBalloonByOccasion("birthday"), 25));
		assertEquals("Status: Balloons ready for Party",
				userOrders.placeOrder(balloonFactory.getBalloonByOccasion("party"), 10));
		assertEquals("Status: Balloons ready for Wedding",
				userOrders.placeOrder(balloonFactory.getBalloonByOccasion("wedding"), 15));
		assertEquals(50, userOrders.getBalloonsOrdered());
	}

	@Test
	public void testGetBalloonByOccasion() {
		BalloonFactory balloonFactory = new BalloonFactory();
		assertTrue(balloonFactory.getBalloonByOccasion("birthday") instanceof Birthday);
		assertTrue(balloonFactory.getBalloonByOccasion("party") instanceof Party);
		assertTrue(balloonFactory.getBalloonByOccasion("wedding") instanceof Wedding);
	}
}
