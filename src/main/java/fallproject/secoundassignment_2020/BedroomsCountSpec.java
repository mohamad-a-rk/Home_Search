package fallproject.secoundassignment_2020;

public class BedroomsCountSpec implements GeneralSpec {

	private int count;

	public BedroomsCountSpec(int count) {
		this.count = count;
	}

	public boolean isMatched(Home e) {
		return e.getBedroomCount()==this.count;
	}

}
