package lab3;

public class GiangVienThinhGiang extends GiangVien{
    protected int phoneNum;
    protected String workPlace;

    public int getPhoneNum() {
        return phoneNum;
    }

    public GiangVienThinhGiang() {
    }

    public GiangVienThinhGiang(String name, String email, String address, int hoursInMonth, int phoneNum, String workPlace) {
        super(name, email, address, hoursInMonth);
        this.phoneNum = phoneNum;
        this.workPlace = workPlace;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    @Override
    public float totalSalary() {
        float result = 200000*super.getHoursInMonth();
        return result;
    }

    @Override
    public String toString() {
        return "GiangVienThinhGiang{" +
                "ten='" + name + '\'' +
                ", email ='" + email + '\'' +
                ", dia chi ='" + address + '\'' +
                ", so gio giang day trong thang =" + HoursInMonth +
                ", so dien thoai =" + phoneNum +
                ", noi lam viec ='" + workPlace + '\'' +
                '}';
    }
}
