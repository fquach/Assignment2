public class Student{

	private String name;
	private String major;
	private double gpa;

	public Student(){
		this.name = "default";
		this.major = "default";
		this.gpa = 0.0;
	}

	public Student(String name, String major){
		this.name = name;
		this.major = major;
		this.gpa = 0.0;
	}

	public Student(String name, String major, double gpa){
		this.name = name;
		this.major = major;
		this.gpa = gpa;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getMajor(){
		return major;
	}

	public void setMajor(String major){
		this.major = major;
	}

	public double getGPA(){
		return gpa;
	}

	public void setGPA(double gpa){
		this.gpa = gpa;
	}

	public String toString(){
		return this.name + ", " + this.major + ", " + this.gpa;
	}

	public boolean equals(Student student){
		return this.name.equals(student.getName()) && this.major.equals(student.getMajor());
	}
}

