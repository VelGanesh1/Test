package Day8.Polymorphism.Method.Overloading;

public class CompanyDetails {
	public String CompanyDetails (String a) {
		return(a);
	}
public void CompanyDetails (String a, String b, String c) {
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);

}
public long CompanyDetails(long a) {
	System.out.println("Company name is: " + a);
	return(a);
}
//public static void main(String []args) {
//	CompanyDetails a=new CompanyDetails();
//	System.out.println("Company Name:");
//	System.out.println(a.CompanyDetails("HTC Global Service"));
//	System.out.println("Company Location:");
//	System.out.println(a.CompanyDetails("Chennai", "Bangalore", "Mumbai"));
//	System.out.println("Company Phone number:");
//	System.out.println(a.CompanyDetails(8144637828l));
//}
}
