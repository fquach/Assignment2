import java.util.ArrayList;
import java.util.List;

public class Dog{
	private String breed;
	private String name;
	private List<Paw> listPaws;

	// Constructor for default Dog without arguments
	public Dog(){
		breed = "Default";
        name = "Default";
        listPaws = new ArrayList<Paw>();
    }

    public void addPaw(Paw paw){
        if (listPaws.size() < 4){
            listPaws.add(paw);
        } else {
            System.out.println("Mutant pup alert! Could not add 5th paw.");
        }
    }

    // Setters and getters
    public void setBreed(String breed){
        this.breed = breed;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getNumPaws(){
        return listPaws.size();
    }

    public String toString(){
        return name + " the " + breed + " has " + this.getNumPaws() + " paws";
    }
}
