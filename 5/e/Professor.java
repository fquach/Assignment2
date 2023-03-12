public class Professor extends Employee{
    private String field;
	
	// Constructor for Professor with name, hours, and field of study
	public Professor(String name, int hours, String field){
	    super(name, hours);
        this.field = field;
    }

	// Calculates the Professor’s salary based on number of hours
	// Different rate from Employee
	@Override
	public double calculateSalary(){
		return this.getHours()*30;
    }
}
