package balloon;

public class Order {
	private Occasion occasion;
	private int balloonsCount;

	public Order() {
	}

	public Order(Occasion occasion, int balloonsCount) {
		this.occasion = occasion;
		this.balloonsCount = balloonsCount;
	}

	public Occasion getOccasion() {
		return occasion;
	}

	public void setOccasion(Occasion occasion) {
		this.occasion = occasion;
	}

	public int getBalloonsCount() {
		return balloonsCount;
	}

	public void setBalloonsCount(int balloonsCount) {
		this.balloonsCount = balloonsCount;
	}

}
