public class Staff extends Employee{
    private int role;

	// Constructor for Staff with name, hours, and role
	public Staff(String name, int hours, int role){
		super(name, hours);
		this.role = role;
    }

}
