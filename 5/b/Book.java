public class Book{
	private String name;
	private String author;
	private Course course;
	
	// Constructor for default Book object
	public Book(){
		name = "Default";
		author = "Default";
		course = null;
    }

    // Setters and getters
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAuthor(){
        return this.author;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    @Override
    public String toString(){
        return name + " by " + author;
    }
}

