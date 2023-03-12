import java.util.ArrayList;
import java.util.List;

public class Team{
	private int code;
	private List<Player> listPlayers;

	// Constructor for a default Team instance
	public Team(){
		code = 111;
		listPlayers = new ArrayList<Player>();
    }

    public void addPlayer(Player p){
        listPlayers.add(p);
    }

    // Setters and getters
    public int getCode(){
        return code;
    }
    public int getSize(){
        return listPlayers.size();
    }

    @Override
    public String toString(){
        String str = code + "\n";

        for(Player player:listPlayers){
            str = str + player.getName() + ", " + player.getExpert() + "\n";
        }

        return str;
    }
}
