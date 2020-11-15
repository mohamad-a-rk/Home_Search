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
	this.amenties = de[4].split(",");
	int val [] = new int [va.length];
	for(int i=0;i<val.length;i++) val[i]=Integer.parseInt(va[i]);
	this.price= val[0];
	this.area = val[1];
	this.bedroomCount=val[2];
	this.bathroomCount =val[3];
	this.leaseLength=val[4];
	}
@Override
public String toString() {
	String a ="";
	a= a+"Home"+" ["+"area="+this.area+" ,price="+this.price+" ,no_of_bedrooms="+this.bedroomCount+" ,lease_length="+this.leaseLength+"]";
	
	return a;
}
public boolean equals(Home h) {
	
	return ((this.pets==h.isPetsAllowed())&&(this.area==h.getArea())&&(this.bathroomCount==h.getBathroomCount())&&
			(this.bedroomCount==h.getBedroomCount())&&(this.leaseLength==h.getLeaseLength())&&
			(this.material.equals(h.getMaterial()))&&(this.place.equals(h.getPlace()))&&(this.price==h.getPrice())&&
			(this.type.equals(h.getType())));
	} 

}
