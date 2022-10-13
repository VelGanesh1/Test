package Day7.Hierarical.Inheritance;

//import java.util.Scanner;
interface Child2 {
	default void homescreen() {
		System.out.println("Welcome to VelGanesh Facebook");
		String messages;
		String reels;
		String entertainment;
	}
// if multiple scanner present then only import jave.util.Scanner command using main methods only
// Do not user multiple public static void main(String [] args)
//	public static void main(String []args) {
//		Scanner options=new Scanner(System.in);
//		String messages=options.next();
//		String reels=options.next();
//		String entertainment=options.next();
//	}
}
