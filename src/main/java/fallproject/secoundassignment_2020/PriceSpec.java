package fallproject.secoundassignment_2020;

public class PriceSpec implements GeneralSpec {

	private int price;

	public PriceSpec(int price) {
		this.price = price;
	}

	public boolean isMatched(Home e) {
		return e.getPrice()<price;
	}

}
