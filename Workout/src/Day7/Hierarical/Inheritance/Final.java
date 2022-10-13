package Day7.Hierarical.Inheritance;

import java.util.Scanner;
class Final implements Parent, Child1, Child2, Child3, Child4{
	void facebooklogin() {
		System.out.println("Facebook login");
	}
	public static void main(String []args) {
		Final vel=new Final();
		vel.facebooklogin();
		vel.Facebook();
		Scanner getinput=new Scanner(System.in);
		System.out.println("Enter the User Name is: ");
		String username=getinput.next();
		System.out.println("User name: " + username);
		System.out.println("Enter the Password is: ");
		String password=getinput.next();
		System.out.println("User password: " + password);
		vel.LoginWindow();
		vel.homescreen();
		System.out.println("Option 1st: ");
		String messages=getinput.next();
		System.out.println("Options First: " + messages);
		System.out.println("Options 2nd: ");
		String reels=getinput.next();
		System.out.println("Option Sceound :" + reels);
		System.out.println("Options 3rd: ");
		String entertainment=getinput.next();
		System.out.println("Option thried is: " + entertainment );
		vel.reelswindow();
		vel.messageswindow();
	}
}
