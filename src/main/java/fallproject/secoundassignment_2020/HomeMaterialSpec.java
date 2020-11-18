package fallproject.secoundassignment_2020;

public class HomeMaterialSpec implements GeneralSpec {

	private String material;

	public HomeMaterialSpec(String material) {
		this.material = material; 
	}

	public boolean isMatched(Home e) {
		return e.getMaterial().equalsIgnoreCase(material);
	}

}
