package lab3;

public abstract class GiangVien {
    protected String name,email,address;
    protected int HoursInMonth; // so gio day moi thang

    public String getName() {
        return name;
    }

    public GiangVien() {
    }

    public GiangVien(String name, String email, String address, int hoursInMonth) {
        this.name = name;
        this.email = email;
        this.address = address;
        HoursInMonth = hoursInMonth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public int getHoursInMonth() {
        return HoursInMonth;
    }

    public void setHoursInMonth(int hoursInMonth) {
        HoursInMonth = hoursInMonth;
    }

    public abstract float totalSalary();
}
