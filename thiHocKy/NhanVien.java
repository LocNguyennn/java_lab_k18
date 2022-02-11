package thiHocKy;

public class NhanVien {
    private static int count = 0;
    private int msnv, age;
    private String name,phongBan;

    public NhanVien(String name, String phongBan, int age){
        this.msnv = count++;
        this.name = name;
        this.phongBan = phongBan;
        this.age = age;
    }
    public static void setCount(int count) throws Exception{
        if(Integer.toString(count).matches("\\d{7}") == false)
            throw new Exception("MSNV la so nguyen co 7 so");
        NhanVien.count = count;
    }

    public void setAge(int age){this.age = age;}
    public void setName(String name ){this.name = name;}
    public void setPhongBan(String phongBan){this.phongBan = phongBan;}

    public int getMsnv(){
        return msnv;
    }
    public String getPhongBan(){
        return phongBan;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "msnv=" + msnv +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", phongBan='" + phongBan + '\'' +
                '}';
    }
}
