public class Player extends Person {
	
	private int goals;
	private boolean goalie;
	
	public Player(Name name, String phone, String email, boolean goalie) {
		super(name, phone, email);
		this.goalie = goalie;
	}
	
	public void setGoals(int goals) {
		this.goals = goals;
	}
	
	public int getGoals() {
		return goals;
	}
	
	public void setGoalie(boolean goalie) {
		this.goalie = goalie;
	}
	
	public boolean getGoalie() {
		return goalie;
	}
	
	public String toString() {
		return getName() + ", " + getPhone() + ", " + getEmail() + ", " + goalie + ", " + goals;
	}
	
	public void print() {
		System.out.println(toString());
	}

}
