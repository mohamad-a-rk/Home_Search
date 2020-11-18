package fallproject.secoundassignment_2020;

public class CompoundSpec implements GeneralSpec {
    GeneralSpec [] speces ;
    public CompoundSpec(GeneralSpec[] speces) {
	 this.speces = speces ;
	}
	public void setSpeces (GeneralSpec [] speces) {
    this.speces= speces;	
    }
	public boolean isMatched(Home e) {
	boolean res = true;
	for(GeneralSpec gs:speces) { res = res&&gs.isMatched(e);}
	   return res ;
	}

}
