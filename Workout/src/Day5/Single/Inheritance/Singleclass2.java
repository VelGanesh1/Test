package Day5.Single.Inheritance;

public class Singleclass2 extends Singleclass1 {
	void CompanyDetails() {
		String CompanyName="HTC Global Services";
		String CompanyAdress="Vandalor, Chennai";
		String CompanyEmailID="htcvandalor@htcinc.com";
		
		System.out.println("Company Name:- " + CompanyName);
		System.out.println("Company Address:- " + CompanyAdress);
		System.out.println("Company EmailID:- " + CompanyEmailID);
	}

	public static void main (String []args) {
	
		Singleclass2 details = new Singleclass2();
		System.out.println("Employee Details");
		details.employeedetails();
		System.out.println("Company Details");
		details.CompanyDetails();
	}
}
