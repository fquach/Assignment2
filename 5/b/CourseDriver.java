public class CourseDriver{
    public static void main(String[] args) {
        Book b = new Book();
        b.setAuthor("John Doe");
        b.setName("Unordinary");

        Course c = new Course(111, b);
        System.out.println(c);
    }
}