public class Student{
	private String name;
    private Transcript transcript;

    // Constructor for a Student, given name and associated Transcript
    public Student(String name, Transcript t){
        this.name = name;
        transcript = t;
    }

    @Override
    public String toString(){
        return name + ", " + transcript.getCourse() + ", " + transcript.getGrade();
    }
}
