package Day3.Scannerclass;

import java.util.Scanner;
public class importscannerclass {
static void scannerclass1deatils() {
	Scanner vel=new Scanner(System.in);
	System.out.println("Welcome to Scanner class-1");
	System.out.println("How old are you ");
	int age=vel.nextInt();
	System.out.println("Your age is " + age);
	System.out.println("What's your name ");
	String name=vel.next();
	System.out.println("Your name is " + name);
}
public void calculator() {
	int a;
	int b;
	int c;
	Scanner ganesh=new Scanner(System.in);
System.out.println("Welcome to Calculator using Scanner class");
System.out.println("Enter first numeric value is ");
a=ganesh.nextInt();
System.out.println("Enter second numeric value is ");
b=ganesh.nextInt();
c=sum(a,b);
System.out.println("Addion value is " + c);
c=sub(a,b);
System.out.println("Subration value is " + c);
}
private static int sum(int a, int b) {
	int c=a+b;
	return c;
}
private static int sub(int a, int b) {
	int c=a-b;
	return c;
}
public static void main(String []args) {
	importscannerclass a=new importscannerclass();
	a.scannerclass1deatils();
	a.calculator();
}
}
