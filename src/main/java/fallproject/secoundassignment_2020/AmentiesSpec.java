package fallproject.secoundassignment_2020;

public class AmentiesSpec implements GeneralSpec {

	private String amenties;

	public AmentiesSpec(String amenties) {
		this.amenties = amenties;
	}

	public boolean isMatched(Home e) {
		boolean y = false ;
		for(String s:e.getAmenties()) {
			if(s.equalsIgnoreCase(amenties)) { y=true;
			break;}}
		return y;
	}
         
}
