package Day9.Polymorphism.Method.Overridding;

public class SAMSONG extends MI {
	public void SAMSONG(String a, String b, String C) {
		System.out.println("SAMSONG moblie name is: " + a);
		System.out.println("Ram: " + b);
		System.out.println("Rom: " + C);
	}
	public static void main(String []args) {
		SAMSONG moblie=new SAMSONG();
		moblie.SAMSONG("M13", "4GB", "65GB");
	}

}
