import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String name;
    private String genre;
    private List<Watch> listWatch;

    // Constructor for Movie with name and genre
    public Movie(String name, String genre){
        this.name = name;
        this.genre = genre;
    }

    public void addWatch(Watch w){
        if(listWatch == null){
            listWatch = new ArrayList<Watch>();
        }
    }

    // Setters and getters
    public String getName(){
        return name;
    }
}
