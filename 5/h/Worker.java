public class Worker {
    private String name;
    private double hourlyRate;
    private int hours;

    // Constructor for Worker with name and hourly rate
    public Worker(String name, double rate, int hours){
        this.name = name;
        hourlyRate = rate;
        this.hours = hours;
    }

    // Setters and getters
    public double getRate(){
        return hourlyRate;
    }
    public int getHours(){
        return hours;
    }
    public String getName(){
        return name;
    }
}
