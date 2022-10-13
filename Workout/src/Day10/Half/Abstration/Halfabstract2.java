package Day10.Half.Abstration;

public class Halfabstract2 extends Halfabstract1{
public void college() {
	String collegename="FX Engineering college";
	System.out.println("College name:- " + collegename);
}
public void department() {
	String Department1="CSE";
	String Department2="ECE";
	String Department3="EEE";
	String Department4="Mech";
	String Department5="IT";
	System.out.println("1st Department:- " + Department1);
	System.out.println("2nd Department:- " + Department2);
	System.out.println("3rd Department:- " + Department3);
	System.out.println("4th Department:- " + Department4);
	System.out.println("5th Department:- " + Department5);
}
public void student() {
	String csestudentname="Vel";
	String ecestudentname="Ganesh";
	String eeestudentname="Sankar";
	String mechstudentname="Ram";
	String itstudentname="Kumar";
	System.out.println("CSE top student name:- " + csestudentname);
	System.out.println("ECE top student name:- " + ecestudentname);
	System.out.println("EEE top student name:- " + eeestudentname);
	System.out.println("MECH top student name:- " + mechstudentname);
	System.out.println("IT top student name:- " + itstudentname);
}
public static void maing(String []args) {
	Halfabstract2 a=new Halfabstract2();
	a.college();
	a.department();
	a.student();
}
}
