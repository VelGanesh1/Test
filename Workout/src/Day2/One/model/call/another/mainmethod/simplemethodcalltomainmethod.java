package Day2.One.model.call.another.mainmethod;

public class simplemethodcalltomainmethod {
	int age=29;
	static void address() {
		byte doorno=64;
		String street="Kallathi mudukku street";
		String discrect="Triunelvel";
		String twon="Tirunelveli-Twon";
		String state="Tamil Nadu";
		long pincode=627006;
		
		System.out.println(doorno);
		System.out.println(street);
		System.out.println(discrect);
		System.out.println(twon);
		System.out.println(state);
		System.out.println(pincode);
		
	}
	public void details() {
		System.out.println("Student name is Sankaravel");
	}
	static void employee() {
		System.out.println("Staff employee work in manual testing engineer ");
	}
	private void collegagedetails() {
		System.out.println("College name is FX Engineering college");
	}
	public static void main(String []args) {
		simplemethodcalltomainmethod a=new simplemethodcalltomainmethod();
		a.details();
		//simplemethodcalltomainmethod b=new simplemethodcalltomainmethod();
					//or
		//a.employee();
		simplemethodcalltomainmethod.employee();
		//simplemethodcalltomainmethod b=new simplemethodcalltomainmethod();
		//private method with out declaration main method
		// private method could not use "simplemethodcalltomainmethod.employee();" function
		a.collegagedetails();
		System.out.println(a.age);
		a.address();

	}

}
