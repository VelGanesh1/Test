package Day9.Polymorphism.Method.Overridding;

public class BastMoblieList extends VIVO{
	public void MI(String a, String b, String C) {
		System.out.println("MI moblie name is: " + a);
		System.out.println("Ram: " + b);
		System.out.println("Rom: " + C);
	}
	public void SAMSONG(String a, String b, String C) {
		System.out.println("SAMSONG moblie name is: " + a);
		System.out.println("Ram: " + b);
		System.out.println("Rom: " + C);
	}
	public void VIVO(String a, String b, String C) {
		System.out.println("VIVO moblie name is: " + a);
		System.out.println("Ram: " + b);
		System.out.println("Rom: " + C);
	}
	public static void main(String []args) {
		BastMoblieList moblie=new BastMoblieList();
		moblie.NewMoblieList("MI", "SAMSONG", "VIVO");
		moblie.MI("A3", "8GB", "256GB");
		moblie.SAMSONG("M35", "8GB", "128GB");
		moblie.VIVO("Z1 Pro Max", "18GB", "526GB");	
	}

}
