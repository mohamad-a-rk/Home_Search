package fallproject.secoundassignment_2020;

public class HomePlaceSpec implements GeneralSpec {

	private String place;

	public HomePlaceSpec(String place) {
		this.place = place;
	}

	public boolean isMatched(Home e) {
		return e.getPlace().equalsIgnoreCase(place);
	}

}
