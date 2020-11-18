package fall2020Project2ndAssignment;

public class HomePlaceSpec implements GeneralSpec {

	private String place;

	public HomePlaceSpec(String place) {
		this.place = place;
	}

	public boolean isMatched(Home e) {
		return e.getPlace().equalsIgnoreCase(place);
	}

}
