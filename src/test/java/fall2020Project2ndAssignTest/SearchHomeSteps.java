package fall2020Project2ndAssignTest;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.BeforeClass;

import fall2020Project2ndAssignment.Home;
import fall2020Project2ndAssignment.SearchforHouse;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchHomeSteps {
	List <List<String>> a ;
	ArrayList <Home> houses = new ArrayList<Home>();
	ArrayList <Home> res = new ArrayList<Home>();
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

		@When("I search about home with price less than {int}")
		public void iSearchAboutHomeWithPriceLessThan(Integer int1) {
		
		}
		@Then("A list of homes that matches the price specification should be returned and printed on the console")
		public void aListOfHomesThatMatchesThePriceSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
		  
		}
        
@When("I search about home with {int} bed rooms")
public void iSearchAboutHomeWithBedRooms(Integer int1) {
	res = s.hasNumofbedrooms(houses, int1);
	shouldRes.add(new Home("HOUSE_WOOD_VILLAGE_NO_GARAGEPARKING,FIREPLACE,ELEVATOR","510_150_3_2_6"));
}

@Then("A List of homes that matches the specification should be printed")
public  void aListOfHomesThatMatchesTheSpecificationShouldBePrinted() { 
	assertEquals(res,shouldRes);	
}


@When("I search about home with {int} bathrooms")
public void iSearchAboutHomeWithBathrooms(Integer int1) {
	res = s.hasNumofbathrooms(houses, int1);
	shouldRes.add(new Home("HOUSE_WOOD_VILLAGE_NO_GARAGEPARKING,FIREPLACE,ELEVATOR","510_150_3_2_6"));
	shouldRes.add(new Home("APARTMENT_BRICK_CITY_NO_ELEVATOR","230_120_4_2_12"));
	
   }

@When("I search about home that allows pets")
public void iSearchAboutHomeThatAllowsPets() {
	res = s.allowsPets(houses); 
}

@When("I search about home with {int} months of lease")
public void iSearchAboutHomeWithMonthsOfLease(Integer int1) {
	res = s.canRentFor(houses,int1);
	shouldRes.add(new Home("HOUSE_WOOD_VILLAGE_NO_GARAGEPARKING,FIREPLACE,ELEVATOR","510_150_3_2_6"));
}

@When("I search about home that has an elevator")
public void iSearchAboutHomeThatHasAnElevator() {
   
}}
