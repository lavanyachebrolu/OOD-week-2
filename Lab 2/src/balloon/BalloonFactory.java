package balloon;

// BalloonFactory class follows the factory design pattern
public class BalloonFactory {

	// method to get the instance of Occasion based on the event
	public Occasion getBalloonByOccasion(String occasion) {
		if (occasion.equalsIgnoreCase("birthday")) {
			return new Birthday();
		} else if (occasion.equalsIgnoreCase("party")) {
			return new Party();
		} else if (occasion.equalsIgnoreCase("wedding")) {
			return new Wedding();
		}
		return null;
	}
}
