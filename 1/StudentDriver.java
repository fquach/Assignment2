
public class StudentDriver{
	public static void main(String[] args){
		Student student1 = new Student("John","CS",3.5);
		Student student2 = new Student();
		student2.setName("Mary Ann");
		student2.setMajor("CE");
		student2.setGPA(3.3);

		System.out.println(student1.toString());
		System.out.println(student2.toString());
	}
}