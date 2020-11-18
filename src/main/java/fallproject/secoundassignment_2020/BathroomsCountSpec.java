package fallproject.secoundassignment_2020;

public class BathroomsCountSpec implements GeneralSpec {
	int count;
	public BathroomsCountSpec(int count) {
		this.count=count;
	}
	public boolean isMatched(Home e) {
		return e.getBathroomCount()==count;
	}

}
