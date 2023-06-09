import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private List<Watch> listWatch;
    
    // Constructor for Person with name
    public Person(String name){
        this.name = name;
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