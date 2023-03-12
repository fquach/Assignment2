public class Course{
	private int code;
	private Book book;
	
	// Constructor for Course, given code and Book
	public Course(int code, Book book){
		this.code = code;
		this.book = book;
    }

    @Override
    public String toString(){
        return code + ", " + book.toString();
    }
}
