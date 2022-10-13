package Day9.Polymorphism.Method.Overridding;

public class Amazon {
public void NewMoblieList(String a, String b, String C) {
	System.out.println("Moblie 1st: " + a);
	System.out.println("Moblie 2nd: " + b);
	System.out.println("Moblie 3rd: " + C);
}
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
	Amazon moblie=new Amazon();
 	moblie.MI("A1", "4GB", "64GB");
	moblie.SAMSONG("M3", "2GB", "32GB");
	moblie.VIVO("Z1", "6GB", "128GB");
}
}
//Mehtod overridding didn't use inheritance method
//interface  Amazon {
//	default void NewMoblieList(String a, String b, String C) {
//	System.out.println("Moblie 1st: " + a);
//	System.out.println("Moblie 2nd: " + b);
//	System.out.println("Moblie 3rd: " + C);
//}
//default void MI(String a, String b, String C) {
//	System.out.println("MI moblie name is: " + a);
//	System.out.println("Ram: " + b);
//	System.out.println("Rom: " + C);
//}
//default void SAMSONG(String a, String b, String C) {
//	System.out.println("SAMSONG moblie name is: " + a);
//	System.out.println("Ram: " + b);
//	System.out.println("Rom: " + C);
//}
//default void VIVO(String a, String b, String C) {
//	System.out.println("VIVO moblie name is: " + a);
//	System.out.println("Ram: " + b);
//	System.out.println("Rom: " + C);
//}
//public static void main(String []args) {
//	Amazon mobile = new Amazon();
//	Amazon moblie=new Amazon();
// 	moblie.MI("A1", "4GB", "64GB");
//	moblie.SAMSONG("M3", "2GB", "32GB");
//	moblie.VIVO("Z1", "6GB", "128GB");
//}
//}	
