
public class TeamDriver {
    public static void main(String[] args) {
        Team t = new Team();

        Player p1 = new Player("Jon", false, t);
        Player p2 = new Player("John", true, t);
        Player p3 = new Player("Jonn", true, t);

        System.out.println(t);
    }
}
