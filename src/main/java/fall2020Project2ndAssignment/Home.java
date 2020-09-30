package fall2020Project2ndAssignment;

public class Home {
private String type ;
private String material ;
private String place ;
private boolean pets ;
private int price ;
private float area ;
private int bathroomCount ;
private int bedroomCount ;
private int leaseLength ;
String [] amenties ;
public String getType() {
	return type;
}
public String getMaterial() {
	return material;
}
public String getPlace() {
	return place;
}
public boolean isPetsAllowed() {
	return pets;
}
public int getPrice() {
	return price;
}
public float getArea() {
	return area;
}
public int getBathroomCount() {
	return bathroomCount;
}
public int getBedroomCount() {
	return bedroomCount;
}
public int getLeaseLength() {
	return leaseLength;
}
public String[] getAmenties() {
	return amenties;
} 
public Home(String details, String values) {
	String de[] = details.split("_");
	String va[] = values.split("_");
	this.type =de[0];
	this.material =de[1];
	this.place=de[2];
	this.pets = de[3].equalsIgnoreCase("yes");
	this.amenties = new String [de.length-4];
	for(int i=0;i<de.length-4;i++) this.amenties[i]= de[i+4] ;
	
	
}
}
