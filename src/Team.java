import java.util.ArrayList;

public class Team {
	
	private String colour;
	private ArrayList<Player> players;
	private ArrayList<Manager> managers;
	
	public Team(String colour) {
		players = new ArrayList<Player>();
		managers = new ArrayList<Manager>(1);
		this.colour = colour;
	}
	
	public boolean addPlayer(Player player) {
		players.add(player);
		return true;
	}
	public void removePlayer(int player) {
		players.remove(player);
	}
	
	public boolean addManager(Manager manager) {
		int retval = managers.size();
		if(retval == 0) {
			managers.add(manager);
		 }
		else { 
			System.out.println("ERROR, Enter One Manager Only!");
		}
		return true;
	}
	
	public void removeManager(Manager manager) {
		managers.remove(manager);
	}
    
	public String getColour() {
		return colour;
	}
    
	public void setColour(String colour) {
		this.colour = colour;
		
	}
	
	public String toString() {
		return "Manager: " + managers + "\nColour: " + colour + "\nPlayers: ";  
	}
	
	public void print() {
		System.out.println(toString());
		for (int i = 0; i < players.size(); i++) {
			System.out.println(players.get(i));
		};
		System.out.println("");
	}

	public ArrayList<Player> getPlayers() {
		return players;
	}

	public ArrayList<Manager> getManager() {
		return managers;
	}

	
}
