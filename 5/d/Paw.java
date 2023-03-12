public class Paw {
    private int position;
	private Dog dog;

	// Constructor for paw, given position number and Dog
	public Paw(int pos, Dog dog){
		position = pos;
		this.dog = dog;
        this.dog.addPaw(this);
    }
}
