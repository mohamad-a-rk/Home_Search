package fall2020Project2ndAssignment;

public class BedroomsCountSpec implements GeneralSpec {

	private int count;

	public BedroomsCountSpec(int count) {
		this.count = count;
	}

	public boolean isMatched(Home e) {
		return e.getBedroomCount()==this.count;
	}

}
