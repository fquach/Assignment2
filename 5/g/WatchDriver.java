import java.util.ArrayList;
import java.util.List;

public class WatchDriver {
    public static void main(String[] args) {
        Person p1 = new Person("Luigi");
        Person p2 = new Person("Toad");

        Movie m1 = new Movie("Finding Nemo", "Adventure");
        Movie m2 = new Movie("Finding Dory", "Adventure");
        Movie m3 = new Movie("Indiana Jones", "Adventure");

        List<Watch> listWatches = new ArrayList<Watch>();
        listWatches.add(new Watch(10, p1, m1));
        listWatches.add(new Watch(10, p2, m3));
        listWatches.add(new Watch(10, p1, m2));
        listWatches.add(new Watch(10, p2, m2));

        for(Watch watch:listWatches){
            System.out.println(watch);
        }
    }
}
