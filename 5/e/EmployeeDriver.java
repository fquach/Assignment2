import javax.sound.midi.SysexMessage;

public class EmployeeDriver {
    public static void main(String[] args) {
        Employee e1 = new Employee("John", 60);
        Staff e2 = new Staff("Jon", 60, 20);
        Professor e3 = new Professor("Dude", 60, "Math");

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}
