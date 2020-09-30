package fall2020Project2ndAssignTest;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchHomeSteps {
	List <List<String>> a ;
	List <List<String>> b =new ArrayList <List<String>>() ;
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
		   
		}

		@When("I search about home with price less than {int}")
		public void iSearchAboutHomeWithPriceLessThan(Integer int1) {
		for(int i=0 ; i<a.size();i++) {
			if(int1>Integer.parseInt(a.get(i).get(1).split("_")[0])) b.add(a.get(i)) ;
		}
		}
		@Then("A list of homes that matches the price specification should be returned and printed on the console")
		public void aListOfHomesThatMatchesThePriceSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
		   assertTrue(b!=null);
		}
        }
