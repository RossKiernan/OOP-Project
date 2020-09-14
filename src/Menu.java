import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;  

public class Menu {
	
 	public static void main(String[] args) {
		League league1 = new League();
		ArrayList<Team> teamlist = new ArrayList<Team>();
		ArrayList<Player> playerlist = new ArrayList<Player>();
		ArrayList<Manager> managerlist = new ArrayList<Manager>();
		
		Team team1 = new Team("Red"); 
		Team team2 = new Team("Blue");
		Team teams = new Team("");
		
		
		Name name1 = new Name("James", "Patrick", "Franloe");
		Name name2 = new Name("Mike", "John", "Lenord");
		Manager manager1 = new Manager(name1, "0872941956", "james@gmail.com", "30/10/1950", 9);
		Manager manager2 = new Manager(name2, "0858729271", "mike@gmail.com", "12/07/1972", 6);

		
		Name name3 = new Name("Frank", "Patrick", "Jones");
		Name name4 = new Name("Ben", "James", "O'Neill");
		Name name5 = new Name("Mark", "Matthew", "Smith");
		Name name6 = new Name("Aaron", "Anthony", "Barrett");
		Player player1 = new Player(name3, "0878529122", "Frank@gmail.com", true);
		Player player2 = new Player(name4, "0862516293", "Ben@gmail.com", false);
		Player player3 = new Player(name5, "0218452915", "Mark@gmail.com", false);
		Player player4 = new Player(name6, "0892831512", "Aaron@gmail.com", true);


		System.out.println(team1.addPlayer(player1));
		System.out.println(team1.addPlayer(player2));
		System.out.println(team2.addPlayer(player3));
		System.out.println(team2.addPlayer(player4));
		player1.setGoals(2);
		player2.setGoals(5);
		player3.setGoals(12);
		player4.setGoals(8);
		
		System.out.println(team1.addManager(manager1));
		System.out.println(team1.addManager(manager2));
		System.out.println(team2.addManager(manager2));
		
		System.out.println(league1.addTeam(team1));
		System.out.println(league1.addTeam(team2));
		
		System.out.println(teams.addPlayer(player1));
		System.out.println(teams.addPlayer(player2));
		System.out.println(teams.addPlayer(player3));
		System.out.println(teams.addPlayer(player4));
		teamlist = league1.getTeam();
		league1.print();
		
		int choice = 1;
		Scanner input = new Scanner(System.in); 
		
		
		while( choice > 0 && choice <8) {
			System.out.println("Which would you like \n1. Create Team/Player/Manager or add Player/Manager to a team \n2. Remove a Player \n3. Search for a player and display his goals and his managers details \n4. Display all players for a particular team \n5. Display all teams in a league \n6. Save all information to a text file \n7. Load information from a text file \n8. Quit");
			choice = input.nextInt();
			switch (choice) {
			
			case 1:
				System.out.println("Would you like to 1. Enter A New Player?, 2. Enter A New Manager? or 3. Enter A New Team? ");
				int addChoice = input.nextInt();
				
				if (addChoice == 1) {
					System.out.println("Enter First Name: ");
					String firstName = input.next();
					
					System.out.println("Enter Middle Name: ");
					String middleName = input.next();
					
					System.out.println("Enter Last Name: ");
					String lastName = input.next();
					
			        
					System.out.println("Please Put in the players Phone Number: ");
					String phone = input.next();
					
					
					System.out.println("Please Put in the players Email: ");
					String email = input.next();
					
					System.out.println("Is he a goalie? ");
					boolean goalie = input.nextBoolean();	
					
					System.out.println("What Team is the player on? ");
					String teamname = input.next();
					Team team = new Team(teamname);
					
					
					Name name = new Name(firstName, middleName, lastName);
					Player player = new Player(name, phone, email, goalie);
					teamlist = league1.getTeam();
					
					if(teamname.equals("Red")) {
						team1.addPlayer(player);
						league1.print();
					}
					if(teamname.equals("Blue")) {
						team2.addPlayer(player);
						league1.print();
					}
					
					else {
						team.addPlayer(player);
						team.print();
					}
					break;
					
				}
				if (addChoice == 2) {
					System.out.println("Enter First Name: ");
					String firstName = input.next();
					input.nextLine();
					
					System.out.println("Enter Middle Name: ");
					String middleName = input.next();
					input.nextLine();
					
					System.out.println("Enter Last Name: ");
					String lastName = input.next();
					input.nextLine();
			        
					System.out.println("Please Put in the players Phone Number: ");
					String phone = input.next();
					input.nextLine();
					
					System.out.println("Please Put in the players Email: ");
					String email = input.next();
					
					System.out.println("Please Put in the Date of Birth: ");
					String dateofbirth = input.next();
					
					System.out.println("Please Put in the Star Rating: ");
					int starrating = input.nextInt();
					
					System.out.println("What Team is the player on? ");
					String teamname = input.next();
					
					
					Name name = new Name(firstName, middleName, lastName);
					Manager manager = new Manager(name, phone, email, dateofbirth, starrating);
					Team team = new Team(teamname);
					league1.addTeam(team);
					teamlist = league1.getTeam();
					
					if(teamname.equals("Red")) {
						team1.addManager(manager);
						league1.print();
							
					}
					if(teamname.equals("Blue")) {
						team2.addManager(manager);
						league1.print();
					}
					
					else {
						team.addManager(manager);
						team.print();
					}
					
					break;
			
				}
				if (addChoice == 3) {
					System.out.println("Enter Team Colour: ");
					String colour = input.next();
					Team team = new Team(colour);
					league1.addTeam(team);
					league1.print();
					teamlist = league1.getTeam();
					
					break;
	
				}
				else {
					break;
				}
				
			case 2:
				System.out.println("Which team would you like to delete from team 1 or team 2? ");
				int teamchoice = input.nextInt();
				
				
				if(teamchoice == 1) {
					team1.print();
					System.out.println("Please Pick The number of the row the Player is in to delete (starting at 0): ");
					int team1choice = input.nextInt();
					
					
					team1.removePlayer(team1choice);
					
					team1.print();
					break;
				}
				if(teamchoice == 2) {
					team2.print();
					System.out.println("Please Pick The number of the row the Player is in to delete (starting at 0): ");
					int team2choice = input.nextInt();
					
					
					team2.removePlayer(team2choice);
					
					team2.print();
					break;
				}
			case 3:
				System.out.println("Enter First Name: ");
				String firstName = input.next();
				input.nextLine();
				
				System.out.println("Enter Middle Name: ");
				String middleName = input.next();
				
				System.out.println("Enter Last Name: ");
				String lastName = input.next();
				
				teamlist = league1.getTeam();
				for(int i = 0; i < teamlist.size(); i++) {
					Team team = teamlist.get(i);
					playerlist = team.getPlayers();
					for(int p = 0; p < playerlist.size(); p++) {
						Player player = playerlist.get(p);
						String fname = (player.getName()).getFirstname();
						String mname = (player.getName()).getMiddlename();
						String lname = (player.getName()).getLastname();
						if(firstName.equals(fname) && middleName.equals(mname) && lastName.equals(lname)) {
							System.out.println("Goals: " + player.getGoals());
							managerlist = team.getManager();
							Manager manager = managerlist.get(0);
							manager.print();
						}
					}
				}
				break;
				
				
			case 4:
				System.out.println("Which team would you like to View? ");
				String teamname = input.next();
				Team team = new Team(teamname);
				league1.addTeam(team);
				teamlist = league1.getTeam();
				
				if(teamname.equals("Red")) {
					team1.print();
						
				}
				if(teamname.equals("Blue")) {
					team2.print();
				}
				
				else {
					team.print();
				}
				
				break;
				
				
			case 5:
				league1.print();
				break;
				
			case 6:
				try { 
					 FileWriter fw = new FileWriter("C:\\Users\\rossk\\Downloads\\SavedData.txt");    
			           fw.write("Welcome." + league1 + "\n" + team1 + "\n" + team2 + "\n");    
			           fw.close();    
			          }catch(Exception e){System.out.println(e);}    
			          System.out.println("Success...");    
			          {   
			}  
			case 7:
			{
			
			}
			case 8:
				System.out.println("Program Ended");
			break;
					
				
		}
				
				
						
				
	
			
		}
 	}
}



