package Day8.Polymorphism.Method.Overloading;

public class EmployeeDetails extends CompanyDetails {
//public class EmployeeDetails {
	public void employeeid(long i) {
		System.out.println("Employee ID: " + i);
	}
	public void employeename(String i) {
		System.out.println("Employee Name: " + i);
	}
	public void phoneno(long i) {
		System.out.println("Employee Phone number: " + i);
	}
	public static void main (String [] args) {
		EmployeeDetails a=new EmployeeDetails();
		System.out.println("Company Name:");
		System.out.println(a.CompanyDetails("HTC Global Service"));
		//System.out.println(a.CompanyDetails("Chennai", "Bangalore", "Mumbai"));
		System.out.println("Company Phone number:");
		System.out.println(a.CompanyDetails(8144637828l));
		System.out.println("Company Location:");
					//or
		
//		System.out.println("Company Name");
//		a.CompanyDetails("HTC");
//		System.out.println("Company Location:");
		a.CompanyDetails("Chennai", "Bangalore", "Mumbai");
//		System.out.println("Company Phone number:");
//		a.CompanyDetails(8144637828l);
		
		a.employeeid(16665);
		a.employeename("Sankaravel");
		a.phoneno(8144637828l);
	}
}
