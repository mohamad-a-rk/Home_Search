package fall2020Project2ndAssignment;

public class HomeTypeSpec implements GeneralSpec {

	private String type;

	public HomeTypeSpec(String type) {
		this.type = type;
	}

	public boolean isMatched(Home e) {
		return e.getType().equalsIgnoreCase(type);
	}

}
