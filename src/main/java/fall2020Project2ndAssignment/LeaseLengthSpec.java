package fall2020Project2ndAssignment;

public class LeaseLengthSpec implements GeneralSpec {

	private int length;

	public LeaseLengthSpec(int length) {
		this.length = length;
	}

	public boolean isMatched(Home e) {
		return e.getLeaseLength()==this.length;
	}

}
