package TH_tuan_3;

public class Employee extends Human{
    private int WeekSalary;
    private int WorkHourPerDay;

    public Employee() {
    }

    public int getWeekSalary() {
        return WeekSalary;
    }

    public void setWeekSalary(int weekSalary) {
        try{
            if(!(weekSalary >= 1 && weekSalary <=12))
                throw new Exception("Error: WeekSalary is too low");
            WeekSalary = weekSalary;
        }catch(Exception e){
            e.getMessage();
        }

    }

    public int getWorkHourPerDay() {
        return WorkHourPerDay;
    }

    public void setWorkHourPerDay(int workHourPerDay) {
        try{
            if(!(workHourPerDay >=1 && workHourPerDay <=12))
                throw new Exception("Error: Invalid WorkHoursPerDay");
            WorkHourPerDay = workHourPerDay;
        }catch (Exception e){
            e.getMessage();
        }

    }
}
