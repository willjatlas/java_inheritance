package Staff;

public abstract class Employee {

    private String name;
    private String nINumber;
    private double salary;

    public Employee(String name, String nINumber, double salary){
        this.name     = name;
        this.nINumber = nINumber;
        this.salary   = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!"".equals(name)) this.name = name;
    }

    public String getnINumber() {
        return nINumber;
    }

    public void setnINumber(String nINumber) {
        this.nINumber = nINumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double amount){
        salary += Math.abs(amount);
    }

    public double payBonus(){
        return salary * 0.01;
    }

}
