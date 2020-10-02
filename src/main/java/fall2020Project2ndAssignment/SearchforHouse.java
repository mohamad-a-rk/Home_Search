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
 public ArrayList<Home> doesIthas(ArrayList <Home> a,String b){
	ArrayList <Home> res = new ArrayList<Home>();
	boolean y = false ; 
	for(Home e:a) {
		y = false ;
		for(String s:e.getAmenties()) {
			if(s.equalsIgnoreCase(b)) { y=true;
			break;}
		}
		if(y) res.add(e) ;
	}
	return res;
}
public boolean equalResults(ArrayList <Home> res,ArrayList <Home> shouldRes) {
	if(res.size()!=shouldRes.size()) return false ; 
	for(int i=0;i<res.size();i++) {
		if(!(res.get(i).equals(shouldRes.get(i)))) return false ;
	}
	return true ; 
}
public  void printRes(ArrayList <Home> a) {
	for(Home q:a) {
		System.out.println(a);
	}
}
}
