package CoreJavaTraing;

public class StaticConcept {
	String Name;
     String Address;
	static String City="Mumbai";
 StaticConcept(String name,String Address)
	 {
		this.Name=name;
		this.Address=Address;
		// System.out.println("Amit");
	 }
 public void getadress()
 {
	 System.out.println(Address+" "+City);

	
 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticConcept s=new StaticConcept("Ankit","Nerul");
		StaticConcept s1=new StaticConcept("Ankit","Vashi");
		StaticConcept s2=new StaticConcept("Ankit","Belapur");
        s.getadress();
        s1.getadress();
        s2.getadress();
        
       // If address is same then we can use static varaible so need to intianlize again and again
        // Static variable we can assign directly through static keyword in the class lavel.
	}

}
