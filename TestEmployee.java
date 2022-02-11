package TH_tuan_2;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee(18,"Nguyen","A",12000000);
        System.out.println(e1);
        System.out.println("Name of employer 1: "+ e1.getName());
        System.out.println("Annual Salary of employer 1: "+ e1.getAnnualSalary());
        System.out.println("Salary of employer 1 after being raised: "+ e1.raiseSalary(3));
        System.out.println("Annual Salary of employer 1 ( after being raised ): "+ e1.getAnnualSalary());

    }
}
