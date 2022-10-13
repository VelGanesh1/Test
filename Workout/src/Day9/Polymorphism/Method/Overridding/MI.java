package Day9.Polymorphism.Method.Overridding;

public class MI extends Amazon{
	public void MI(String a, String b, String C) {
		System.out.println("MI moblie name is: " + a);
		System.out.println("Ram: " + b);
		System.out.println("Rom: " + C);
	}
	public static void main(String []args) {
		MI moblie=new MI();
		moblie.MI("A2", "6GB", "128GB");
	}

}
