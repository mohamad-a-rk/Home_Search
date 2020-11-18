package fallproject.secoundassignment_2020;

public class LeaseLengthSpec implements GeneralSpec {

	private int length;

	public LeaseLengthSpec(int length) {
		this.length = length;
	}

	public boolean isMatched(Home e) {
		return e.getLeaseLength()==this.length;
	}

}
