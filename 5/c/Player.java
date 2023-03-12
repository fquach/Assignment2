public class Player {
    private String name;
	private boolean expert;
	private Team team;

	// Constructor for a Player, given their name, whether they are an expert, and the team they play for
	public Player(String name, boolean expert, Team team){
		this.name = name;
		this.expert = expert;
		this.team = team;
        this.team.addPlayer(this);
	}

    // Setters and getters
    public String getName(){
        return name;
    }
    public boolean getExpert(){
        return expert;
    }
}
