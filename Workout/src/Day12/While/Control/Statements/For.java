package Day12.While.Control.Statements;

public class For {
	public static void main(String[]args) {
		String[] name= {"Sankar","Vel"};
		int[] age= {28,29};
		//for(String i:name)
		for(int i=0; i<name.length; i++)
		{
			String d=name[i];
			System.out.println(d);
		}
		for(int j:age) 
		{
			System.out.println(j);
		}
	}
}
