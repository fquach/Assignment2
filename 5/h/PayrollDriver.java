public class PayrollDriver {
    public static void main(String[] args) {
        Payroll payroll = new Payroll();
        Worker ted = new Worker("Ted", 15, 60);
        payroll.processPayments(ted);
    }
}
