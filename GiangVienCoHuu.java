package lab3;

import java.text.NumberFormat;

public class GiangVienCoHuu extends GiangVien {
    protected int basicSalary;
    protected int requiredHours;

    public GiangVienCoHuu(String name, String email, String address, int hoursInMonth, int basicSalary, int requiredHours) {
        super(name, email, address, hoursInMonth);
        this.basicSalary = basicSalary;
        this.requiredHours = requiredHours;
    }

    public GiangVienCoHuu() {
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int getRequiredHours() {
        return requiredHours;
    }

    public void setRequiredHours(int requiredHours) {
        this.requiredHours = requiredHours;
    }

    @Override
    public float totalSalary() {
        float salaryPerHour = basicSalary / requiredHours;
        float result = basicSalary +
                ((super.getHoursInMonth() > requiredHours) ? salaryPerHour*(super.getHoursInMonth()-requiredHours) : 0);
        return result;
    }

    @Override
    public String toString() {
        return "GiangVienCoHuu{" +
                "Ten='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dia chi='" + address + '\'' +
                ", So gio giang day trong thang=" + HoursInMonth +
                ", luong co ban=" + NumberFormat.getInstance().format(basicSalary) +
                ", so gio yeu cau=" + requiredHours +
                '}';
    }
}
