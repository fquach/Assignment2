public class Payroll {

    // No-args Constructor for payroll
    public Payroll(){

    }
    
    public void processPayments(Worker worker){
        System.out.println("Payment processed for " + worker.getName());
    }
}