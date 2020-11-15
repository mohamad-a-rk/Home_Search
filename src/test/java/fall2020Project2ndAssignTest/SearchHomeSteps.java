package fall2020Project2ndAssignTest;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;

import fall2020Project2ndAssignment.Home;
import fall2020Project2ndAssignment.SearchforHouse;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchHomeSteps {
	List <List<String>> a ;
	ArrayList <Home> houses = new ArrayList<Home>();
	List<Home> res = new ArrayList<Home>();
	SearchforHouse s = new SearchforHouse();
	ArrayList <Home> shouldRes = new ArrayList<Home>();
	
	    
		@Given("these homes are contained in the system")
		public void theseHomesAreContainedInTheSystem(io.cucumber.datatable.DataTable dataTable) {
		    // Write code here that turns the phrase above into concrete actions
		    // For automatic transformation, change DataTable to one of
		    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		    // Double, Byte, Short, Long, BigInteger or BigDecimal.
		    //
		    // For other transformations you can register a DataTableType.
		   a   = dataTable.asLists() ;
		   for(int i=0;i<a.size();i++) {
			   houses.add(new Home(a.get(i).get(0),a.get(i).get(1))) ;
		   }

		  
		} 
		@BeforeClass
		public void res() {
			shouldRes.clear();
		}
		@When("I search about home with price less than {int}")
		public void iSearchAboutHomeWithPriceLessThan(Integer int1) {
		 res=(ArrayList<Home>) s.rangePriceOfHome(houses,0, int1);
		 shouldRes.add(new Home("APARTMENT_BRICK_CITY_NO_ELEVATOR","230_120_4_2_12"));
		 System.out.println("When I searched for a house that price is less than 400");
			
		}       

@When("I search about home with {int} bed rooms")
public void iSearchAboutHomeWithBedRooms(Integer int1) {
	res = (ArrayList<Home>) s.hasNumofbedrooms(houses, int1);
	shouldRes.add(new Home("HOUSE_WOOD_VILLAGE_NO_GARAGEPARKING,FIREPLACE,ELEVATOR","510_150_3_2_6"));
	System.out.println("When I searched for a house that has 3 Bedrooms");
}

@Then("A List of homes that matches the specification should be printed")
public  void aListOfHomesThatMatchesTheSpecificationShouldBePrinted() { 
	s.printRes(res);
	assertTrue(s.equalResults(res, shouldRes));
	
}


@When("I search about home with {int} bathrooms")
public void iSearchAboutHomeWithBathrooms(Integer int1) {
	res = (ArrayList<Home>) s.hasNumofbathrooms(houses, int1);
	shouldRes.add(new Home("HOUSE_WOOD_VILLAGE_NO_GARAGEPARKING,FIREPLACE,ELEVATOR","510_150_3_2_6"));
	shouldRes.add(new Home("APARTMENT_BRICK_CITY_NO_ELEVATOR","230_120_4_2_12"));
	System.out.println("When I searched for a house that has 2 bathrooms");
	
   }

@When("I search about home by place {string}")
public void iSearchAboutHomeByPlace(String string) {
	res=s.placementOfHome(houses, string);
	shouldRes.add(new Home("HOUSE_WOOD_VILLAGE_NO_GARAGEPARKING,FIREPLACE,ELEVATOR","510_150_3_2_6"));
	System.out.println("When I searched for a house that is in a village");
}

@When("I search about home by material {string}")
public void iSearchAboutHomeByMaterial(String string) {
	res=(ArrayList<Home>) s.materialHome(houses, string);
	System.out.println("When I searched for a house that it's material is wood");
	shouldRes.add(new Home("HOUSE_WOOD_VILLAGE_NO_GARAGEPARKING,FIREPLACE,ELEVATOR","510_150_3_2_6"));
}



/////////Price_Month Range   
@When("I search about home with price range {int} to {int}")  
public void iSearchAboutHomeWithPriceRange (Integer int1,Integer int2) {
	res=s.rangePriceOfHome(houses, int1, int2);
	shouldRes.add(new Home("HOUSE_WOOD_VILLAGE_NO_GARAGEPARKING,FIREPLACE,ELEVATOR","510_150_3_2_6"));
	System.out.println("When I searched for a house that price is between 500 and 700");
	
}
@When("I search about home with area  {int}")
public void iSearchAboutHomeWithArea(Integer int1) {
	res=s.areaOfHome(houses, 0,int1);
	System.out.println("When I searched for a house that area is less than 160");
	shouldRes.add(new Home("HOUSE_WOOD_VILLAGE_NO_GARAGEPARKING,FIREPLACE,ELEVATOR","510_150_3_2_6"));
	shouldRes.add(new Home("APARTMENT_BRICK_CITY_NO_ELEVATOR","230_120_4_2_12"));
}

////area range  
@When("I search about home with area range {int} to {int}")  
public void iSearchAboutHomeWithAreaRange (Integer int1,Integer int2) {
	res=s.areaOfHome(houses, int1,int2);
	System.out.println("When I searched for a house that area is between 150 &200");
	shouldRes.add(new Home("HOUSE_WOOD_VILLAGE_NO_GARAGEPARKING,FIREPLACE,ELEVATOR","510_150_3_2_6"));

}

@When("I search about home that allows pets")
public void iSearchAboutHomeThatAllowsPets() {
	res = s.allowsPets(houses); 
	System.out.println("When I searched for a house that Allows pets");
}

@When("I search about home with {int} months of lease")
public void iSearchAboutHomeWithMonthsOfLease(Integer int1) {
	res = s.canRentFor(houses,int1);
	System.out.println("When I searched for a house that lease length is short term (6 months)");
	shouldRes.add(new Home("HOUSE_WOOD_VILLAGE_NO_GARAGEPARKING,FIREPLACE,ELEVATOR","510_150_3_2_6"));
}

@When("I search about home that has an {string}")
public void iSearchAboutHomeThatHasAn(String string) {
    res = s.doesIthas(houses, string);
    System.out.println("When I searched for a house that has a fireplace");
    shouldRes.add(new Home("HOUSE_WOOD_VILLAGE_NO_GARAGEPARKING,FIREPLACE,ELEVATOR","510_150_3_2_6"));
}



@When("I search about home by type {string}")
public void iSearchAboutHomeByType(String string) {
    res = s.typeHome(houses, string);
    System.out.println("When I searched for a house that type is a house");
    shouldRes.add(new Home("HOUSE_WOOD_VILLAGE_NO_GARAGEPARKING,FIREPLACE,ELEVATOR","510_150_3_2_6"));
}

@When("I search about house that it price less than {int} and has {int} bathrooms")
public void iSearchAboutHouseThatItPriceLessThanAndHasBathrooms(Integer int1, Integer int2) {
    res=s.rangePriceOfHome(houses, 0, int1);
    res=s.hasNumofbathrooms(res, int2);
    System.out.println("When I searched for a house that price is less than 300 and has a 2 bathrooms");
	shouldRes.add(new Home("APARTMENT_BRICK_CITY_NO_ELEVATOR","230_120_4_2_12"));

}



}

