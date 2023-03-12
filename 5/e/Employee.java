public class Employee{
	private String name;
	private int hours;

	// Constructor for Employee with name and number of work hours
	public Employee(String name, int hours){
        this.name = name;
        this.hours = hours;
    }

	// Calculates the Employee’s salary based on number of hours
	public double calculateSalary(){
	    return hours*20;
    }

    // Setters and getters
    public int getHours(){
        return hours;
    }
    public String getName(){
        return name;
    }

    public String toString(){
        return name + ", $" + this.calculateSalary(); 
    }
}
