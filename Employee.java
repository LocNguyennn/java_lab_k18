package TH_tuan_2;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName(){
        return this.getFirstName() + " " + this.getLastName();
    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary(){
        return this.getSalary() * 12;
    }

    public int raiseSalary(int percent){
        int result = this.getSalary() + this.getSalary()*percent/100;
        this.setSalary(result);
        return this.getSalary();
    }

    @Override
    public String toString() {
        return "Employee[" +
                "id=" + this.getId() +
                ", firstName='" + this.getFirstName() + '\'' +
                ", lastName='" + this.getLastName() + '\'' +
                ", salary=" + this.getSalary() +
                ']';
    }
}
