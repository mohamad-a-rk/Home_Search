package fall2020Project2ndAssignment;

public class HomePriceRangeSpec implements GeneralSpec {

	private int price1;
	private int price2;

	public HomePriceRangeSpec(int price1, int price2) {
		this.price1 = price1;
		this.price2 = price2;
	}

	public boolean isMatched(Home e) {
		return price1<=e.getPrice()&&e.getPrice()<price2;
	}

}
