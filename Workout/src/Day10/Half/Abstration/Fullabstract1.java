package Day10.Half.Abstration;

public interface Fullabstract1 {
public void college();
public void departmet();
public void toper();
public default void collegedetails() {
	String name="FX";
System.out.println("Wellcome to " + name);	
}
}
