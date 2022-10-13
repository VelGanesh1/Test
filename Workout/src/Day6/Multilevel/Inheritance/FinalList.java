package Day6.Multilevel.Inheritance;

public class FinalList extends Volleyball{
	public void CollegeEvents() {
		System.out.println("FX College Sports Events");
	}

	public static void main(String []args) {
		FinalList a=new FinalList();
		a.CollegeEvents();
		a.collegesportsevent();
		a.CricketTeam();
		a.FootballTeam();
		a.VolleyballTeam();
	}
}
