package fall2020Project2ndAssignment;

import java.util.ArrayList;

public class SearchforHouse {
 public ArrayList<Home> hasNumofbedrooms(ArrayList <Home> a,int b){
	ArrayList <Home> res = new ArrayList<Home>(); 
	for(Home e:a) {
		if(e.getBedroomCount()==b) res.add(e) ;
	}
	return res;
}
 public ArrayList<Home> hasNumofbathrooms(ArrayList <Home> a,int b){
	ArrayList <Home> res = new ArrayList<Home>(); 
	for(Home e:a) {
		if(e.getBathroomCount()==b) res.add(e) ;
	}
	return res;
}
 public ArrayList<Home> allowsPets(ArrayList <Home> a){
	ArrayList <Home> res = new ArrayList<Home>(); 
	for(Home e:a) {
		if(e.isPetsAllowed()) res.add(e) ;
	}
	return res;
}
 public ArrayList<Home> canRentFor(ArrayList <Home> a,int b){
	ArrayList <Home> res = new ArrayList<Home>(); 
	for(Home e:a) {
		if(e.getLeaseLength()==b) res.add(e) ;
	}
	return res;
}
public  void printRes(ArrayList <Home> a) {
	for(Home q:a) {
		System.out.println(a);
	}
}
public ArrayList<Home> PriceOfHome(ArrayList <Home> a,int x){
	ArrayList <Home> res = new ArrayList<Home>(); 
	for(Home e:a) {
		if(e.getPrice()==x) res.add(e) ;
	
	}
	return res;
}
public ArrayList<Home> typeHome(ArrayList <Home> a,String c){
	ArrayList <Home> res = new ArrayList<Home>(); 
	for(Home e:a) {
		if(e.getType()==c) res.add(e) ;
	}
	return res;
}
public ArrayList<Home> PlacementOfHome(ArrayList <Home> a,String c){
	ArrayList <Home> res = new ArrayList<Home>(); 
	for(Home e:a) {
		if(e.getPlace()==c) res.add(e) ;
	}
	return res;
}
public ArrayList<Home> MaterialHome(ArrayList <Home> a,String c){
	ArrayList <Home> res = new ArrayList<Home>(); 
	for(Home e:a) {
		if(e.getMaterial()==c) res.add(e) ;
	}
	return res;
}
public ArrayList<Home> ArreaOfHome(ArrayList <Home> a,float d){
	ArrayList <Home> res = new ArrayList<Home>(); 
	for(Home e:a) {
		if(e.getArea()==d) res.add(e) ;
	}
	return res;
}
public ArrayList<Home> RangePriceOfHome(ArrayList <Home> a,int x,int y){
	ArrayList <Home> res = new ArrayList<Home>(); 
	for(Home e:a) {
//		if(e) res.add(e) ;
	
	}
	return res;
}

}
