package Day11.IF.Control.Statements;

import java.util.Scanner;
public class IfElseclass {
	public static void main(String[]args) {
	Scanner a=new Scanner(System.in);
	System.out.println("Welcom to Amazon");
	System.out.println("Enter User Name");
	String Username=a.nextLine();
	String[] Userid={"Vel","Ganesh","Sankar"};
	if (Username.equals(Userid[0])) {
		System.out.println("Your User name is correct:- " + Username);
	}
	else if(Username.equals(Userid[1])){
		System.out.println("Your User name is correct:- " + Username);		
	}
	else if(Username.equals(Userid[2])){
		System.out.println("Your User name is correct:- " + Username);		
	}
	else {
		System.out.println("Your user name is incorrect");
		return;
	}
	//break;
	System.out.println("Enter Password");
	String Password=a.nextLine();
	String[] UserPWD={"1to0&atoz","abcd","pqrs"};
	if (Password.equals(UserPWD[0])) {
		System.out.println("Your Password is correct");
	}
	else if(Password.equals(UserPWD[1])) {
		System.out.println("Your Password is correct");
	}
	else if(Password.equals(UserPWD[2])) {
		System.out.println("Your Password is correct");
	}
	else {
		System.out.println("Your Password is incorrect");
		return;
	}
	System.out.println("Moblie brands");
	String Mobile=a.nextLine();
	String[] Phone= {"MI","Samsong","VIVO","OnePlus","APPLE","GOOGLE"};
	if (Mobile.equals(Phone[0])) {
		String model="MI A1";
		String ram="8GB";
		String storage="64GB";
		System.out.println("MI Moblie modle:- " + model);
		System.out.println("MI A1 Ram size:- " + ram);
		System.out.println("MI A1 Storeage size:- " + storage);
	}
	else if (Mobile.equals(Phone[1])) {
		String model="M13";
		String ram="12GB";
		String storage="64GB";
		System.out.println("Samsong Moblie modle:- " + model);
		System.out.println("Samsong M13 Ram size:- " + ram);
		System.out.println("Samsong M13 Storeage size:- " + storage);
	}
	else if (Mobile.equals(Phone[2])) {
		String model="Z1 Pro";
		String ram="12GB";
		String storage="128GB";
		System.out.println("VIVO Moblie modle:- " + model);
		System.out.println("VIVO Z1 Pro Ram size:- " + ram);
		System.out.println("VIVO Z1 Pro Storeage size:- " + storage);
	}
	else if (Mobile.equals(Phone[3])) {
		String model="10T";
		String ram="12BG";
		String storage="256GB";
		System.out.println("OnePlus Moblie modle:- " + model);
		System.out.println("OnePlus 10T Ram size:- " + ram);
		System.out.println("OnePlus 10T Storeage size:- " + storage);
	}
	else if (Mobile.equals(Phone[4])) {
		String model="13 Pro";
		String ram="12BG";
		String storage="256GB";
		System.out.println("APPLE Moblie modle:- " + model);
		System.out.println("APPLE 13 Pro Ram size:- " + ram);
		System.out.println("APPLE 13 Pro Storeage size:- " + storage);
	}
	else if (Mobile.equals(Phone[5])) {
		String model="Pixel 6 Pro";
		String ram="12BG";
		String storage="256GB";
		System.out.println("GOOGLE Moblie modle:- " + model);
		System.out.println("GOOGLE Pixel 6 Pro Ram size:- " + ram);
		System.out.println("GOOGLE Pixel 6 Pro Storeage size:- " + storage);
	}
	else {
		System.out.println("Out of Stock");
	}
}
}