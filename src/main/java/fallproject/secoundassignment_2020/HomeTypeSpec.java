package fallproject.secoundassignment_2020;

public class HomeTypeSpec implements GeneralSpec {

	private String type;

	public HomeTypeSpec(String type) {
		this.type = type;
	}

	public boolean isMatched(Home e) {
		return e.getType().equalsIgnoreCase(type);
	}

}
