public class Transcript{
	private String course;
	private double grade;

	// Constructor for a Transcript, given course, grade
	public Transcript(String course, double grade){
        this.course = course;
        this.grade = grade;
    }

	public String getCourse(){
		return this.course;
	}
	public double getGrade(){
		return this.grade;
	}
}
