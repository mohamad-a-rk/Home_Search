package fallproject.secoundassignment_2020;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SearchforHouse {
 private EmailSender emailsender;
public List<Home> hasNumofbedrooms(List <Home> a,int count){
	GeneralSpec spe = new BedroomsCountSpec(count);
	 return getResult(a, spe);
}
private List<Home> getResult(List<Home> a, GeneralSpec spe) {
	ArrayList <Home> res = new ArrayList<Home>(); 
	for(Home e:a) {
		if(spe.isMatched(e)) res.add(e) ;
	}
	return res;
}
 public List<Home> hasNumofbathrooms(List <Home> a,int count){
	 GeneralSpec spe = new BathroomsCountSpec(count);
	 return getResult(a, spe);
}
 public List<Home> allowsPets(List <Home> a){
	 GeneralSpec spe = new PetsAllowedCountSpec();
	return getResult(a, spe);
}
 public List<Home> canRentFor(List <Home> a,int length){
	 GeneralSpec spe = new LeaseLengthSpec(length);
	return getResult(a, spe);
} 
 public List<Home> doesIthas(List <Home> a,String amenties){
	 GeneralSpec spe = new AmentiesSpec(amenties);
	return getResult(a, spe);
}
public boolean equalResults(List <Home> res,List <Home> shouldRes) {
	if(res.size()!=shouldRes.size()) return false ; 
	for(int i=0;i<res.size();i++) {
		if(!(res.get(i).areEquals(shouldRes.get(i)))) return false ;
	}
	return true ; 
}
public  void printRes(List <Home> a) {
	Logger logger = Logger.getLogger(SearchforHouse.class.getName());
	for(Home q:a) {
		logger.log(Level.INFO,q.toString());
	}
	if(a.isEmpty()) logger.log(Level.INFO,"Sorry but there is no results matches");
}
public List<Home> priceOfHome(List <Home> a,int price){
	GeneralSpec spe = new PriceSpec(price);
	List<Home> res = getResult(a, spe); 
	this.emailsender.sendEmail(res,"m.kukhun@stu.najah.edu");
	return res ;
}
public List<Home> typeHome(List <Home> a,String type){
	GeneralSpec spe = new HomeTypeSpec(type);
	return getResult(a, spe);
}
public List<Home> placementOfHome(List <Home> a,String place){
	GeneralSpec spe = new HomePlaceSpec(place);
	return getResult(a, spe);
}
public List<Home> materialHome(List <Home> a,String material){
	GeneralSpec spe = new HomeMaterialSpec(material);
	return getResult(a, spe);
}
public List<Home> areaOfHome(List <Home> a,float area1,float area2){
	GeneralSpec spe = new HomeAreaSpec(area1,area2);
	return getResult(a, spe);
}
public List<Home> rangePriceOfHome(List <Home> a,int price1,int price2){
	GeneralSpec spe = new HomePriceRangeSpec(price1,price2);
	List <Home> res ; 
	res =  getResult(a, spe);
	return res ;
}
public void setEmailsender(EmailSender emailsender) {
	this.emailsender = emailsender;
}
public EmailSender getEmailSender() {
	return this.emailsender;
}
}
