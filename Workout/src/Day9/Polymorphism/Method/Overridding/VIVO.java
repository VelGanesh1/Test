package Day9.Polymorphism.Method.Overridding;

public class VIVO extends SAMSONG{
	public void VIVO(String a, String b, String C) {
		System.out.println("VIVO moblie name is: " + a);
		System.out.println("Ram: " + b);
		System.out.println("Rom: " + C);
	}
	public static void main(String []args) {
		VIVO moblie=new VIVO();
		moblie.VIVO("Z1 Pro", "8GB", "256GB");
	}

}
