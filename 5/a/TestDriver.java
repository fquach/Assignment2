public class TestDriver{
    public static void main(String[] args){
        Transcript t = new Transcript("CS1400", 3);
        Student s = new Student("Jon",t);

        System.out.println(s);
    }
}