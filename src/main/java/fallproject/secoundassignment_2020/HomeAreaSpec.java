package fallproject.secoundassignment_2020;

public class HomeAreaSpec implements GeneralSpec {

	private float area1;
	private float area2;

	public HomeAreaSpec(float area1, float area2) {
		this.area1 = area1;
		this.area2 = area2;
	}

	public boolean isMatched(Home e) {
		return e.getArea()>=area1&&e.getArea()<area2;
	}

}
