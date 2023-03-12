public class Watch {
    private int rating;

    private Person person;
    private Movie movie;

    // Constructor for a person that Watches a movie
    public Watch(int rating, Person p, Movie m){
        this.rating = rating;

        person = p;
        movie = m;
        p.addWatch(this);
        m.addWatch(this);
    }

    @Override
    public String toString(){
        return person.getName() + " watched " + movie.getName();
    }
}
