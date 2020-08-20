public class Person {
	//person attributes
	String personName;
	String telNumber;
	String personEmail;
	String personAddress;
	
	//Person class constructor
	public Person(String personName, String telNumber, String personEmail,String personAddress){
		this.personName = personName;
		this.telNumber = telNumber;
		this.personEmail = personEmail;
		this.personAddress = personAddress;
	}
	
	 //methods
	 public void setTelNumbers( String telNumber){
		 this.telNumber = telNumber;
	 }
	 
	 public void setTersonEmail( String personEmail){
		 this.personEmail = personEmail;
	 }
	 
	 public void setPersonAddress( String personAddress){
		 this.personAddress = personAddress;
	 }
	
	public String getPersonName() {
	      return personName;
	 }
	
	
	//method toString
	public String toString() {
		return toStringMethod();
	     
	 }

	private String toStringMethod() {
		String output = "\nPerson Name:\t\t" + personName;
	    output += "\nTelephone Number:\t" + telNumber;
	    output += "\nEmail Address:\t\t" + personEmail;
	    output += "\nPhysical Address:\t" + personAddress;
	    output += "\n";
	    return output;
	}

}
